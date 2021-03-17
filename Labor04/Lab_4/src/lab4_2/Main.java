package lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = readFromFile("lab4_2_input.txt");

        for(int i = 0; i < customers.size(); i++)
        {
            System.out.println(customers.get(i));
        }


    }

    public static ArrayList<Customer> readFromFile(String fileName)
    {
        Scanner scanner = null;

        try{
            scanner = new Scanner(new File(fileName));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        if(scanner == null)
        {
            return null;
        }

        ArrayList<Customer> customers= new ArrayList<>();

        int numOfCust = 0;

        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();

            if(line.isEmpty())
            {
                continue;
            }



                String[] items = line.split(",");
                String type = items[0].trim();
                if(type.equals("Customer"))
                {
                    String firstName = items[1].trim();
                    String lastName = items[2].trim();
                    numOfCust++;

                    customers.add(new Customer(firstName, lastName));
                }else if(type.equals("Account"))
                {
                    String accountNumber = items[1].trim();
                    int amount = Integer.parseInt(items[2].trim());

                    customers.get(numOfCust - 1).addAccount(new BankAccount(accountNumber));
                    customers.get(numOfCust - 1).getAccount(accountNumber).deposit(amount);
                }



        }
        return customers;
    }
}
