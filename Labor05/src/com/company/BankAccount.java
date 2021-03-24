package com.company;

public class BankAccount {


    public static final String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    private static int numAccounts = -1;
    private double balance;
    private String accountNumber;


    public BankAccount()
    {
        this.accountNumber = createAccountNumber();
        numAccounts++;
        this.balance = 0;

    }

    private static String createAccountNumber()
    {

        if(numAccounts > 10000000)
        {
            String zeros = "";

            int prefixlength = PREFIX.length();
            int numAccountsLength = String.valueOf(numAccounts).length();
            int zerosCount = ACCOUNT_NUMBER_LENGTH - prefixlength - numAccountsLength;

            for (int i = 0; i < zerosCount; i++)
            {
                zeros += "0";
            }

            return PREFIX  + zeros + String.valueOf(numAccounts);
        }

        return null;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public String getAccountNumber()
    {
        return this.accountNumber;
    }

    public void deposit(double amount)
    {
        if(amount > 0)
        {
            this.balance += amount;
        }
    }

    public boolean withdraw(double amount)
    {
        if((this.balance - amount) < 0)
        {
            return false;
        }else
        {
            this.balance -= amount;
            return true;
        }
    }

    @Override
    public String toString()
    {
        return "Bank account: " + this.accountNumber + " Balance: " + this.balance;
    }
}
