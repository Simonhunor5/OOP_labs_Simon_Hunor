package lab3_1;

public class BankAccount {

    private double balance;
    private String accountNumber;


    public BankAccount(String accountNumber)
    {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public BankAccount(double balance, String accountNumber)
    {
        this.balance = balance;
        this.accountNumber = accountNumber;
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
