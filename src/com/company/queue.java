package com.company;

import java.util.*;

class Queue<T> implements Iterable<T> {

    private LinkedList<T> elements = new LinkedList<T>();

    public void enqueue(T element) {
        elements.add(element);
    }

    public T dequeue() {
        return elements.removeFirst();
    }

    public T peek() {
        return elements.getFirst();
    }

    public void clear() {
        elements.clear();
    }

    public int size() {
        return elements.size();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }
}