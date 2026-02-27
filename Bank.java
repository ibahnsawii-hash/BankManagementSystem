import java.util.ArrayList;
public class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();

    
    public void addAccount(Account acc) {
        accounts.add(acc);
        System.out.println("Account created successfully.");
    }


    public Account findAccount(int number) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == number) {
                return acc;
            }
        }
        return null;
    }

    
    public void transfer(int from, int to, double amount) {
        Account sender = findAccount(from);
        Account receiver = findAccount(to);

        if (sender != null && receiver != null) {
            if (amount > 0 && sender.getBalance() >= amount) {
                sender.withdraw(amount);
                receiver.deposit(amount);
                System.out.println("Transfer successful.");
            } else {
                System.out.println("Invalid transfer amount.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }


    public void displayAllAccounts() {
        for (Account acc : accounts) {
            acc.displayInfo();
            System.out.println("--------------------");
        }
    }
}
