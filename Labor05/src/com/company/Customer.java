package com.company;

import java.util.ArrayList;

public class Customer {

    private static int numCustomers = 0;
    private final int id;
    private String firstName, lastName;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        accounts = new ArrayList<>();
        id = numCustomers;
        numCustomers++;

    }

    public int getId()
    {
        return id;
    }

    public int getNumAccounts()
    {
        return this.accounts.size();
    }

    public void addAccount(BankAccount account) {
        this.accounts.add(account);
    }
    public BankAccount getAccount(String accountNumber){
        for(int i = 0; i < this.accounts.size(); i++)
        {
            if(this.accounts.get(i).getAccountNumber().equals(accountNumber))
            {
                return this.accounts.get(i);
            }
        }
        return null;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void closeAccount(String accountNumber){
        for(int i = 0; i < this.accounts.size(); i++)
        {
            if(this.accounts.get(i).getAccountNumber().equals(accountNumber))
            {
                this.accounts.remove(i);

                if (this.accounts.size() - i >= 0)
                {
                    System.arraycopy(this.accounts, i + 1, this.accounts, i, this.accounts.size() - i);
                }
            }
        }
    }



    @Override
    public String toString() {

        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i = 0; i < this.accounts.size(); i++){
            result.append( "\t" + accounts.get(i).toString() +"\n");
        }
        return result.toString();
    }

}
