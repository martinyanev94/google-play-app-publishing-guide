import java.util.ArrayList;

public class BankAccount {
    private double balance;
    private ArrayList<String> transactionHistory;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<String> getTransactionHistory() {
        return transactionHistory; // Expose transaction history
    }
}
