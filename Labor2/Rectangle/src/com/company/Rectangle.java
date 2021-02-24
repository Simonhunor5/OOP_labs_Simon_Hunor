package com.company;

public class Rectangle {

    private double length, width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public double getLength()
    {
        return this.length;
    }

    public double getWidth()
    {
        return this.width;
    }

    public double area()
    {
        return this.length * this.width;
    }

    public double perimeter()
    {
        return 2 * this.length + 2 * this.width;
    }

    @Override

    public String toString()
    {
        return "The length is: " + this.length + " The width is: " + this.width;
    }
}
