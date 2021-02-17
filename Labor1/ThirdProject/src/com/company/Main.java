package com.company;

public class Main {

    public static void main(String[] args) {
	String text = "ALMAFA";
	int count = 0 ;

	for(int i = 0; i < text.length(); i++)
    {
        for(int j = 0; j <= count; j++)
        {
            System.out.print(text.charAt(j));
        }
        System.out.println();

        count++;
    }

    }
}
