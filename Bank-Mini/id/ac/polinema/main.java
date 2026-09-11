package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        account acc = new account("Badu", 0);
        account from = new account("Nadia", 500000);
        account to = new account("Budi", 200000);

        acc.deposit(20000);
        from.transferTo(to, 100000);

        from.printInfo();
        to.printInfo();
        acc.printInfo();

        account[] accs = new account[10];

        accs[2] = new account("Bido", 0);
        
        accs[2].printInfo();

    }
}