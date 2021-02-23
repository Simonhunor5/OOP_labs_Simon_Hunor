package com.company;

public class Main {

    public static int countBits(int number)
    {
        String bits = Integer.toBinaryString(number);
        int count  = 0;

        for(int i  = 0; i < bits.length(); i++)
        {
            if(bits.charAt(i) == '1')
            {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        for(int i = 0; i <= 31; i++)
        {
            System.out.println(countBits(i));
        }
    }
}
