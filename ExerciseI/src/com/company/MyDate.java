
package com.company;

public class MyDate implements Comparable<MyDate> {

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

    @Override
    public int compareTo(MyDate dates)
    {
        if(dates.year != this.year)
        {
            return dates.year - this.year;
        }else
        {
            if(dates.month != this.month)
            {
                return dates.month - this.month;

            }else{
                if(dates.day != this.day)
                {
                    return dates.day - this.day;
                }else{
                    return 0;
                }
            }
        }
    }
}