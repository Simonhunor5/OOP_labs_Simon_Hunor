package com.company;

import java.util.Arrays;

public class Main {

    public static double[] max2( double array[] ){
        double max[] ={Double.NEGATIVE_INFINITY,
                Double.NEGATIVE_INFINITY};

            if( array.length == 0 )
            {
                max[0] = Double.NaN;
                max[1] = Double.NaN;
                return max;
            }else if(array.length == 1)
            {
                max[0] = array[0];
                max[1] = array[0];
                return max;
            }
                Arrays.sort(array);
                max[0] = array[array.length - 2];
                max[1] = array[array.length - 1];

                return max;


    }


    public static void main(String[] args) {
	    double array[] = {};

        double max[] = max2(array);
	    for(int i = 0; i < 2; i++)
        {
            System.out.print(max[i]);
            System.out.print(" ");
        }
    }
}
