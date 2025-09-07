public class Customer {
    private String name;
    private BankAccount account; // The account that this customer owns

    public Customer(String name, double initialBalance) {
        this.name = name;
        this.account = new BankAccount(initialBalance);
    }

    public void depositToAccount(double amount) {
        account.deposit(amount);
    }

    public void withdrawFromAccount(double amount) {
        account.withdraw(amount);
    }

    public double checkBalance() {
        return account.getBalance();
    }
}
