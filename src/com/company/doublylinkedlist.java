package com.company;

public class doublylinkedlist<E extends Comparable<E>>
{
    // Nodes for the first and last element
    Node head;
    Node tail;

    // list size
    int length;

    public doublylinkedlist()
    {
        this.length = 0;
    }

    // add function that inserts elements sorted
    public void add(E value)
    {
        // first insert
        if (length==0)
        {
            head = new Node(value, null, null);
            tail = head;
            length++;
            return;
        }
        else
        {
            if (value.compareTo(head.getValue()) < 0)
            {
                // insert before head, make new head
                // set next to head, previous to null
                Node newNode = new Node(value, head, null);
                // point old head previous to new node
                head.setPrevious(newNode);
                // make new node head
                head = newNode;
                length++;
                return;
            }
            else
            {
                Node current = head.getNext();
                while (current != null)
                {
                    if (value.compareTo(current.getValue()) <= 0)
                    {
                        // insert before current
                        // make new nodes next = current, previous = current.previous
                        Node newNode = new Node(value, current, current.getPrevious());
                        // point node before insert's next to newnode
                        current.getPrevious().setNext(newNode);
                        // make new node previous to current
                        current.setPrevious(newNode);
                        length++;
                        return;
                    }
                    current = current.getNext();
                }

                // add to tail
                Node newNode = new Node(value, null, tail);
                tail.setNext(newNode);
                tail = newNode;
                length++;
                return;
            }
        }
    }

    public void remove(E value)
    {
        Node found = find(value);
        if (found != null)
        // node exists
        {
            // check for head
            if (found.getPrevious() == null)
            {
                found.getNext().setPrevious(null);
                head = found.getNext();
            }
            else
            {
                // check for tail
                if (found.getNext() == null)
                {
                    found.getPrevious().setNext(null);
                    tail = found.getPrevious();
                }
                else
                {
                    // fix pointers
                    found.getPrevious().setNext(found.getNext());
                    found.getNext().setPrevious(found.getPrevious());
                }
            }
            length--;
        }
    }

    // private method to find node based on value
    // used by remove() and contains()
    // If using complex objects, you will
    // have to override equals to search by
    // a single member field
    private Node find(E value)
    {
        Node current = head;
        while (current != null)
        {
            if (current.getValue().equals(value)) return current;
            current = current.getNext();
        }
        return null;
    }

    public boolean contains(E value)
    {
        Node found = find(value);
        if (found == null) return false;
        return true;
    }

    public E get(int index)
    {
        if (index < length)
        {
            Node current = head;
            for (int i = 0; i < length; i++)
            {
                if (i == index) return current.getValue();
                current = current.getNext();
            }
            return null;
        }
        return null;
    }

    public E getFirst()
    {
        return head.getValue();
    }

    public E getLast()
    {
        return tail.getValue();
    }

    public String toString()
    {
        String result = "";
        Node current = head;
        result += "Count = " + length + "\n";
        while (current != null)
        {
            result += "" + current.getValue().toString() + "\n";
            current = current.getNext();
        }
        return result;
    }

    public String toStringDescending()
    {
        String result = "";
        Node current = tail;
        result += "Count = " + length + "\n";
        while (current != null)
        {
            result += "" + current.getValue().toString() + "\n";
            current = current.getPrevious();
        }
        return result;

    }

    // recursive display functions
    public String toStringRecursive()
    {
        return "Count = " + length + "\n" + toStringRecursive(head);
    }

    public String toStringRecursive(Node node)
    {
        if (node==null) return "";
        String retval = node.getValue().toString() + "\n";
        return retval + toStringRecursive(node.getNext());
    }

    // inner class for nodes
    class Node
    {
        private E value;
        private Node next;
        private Node previous;

        public Node(E value, Node next, Node previous)
        {
            this.value = value;
            this.next = next;
            this.previous = previous;

        }

        public E getValue() { return value;	}
        public void setValue(E value) { this.value = value; }
        public Node getNext() { return next; }
        public void setNext(Node node) { this.next = node; }
        public Node getPrevious() { return previous; }
        public void setPrevious(Node node) { this.previous = node; }


    }
}