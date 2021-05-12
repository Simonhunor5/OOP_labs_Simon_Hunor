package com.company;


public class StackException extends Throwable{

    public StackException(int id, int capacity)
    {
            switch (id)
            {
                case 0:
                    System.out.println("Empty!");
                    break;
                case 1:
                    System.out.println("Full, capacity: " + capacity);
                    break;
                default:
                    System.out.println("Exception accured!");
                    break;
            }
    }

    public StackException(String message)
    {
        super(message);
    }


}
