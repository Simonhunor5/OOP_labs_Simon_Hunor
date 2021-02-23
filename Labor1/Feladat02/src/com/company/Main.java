package com.company;

public class Main {

    public static byte getBit(int number, int order)
    {
        String bit = Integer.toBinaryString(number);

        if((bit.length() - 1) < order)
        {
            return -1;

        }else
        {
            return bit.charAt((bit.length( ) - 1) - order) == '0' ? (byte)0 : (byte)1;
        }

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
