package lab3_2;

import lab3_1.BankAccount;

public class Customer {

    public static final int MAX_ACCOUNTS = 10;

    private String firstName, lastName;
    private BankAccount account;
    private int numAccounts;
    private BankAccount[] accounts = new BankAccount[ MAX_ACCOUNTS ];

    public Customer(String firstName, String lastName, int numAccounts, BankAccount[] accounts, int MAX_ACCOUNTS) {
        this.firstName = firstName;
        this.lastName = lastName;
        if(numAccounts > MAX_ACCOUNTS)
        {
            System.out.println("YOu cant add moree accounts!");
        }else {
                
        }
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }
    public BankAccount getAccount(){
        return this.account;
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

    public void closeAccount(){
        this.account = null;
    }



    @Override

    public String toString(){
        String result = firstName + " " + lastName + " ";
        if(this.account != null)
        {
            result += account;
        }else
        {
            result += " (no account)";
        }
        return result;
    }
}
