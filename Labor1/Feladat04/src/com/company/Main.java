package com.company;

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


    public static void main(String[] args) {
        double array[] = {};

        System.out.println(mean(array));
    }
}
