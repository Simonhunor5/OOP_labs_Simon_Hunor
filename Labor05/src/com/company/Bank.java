package com.company;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name)
    {
        this.name = name;
        customers = new ArrayList<>();
    }

    public  Customer getCostumer(int id)
    {
        for(int i  = 0; i < this.customers.size(); i++)
        {
            if(this.customers.get(i).getId() == id)
            {
                return this.customers.get(i);
            }
        }

        return null;
    }

    public void addCustomer(Customer customer)
    {
        this.customers.add(customer);
    }

    public int numCustomer()
    {
        return this.customers.size();
    }

    private void printCustomers(PrintStream ps)
    {
        ps.println("ID, Firstname, Last name, Number of bank accounts");
        for( Customer customer: customers ){
            ps.println( customer.getId()+", " + customer.getFirstName() +", "+
                    customer.getLastName()+", "+customer.getNumAccounts());
        }

    }

    public void printCustomersToStdout(){
        printCustomers( System.out );
    }

    public void printCustomersToFile( String filename ){
        try {
            printCustomers( new PrintStream(filename ));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
