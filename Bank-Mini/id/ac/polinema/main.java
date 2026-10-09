package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account("Badu", 0);
        Account from = new Account("Nadia", 500000);
        Account to = new Account("Budi", 200000);

        acc.deposit(20000);
        from.transferTo(to, 100000);

        from.printInfo();
        to.printInfo();
        acc.printInfo();

        Account[] accs = new Account[10];

        accs[2] = new Account("Bido", 0);
        
        accs[2].printInfo();

    }
}