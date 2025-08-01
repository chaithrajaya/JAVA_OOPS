class BankAccount1{
    private String accountNumber;
    private String accountHolder;
    private double balance;
    public void setAccountNumber(String newAccountNumber){
        if(newAccountNumber.length() == 10){
            accountNumber = newAccountNumber;
        }
        else{
System.out.println("Invalid");
        }
    }
    public void setAccountHolder(String newAccountHolder){
        accountHolder = newAccountHolder;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited: "+ amount);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("withdrawn: "+ amount);
        }
        else{
            System.out.println("Insufficient amount");
        }
    }
    public String getAccountHolder(){
        return accountHolder;
    }

    public String getAccountDetails(){
        return "account number: "+ accountNumber 
        + " \naccount Holder: " +  accountHolder 
     + "\nbalance" + balance;
    

    }

    void display(){
        System.out.println("Account created!");
        System.out.println(getAccountDetails());

    }
}

public class Main{
    public static void main(String[] args){
        BankAccount1 b1 = new BankAccount1();
        b1.setAccountHolder("ABC");
        b1.setAccountNumber("1234567890");
        b1.deposit(5000);
        b1.withdraw(4000);
        b1.display();
    }
}