package StackInheritance;

import java.util.ArrayList;

public class StackAggregation {
    private ArrayList<Object> items;
    private final int  capacity;

    public StackAggregation(int capacity)
    {
        this.capacity = capacity;
        this.items = new ArrayList<>(capacity);
    }

    public boolean isFull()
    {
        if(items.size() == capacity)
        {
            return true;
        }
        return false;
    }

    public boolean isEmpty()
    {
        if(items.size() == 0)
        {
            return true;
        }

        return false;
    }

    public int getSize()
    {
        return items.size();
    }

    public void push(Object object)
    {
        if(!isFull())
        {
            items.add(object);
        }else
        {
            System.out.println("The stack is full!");
        }
    }

    public void pop()
    {
        if(!isEmpty())
        {
            items.remove(items.size() - 1);
        }else
        {
            System.out.println("The stack is empty!");
        }
    }

    public Object top()
    {
        return items.get(items.size() - 1);
    }

    @Override
    public String toString() {
        for(int i = items.size() - 1 ; i >= 0 ; i++)
        {
            return items.get(i);
        }

        return " ";
    }
}
