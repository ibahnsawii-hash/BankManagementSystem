public class Account{
     protected String holderName; 
     protected double balance ; 
     protected int acountNumber; 
     private static int counter = 1000;
      ////constructor
     public Account(String holder_na , double blnc)
     { 
        this.holderName = holder_na; 
        this.acountNumber = counter++;
         this.balance = blnc ; 
        } 
         ///mathods 
    public void deposit(double amount) 
    {
         if (amount > 0) 
         { 
            balance += amount; 
        } else 
        { System.out.println("Invalid amount."); } 
    } 
    public void withdraw(double amount) 
    {
         if (amount > 0 && amount <= balance)
             { 
                balance -= amount; 
             } 
             else 
                {
                     System.out.println("Invalid amount or insufficient balance."); 
                    } 
                } 
        public void displayInfo() { 
            System.out.println("Account Number: " + acountNumber);
             System.out.println("Holder Name: " + holderName); 
             System.out.println("Balance: " + balance); 
            } 
            public int getAccountNumber() 
            {
                 return acountNumber;
            }
             public double getBalance(){ 
                return balance;
             } 
            }
