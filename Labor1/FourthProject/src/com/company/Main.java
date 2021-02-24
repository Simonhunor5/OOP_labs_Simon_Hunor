package com.company;

public class Main {
    public static void main(String[] args) {
//
        System.out.println(createMonogram("Simon Hunor"));
    }

    /**
     *
     * @param name -> ennek fogjuk meghatarozni a monogramjat
     * @return -> a monogram
     */
    public static String createMonogram(String name) {
        //name tartalma: Antal Jozsef
        String[] tomb;
        tomb = name.split(" ");
        //tomb[0] = Antal
        //tomb[1] = Jozsef
        String monogram = "";
//        for(int i = 0; i < tomb.length; ++i) {
//            monogram += tomb[i].charAt(0);
//        }
        for (String s : tomb) {
            monogram += s.charAt(0);
        }

        return monogram;
    }



}
