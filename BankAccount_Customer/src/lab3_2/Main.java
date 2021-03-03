package lab3_2;

import lab3_1.BankAccount;
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
            double rand_dub1 = rand.nextDouble();
            double rand_dub2 = rand.nextDouble();

            if(i < 5)
            {
                customer1.getAccount("OTP0000" + (i + 1)).deposit(rand_dub1);
            }

            customer1.getAccount("BRD0000" + (i + 1)).deposit(rand_dub2);
        }

        System.out.println(customer1);
        System.out.println(customer2);

        customer1.closeAccount("OTP00001");
        customer2.closeAccount("BRD00002");

        System.out.println(customer1);
        System.out.println(customer2);

    }
}
