package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int year = 2021, month ,day;
        ArrayList<MyDate> dates = new ArrayList<>();
        MyDate[] array = new MyDate[10];

        Random rand = new Random();



        for(int i = 1; i <= 10; i++)
        {
            month = rand.nextInt(12) + 1;
            day = rand.nextInt(31) + 1;
            if(DateUtil.isValidDate(year, month, day))
            {
                dates.add(new MyDate(year, month, day));
                array[i - 1] = new MyDate(year, month, day);
            }
        }

        for (MyDate o: dates) {
            System.out.println(o);
        }

    }
}
