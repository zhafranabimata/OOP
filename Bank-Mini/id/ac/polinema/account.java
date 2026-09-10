package id.ac.polinema;

public class account {

    public String ownerName;
    public double balance;

    // Constructor
    public account(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // Menambah saldo
    public void deposit(double amount) {
        balance = balance + amount;
    }

    // Mengurangi saldo
    public void withdraw(double amount) {
        balance = balance - amount;

        if (isOverdrawn()) {
            balance = balance + amount;
            System.out.println(
                "Withdrawal rejected: insufficient balance."
            );
        }
    }

    // Menampilkan informasi rekening
    public void printInfo() {
        System.out.println(
            ownerName + " - balance: " + balance
        );
    }

    // Menampilkan saldo dengan format ribuan
    public String formatBalance() {
        return String.format("%,.2f", balance);
    }

    // Mengecek apakah saldo negatif
    public boolean isOverdrawn() {
        return balance < 0;
    }

    // Tugas Mandiri
    // Transfer saldo ke rekening lain
    public void transferTo(account target, double amount) {
        double previousBalance = balance;

        withdraw(amount);

        // Jika withdraw berhasil
        if (balance != previousBalance) {
            target.deposit(amount);
        }
    }
}