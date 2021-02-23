package com.company;

import java.lang.Math;

public class Main {

    public static double mean(double array[])
    {
        double sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }

        if(array.length == 0)
        {
            return Double.NaN;
        }else
        {
            return sum/ array.length;
        }
    }

    public static double stddev(double array[])
    {
        double mean = mean(array);
        double sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            sum += Math.pow((array[i]-mean),2);
        }

        return Math.sqrt(sum/array.length);
    }


    public static void main(String[] args) {
        double array[] = {9, 2, 5, 4, 12, 7, 8, 11, 9, 3, 7, 4, 12, 5, 4, 10, 9, 6, 9, 4};

        System.out.println(stddev(array));
    }
}
