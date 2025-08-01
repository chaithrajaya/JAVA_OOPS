class BankAccount{
    String holderName;
   int accountNumber;
    int balance;

    BankAccount(String Name,
    int number,
    int InitialBalance){
        holderName=Name;
        accountNumber=number;
        balance=InitialBalance;
    }
    void display(){
        System.out.println("The Name is: " + holderName);
        System.out.println("The accountNumber is: "+ accountNumber);
        System.out.println("The balance is: "+ balance);
    }
    void deposit(int amount){
      balance+=amount;
      System.out.println("The deposit amount is:"+ amount);
    }
    
    void withdraw(int amount){
        if(amount<=balance){
        balance-=amount;
        System.out.println("The withdrawn amount is: "+ amount);
        }
        else{
            System.out.println("NOT SUFFICIENT AMOUNT");
        }
    }
        void displayBalance(){
            System.out.println("Name: "+ holderName);
            System.out.println("Balance is: " + balance);
        }
    

    public static void main(String[] args){
        BankAccount b1 = new BankAccount("ABC",12345, 56000);
        b1.deposit(10000);
        b1.withdraw(5000);
        b1.displayBalance();
    }
}

/*
The deposit amount is: 10000
The withdrawn amount is: 5000
Name: ABC
Balance is: 61000
*/