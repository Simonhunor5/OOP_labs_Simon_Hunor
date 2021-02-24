package com.company;

public class MyDate {

    private int year, month, day;

    public MyDate(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear()
    {
        return this.year;
    }

    public int getMonth()
    {
        return this.month;
    }

    public int getDay()
    {
        return this.day;
    }

    @Override

    public String toString()
    {
        return "The date is: " + this.year + " " + this.month + " " + this.day;
    }

}
