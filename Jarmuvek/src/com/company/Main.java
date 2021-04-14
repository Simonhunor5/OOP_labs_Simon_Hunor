package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Jarmu> jarmuvek = new ArrayList<>();

        for(int i = 0; i < 5; i++)
        {
            jarmuvek.add(new Auto(i,JarmuTipus.SZARAZFOLDI,"Audi" + i,4,"Sedan"));
            jarmuvek.add(new Hajo(20 + i, JarmuTipus.VIZI, "DELTA" + i, 4, 280 + i));
        }



        for(int i = 0; i < 10; i++)
        {
            jarmuvek.get(i).kozlekedes();
            System.out.println(jarmuvek.get(i));

        }


    }
}
