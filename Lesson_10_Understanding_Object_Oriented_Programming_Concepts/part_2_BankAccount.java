public class BankAccount {
    private double balance;
    private boolean isAuthenticated = false; // Authentication status
    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void authenticateUser() {
        // In a real application, the authentication process would be more robust
        isAuthenticated = true;
    }

    public void deposit(double amount) {
        if (!isAuthenticated) {
            System.out.println("User not authenticated. Access denied.");
            return;
        }
        // ... (same deposit logic)
    }

    public void withdraw(double amount) {
        if (!isAuthenticated) {
            System.out.println("User not authenticated. Access denied.");
            return;
        }
        // ... (same withdrawal logic)
    }

    public double getBalance() {
        if (!isAuthenticated) {
            System.out.println("User not authenticated. Access denied.");
            return 0;
        }
        return balance;
    }
}
