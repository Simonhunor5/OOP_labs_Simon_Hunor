package lab3_2;

import lab3_1.BankAccount;

import java.util.ArrayList;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Jhon", "BLACK");
        Customer customer2 = new Customer("Mary", "WHITE");

        for(int i = 0; i < 9; i++)
        {
            if(i < 5)
            {
                customer1.addAccount(new BankAccount("OTP0000" + (i + 1)));
            }

            customer2.addAccount(new BankAccount("BRD0000" + (i + 1)));
        }

        System.out.println(customer1);
        System.out.println(customer2);

        Random rand = new Random();

        for(int i = 0; i < 9; i++)
        {
            int rand_dub1 = rand.nextInt(1000);
            int rand_dub2 = rand.nextInt(1000);

            if(i < 5)
            {
                customer1.getAccount("OTP0000" + (i + 1)).deposit(rand_dub1);
            }

            customer2.getAccount("BRD0000" + (i + 1)).deposit(rand_dub2);
        }

        System.out.println(customer1);
        System.out.println(customer2);

        customer1.closeAccount("OTP00001");
        customer2.closeAccount("BRD00002");

        System.out.println(customer1);
        System.out.println(customer2);

        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer("Jhon", "DOE"));

        System.out.println(customers);

        for(int i = 0; i < 6; i++)
        {
            customers.get(0).addAccount(new BankAccount("BNC0000" + (i + 1)));
        }

        System.out.println(customers);

        for(int i = 0; i < 6; i++)
        {
            customers.get(0).getAccount("BNC0000" + (i + 1)).deposit(100 * i);
        }

        System.out.println(customers);

        customers.get(0).closeAccount("BNC00002");

        System.out.println(customers);

    }
}
