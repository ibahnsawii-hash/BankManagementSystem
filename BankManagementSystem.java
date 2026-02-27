import java.util.Scanner ;
public class BankManagerSystem{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();
        int choice;

        do{
            System.out.println("\n=== Bank Menu ===");
            System.out.println("1- Create Savings Account");
            System.out.println("2- Deposit");
            System.out.println("3- Withdraw");
            System.out.println("4- Transfer");
            System.out.println("5- Display Account");
            System.out.println("6- Display All Accounts");
            System.out.println("7- Exit");
            System.out.println("Choose: ");
            choice = input.nextInt();

            switch(choice){
                case 1:
                    {
                    System.out.println("Enter name: ");
                    String name = input.next();
                    System.out.println("Enter initial balance: ");
                    double balance = input.nextDouble();
                    System.out.println("Enter interest rate (e.g., 0.05): ");
                    double rate = input.nextDouble();

                    SavingAccount sa = new SavingAccount(name, balance, rate);
                    bank.addAccount(sa);
                    break;
                    }
                case 2:
                    {
                     System.out.println("Enter account number: ");
                    int depAcc = input.nextInt();
                    Account acc1 = bank.findAccount(depAcc);
                    if (acc1 != null) {
                        System.out.println("Enter amount: ");
                        double amount = input.nextDouble();
                        acc1.deposit(amount);
                        System.out.println("Deposit successful."); 
                    } else {
                        System.out.println("Account not found.");
                    }
                    break; 
                    }
                case 3:
                    {
                    System.out.println("Enter account number: ");
                    int wAcc = input.nextInt();
                    Account acc2 = bank.findAccount(wAcc);
                    if (acc2 != null) {
                        System.out.println("Enter amount: ");
                        double amount = input.nextDouble();
                        acc2.withdraw(amount);
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                    }
                case 4:
                    {
                    System.out.println("Enter account number that transfer From : ");
                    int from = input.nextInt();
                    System.out.println("Enter account number that transfer To : ");
                    int to = input.nextInt();
                    System.out.println("Amount: ");
                    double amt = input.nextDouble();
                    bank.transfer(from, to, amt);
                    break; 
                    }
                case 5:
                    {
                        System.out.println("Enter account number: ");
                    int dAcc = input.nextInt();
                    Account acc3 = bank.findAccount(dAcc);
                    if (acc3 != null) {
                        acc3.displayInfo();
                    } 
                    else 
                    {
                        System.out.println("Account not found.");
                    }
                    break; 
                    }
                case 6:
                    bank.displayAllAccounts();
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while(choice !=7);
       input.close();
    }
}
