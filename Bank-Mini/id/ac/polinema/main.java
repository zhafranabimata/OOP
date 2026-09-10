package id.ac.polinema;

public class main {
    public static void main(String[] args) {

        account[] accounts = new account[3];

        accounts[0] = new account("Nadia", 500000);
        accounts[0].withdraw(150000);

        accounts[1] = new account("Budi", 1000000);

        accounts[2] = new account("Sari", 750000);
        accounts[2].withdraw(250000);

        for (account acc : accounts) {
            acc.printInfo();
        }
    }
}