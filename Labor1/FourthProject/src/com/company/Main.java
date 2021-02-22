package com.company;

public class Main {

    public static void main(String[] args) {

        String[] tomb;
        String nev2 = "Kerekes Bálint Ádám József";
        tomb = nev2.split(" ");

        for(int i = 0; i < tomb.length; i++) {
            System.out.printf("%c", tomb[i].charAt(0));
        }
    }
}
