package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Customer nadia = new Customer("Nadia","129381283128");
        Customer sari = new Customer("Sari","0192819238");

        Account a1 = new Account("A001", nadia, 350000);
        Account a2 = new Account("A002", sari, 200000);
        Account a3 = new Account("A003", nadia, 150000);

        Bank bank = new Bank(3);
        bank.addAccount(a1);
        bank.addAccount(a2);
        bank.addAccount(a3);

        Account[] hasil = bank.findAccountsByOwnerName("Nadia");
        System.out.println("Jumlah rekening: " + hasil.length);
        for (Account account : hasil) {
            account.printInfo();
        }
    }
}