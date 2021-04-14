package StackInheritance;

import java.util.ArrayList;

public class StackInheritance extends ArrayList<Object> {

    private final int capacity;

    public StackInheritance(int capacity)
    {
        super(capacity);
        this.capacity = capacity;
    }

    public void push(Object object)
    {
        if(!isFull())
        {
            super.add(object);
        }else
        {
            System.out.println("The stack is full!");
        }
    }

    public boolean isFull()
    {
        if(super.size() == capacity)
        {
            return true;
        }
        return false;
    }

    public boolean isEmpty()
    {
        if(super.size() == 0)
        {
            return true;
        }

        return false;
    }

    public int getSize()
    {
        return super.size();
    }


    public void pop()
    {
        if(!isEmpty())
        {
            super.remove(super.size() - 1);
        }else
        {
            System.out.println("The stack is empty!");
        }
    }

    public Object top()
    {
        return super.get(super.size() - 1);
    }

}
