public class SavingAccount extends Account{
    private double interestRate;
   
    public SavingAccount(String holder_na , double blnc,double inrstrate){
        super(holder_na, blnc);
        this.interestRate = inrstrate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    @Override
     public void displayInfo() {
        System.out.println("=== Savings Account ===");
        super.displayInfo();
        System.out.println("Interest Rate: " + interestRate);
    }

}
