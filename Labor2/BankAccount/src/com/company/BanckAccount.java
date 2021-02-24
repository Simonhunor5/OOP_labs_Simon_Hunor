package com.company;

public class BanckAccount {

    private double balance;
    private String accountNumber;

    public BanckAccount()
    {
        this.balance = 0;
    }

    public BanckAccount(double balance, String accountNumber)
    {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString()
    {
        return "Bank account: " + this.accountNumber + " Balance: " + this.balance;
    }
}
