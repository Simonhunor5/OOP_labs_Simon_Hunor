package com.company;

public class Main {

    public static byte getBit(int number, int order)
    {
        int count = 0;
        byte actBit = (byte)(number % 2);
        number /=2;

        for(int i = 0; i <= count; i++)
        {
            if(count == order)
            {
                return actBit;
            }else
            {
                actBit = (byte)(number % 2);
                number /= 2;
                count++;
            }


        }

        return 1;

    }

    public static void main(String[] args) {

        System.out.println(getBit(13,0));
        System.out.println(getBit(13,1));
        System.out.println(getBit(13,2));
        System.out.println(getBit(13,3));
        System.out.println(getBit(13,4));
        System.out.println(getBit(13,5));
        System.out.println(getBit(13,6));
        System.out.println(getBit(13,7));
        System.out.println(getBit(13,8));



    }
}
