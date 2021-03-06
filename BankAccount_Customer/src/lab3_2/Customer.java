package lab3_2;

import lab3_1.BankAccount;

public class Customer {

    public static final int MAX_ACCOUNTS = 10;

    private String firstName, lastName;
    private BankAccount account;
    private int numAccounts = 0;
    private BankAccount[] accounts = new BankAccount[ MAX_ACCOUNTS ];

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addAccount(BankAccount account) {
        if(this.numAccounts < MAX_ACCOUNTS)
        {
            this.accounts[numAccounts] = account;
            this.numAccounts++;
        }else
        {
            System.out.println("You cant add more accounts!");
        }
    }
    public BankAccount getAccount(String accountNumber){
        for(int i = 0; i < this.numAccounts; i++)
        {
            if(this.accounts[i].getAccountNumber().equals(accountNumber))
            {
                return this.accounts[i];
            }
        }
        return null;
    }

    public void setAccount( BankAccount account){
        if(this.numAccounts  - 1 <  MAX_ACCOUNTS)
        {
            this.accounts[numAccounts] = account;
        }
    }

    public int getNumAccounts()
    {
        return this.numAccounts;
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
        for(int i = 0; i < this.numAccounts; i++)
        {
            if(this.accounts[i].getAccountNumber().equals(accountNumber))
            {
               this.accounts[i] = null;
               this.numAccounts--;

                if (this.numAccounts - i >= 0)
                {
                    System.arraycopy(this.accounts, i + 1, this.accounts, i, this.numAccounts - i);
                }
            }
        }
    }



    @Override
    public String toString() {

        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n");
        for(int i = 0; i < numAccounts; i++){
            result.append( "\t" + accounts[i].toString() +"\n");
        }
        return result.toString();
    }
}
