
public class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private double dailyWithdrawalLimit;

    public Account(String number, String owner, double initial,
                   double limit) {
        accountNumber = number;
        ownerName = owner;
        balance = initial;
        dailyWithdrawalLimit = limit;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public double getBalance() {
        return balance;
    }
    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }

        balance += amount;
        return true;
    }
    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance
                || amount > dailyWithdrawalLimit) {
            return false;
        }

        balance -= amount;
        return true;
    }

    public void printInfo() {
        System.out.println(
            accountNumber + " - " + ownerName
            + " - balance: " + balance
        );
    }
}