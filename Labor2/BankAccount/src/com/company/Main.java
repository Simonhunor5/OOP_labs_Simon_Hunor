package com.company;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
        BanckAccount myAccount = new BanckAccount(12345, "QWERTY");

        System.out.println(myAccount);

        System.out.println((myAccount.getBalance()));
        myAccount.setAccountNumber("YTREWQ");

        System.out.println(myAccount);
    }
}
