package BankAccount;



public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("OTP");
        bank.addCustomer(new Customer("JHON", "DOE"));
        bank.addCustomer(new Customer("MARY", "WHITE"));

        for(int i = 0; i < bank.numCustomer(); i++)
        {
            for(int j = 0; j <  2; j++)
            {
                bank.getCostumer(i).addAccount(new BankAccount());
            }
        }

        bank.printCustomersToStdout();

        System.out.println();

        System.out.println(bank.getCostumer(0));

        int count = 0;

        for(int i = 0; i < bank.numCustomer(); i++)
        {
            for(int j  = 0; j < 2; j++)
            {
                bank.getCostumer(i).getAccount("OTP000000" + count).deposit(100 * j);
                count++;
            }
        }

        System.out.println(bank.getCostumer(1));

        bank.printCustomersToFile("bank_customers.csv");

    }
}
