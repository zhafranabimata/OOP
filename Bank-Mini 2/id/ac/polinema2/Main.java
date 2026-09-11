package id.ac.polinema2;

public class Main {
    public static void main(String[] args) {
        account acc = new account("A001", "Nadia", 500000);
        acc.withdraw(150000);
        acc.printInfo();
    }
}