package com.company;

import java.time.LocalDate;


public class DateUtil {

    public static boolean leapYear(int year)
    {
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    return true;
                }else
                {
                    return false;
                }
            }else
            {
                return false;
            }
        }else
        {
            return false;
        }
    }

    public static boolean isValidDate(int year, int month, int day)
    {
        if(year <= 0 || month <= 0 || month > 12)
        {
            return false;
        }

        int[] monthLength = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(leapYear(year))
        {
            monthLength[1] = 29;
        }

        if(day > 0 && day <= monthLength[month - 1])
        {
            return true;
        }else
        {
            return false;
        }

    }
}