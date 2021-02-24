package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(DateUtil.isValidDate(2000,2, 29));
        System.out.println(DateUtil.isValidDate(2000,2, 30));
        System.out.println(DateUtil.isValidDate(1900,2, 29));
        System.out.println(DateUtil.isValidDate(1900,2, 28));
        System.out.println(DateUtil.isValidDate(-1900,2, 28));
        System.out.println(DateUtil.isValidDate(0,2, 28));
        System.out.println(DateUtil.isValidDate(2021,2, 29));
        System.out.println(DateUtil.isValidDate(2020,2, 29));
        System.out.println(DateUtil.isValidDate(2020,1, 32));
        System.out.println(DateUtil.isValidDate(2020,1, 0));
        System.out.println(DateUtil.isValidDate(2020,0, 0));
        System.out.println(DateUtil.isValidDate(2020,4, 31));

        System.out.println();

        MyDate[] dates = new  MyDate[1000];
        int invalidCount = 0;

        Random rand = new Random();

        for(int i = 0; i < 1000; i++)
        {
            int year = 1 + rand.nextInt(2021);
            int month = 1 + rand.nextInt(12);
            int day = 1 + rand.nextInt(31);

            dates[i] = new MyDate(year, month, day);

            if(DateUtil.isValidDate(year, month ,day))
            {
                System.out.println(dates[i]);

            }else
            {
                invalidCount++;
            }

        }
        System.out.println(invalidCount);
    }
}
