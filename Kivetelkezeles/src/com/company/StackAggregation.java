package com.company;

import java.util.ArrayList;

public class StackAggregation {
    private ArrayList<Object> items;
    private final int capacity;

    public StackAggregation(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>(capacity);
    }

    public boolean isEmpty() throws StackException {
        if (items.size() == 0) {
            throw new StackException(0, capacity);
        }

        return false;
    }

    public boolean isFull() throws StackException{
        if (items.size() >= capacity) {
            throw new StackException(1, capacity);
        }
        return false;
    }

    public void push(Object o) throws StackException {
        if (!isFull()) {
            items.add(o);
        }
    }

    public void pop() throws StackException {
        if (!isEmpty()) {
            items.remove(items.size() - 1);
        }
    }

    public Object top() throws StackException {
        if (!isEmpty()) {
            return items.remove(items.size() - 1);
        }
        return null;
    }

    public int getSize() {
        return items.size();
    }
}