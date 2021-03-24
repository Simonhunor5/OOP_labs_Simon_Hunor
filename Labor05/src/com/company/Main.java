package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("OTP");
        bank.addCustomer(new Customer("JHON", "DOE"));
        bank.addCustomer(new Customer("MARY", "WHITE"));

        for(int i = 0; i < bank.numCustomer(); i++)
        {
            
        }

    }
}
