package lab3_1;

public class Customer {
    private String firstName, lastName;
    private BankAccount account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
       // this.account = new BankAccount("00000");
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
