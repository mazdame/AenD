public class LinkedList {

    private static int counter;
    private Node head;

    // Default constructor
    public LinkedList() {

    }

    // appends the specified element to the end of this list.
    public void add(Object data) {

        // Initialize Node only incase of 1st element
        if (head == null) {
            head = new Node(data);
        }

        Node listTemp = new Node(data);
        Node listCurrent = head;

        // Let's check for NPE before iterate over crunchifyCurrent
        if (listCurrent != null) {

            // starting at the head node, crawl to the end of the list and then add element after last node
            while (listCurrent.getNext() != null) {
                listCurrent = listCurrent.getNext();
            }

            // the last node's "next" reference set to our new node
            listCurrent.setNext(listTemp);
        }

        // increment the number of elements variable
        incrementCounter();
    }

    private static int getCounter() {
        return counter;
    }

    private static void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }

    // inserts the specified element at the specified position in this list
    public void add(Object data, int index) {
        Node listTemp = new Node(data);
        Node listCurrent = head;

        // Let's check for NPE before iterate over crunchifyCurrent
        if (listCurrent != null) {
            // crawl to the requested index or the last element in the list, whichever comes first
            for (int i = 0; i < index && listCurrent.getNext() != null; i++) {
                listCurrent = listCurrent.getNext();
            }
        }

        // set the new node's next-node reference to this node's next-node reference
        listTemp.setNext(listCurrent.getNext());

        // now set this node's next-node reference to the new node
        listCurrent.setNext(listTemp);

        // increment the number of elements variable
        incrementCounter();
    }

    public Object get(int index)
    // returns the element at the specified position in this list.
    {
        // index must be 1 or higher
        if (index < 0)
            return null;
        Node listCurrent = null;
        if (head != null) {
            listCurrent = head.getNext();
            for (int i = 0; i < index; i++) {
                if (listCurrent.getNext() == null)
                    return null;

                listCurrent = listCurrent.getNext();
            }
            return listCurrent.getData();
        }
        return listCurrent;

    }

    // removes the element at the specified position in this list.
    public boolean remove(int index) {

        // if the index is out of range, exit
        if (index < 1 || index > size())
            return false;

        Node listCurrent = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (listCurrent.getNext() == null)
                    return false;

                listCurrent = listCurrent.getNext();
            }
            listCurrent.setNext(listCurrent.getNext().getNext());

            // decrement the number of elements variable
            decrementCounter();
            return true;

        }
        return false;
    }

    // returns the number of elements in this list.
    public int size() {
        return getCounter();
    }

    public String toString() {
        String output = "";

        if (head != null) {
            Node listCurrent = head.getNext();
            while (listCurrent != null) {
                output += "[" + listCurrent.getData().toString() + "]";
                listCurrent = listCurrent.getNext();
            }

        }
        return output;
    }

    private class Node {
        // reference to the next node in the chain, or null if there isn't one.
        Node next;

        // data carried by this node. could be of any type you need.
        Object data;

        // Node constructor
        public Node(Object dataValue) {
            next = null;
            data = dataValue;
        }

        // another Node constructor if we want to specify the node to point to.
        @SuppressWarnings("unused")
        public Node(Object dataValue, Node nextValue) {
            next = nextValue;
            data = dataValue;
        }

        // these methods should be self-explanatory
        public Object getData() {
            return data;
        }

        @SuppressWarnings("unused")
        public void setData(Object dataValue) {
            data = dataValue;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node nextValue) {
            next = nextValue;
        }

    }
}

