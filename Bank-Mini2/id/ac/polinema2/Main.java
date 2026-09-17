
public class Main {
    public static void main(String[] args) {
        Account limited = new Account(
            "A005", "Fajar", 1000000, 200000
        );

        boolean first = limited.withdraw(300000);
        System.out.println("Withdraw 300000 allowed? " + first);

        boolean second = limited.withdraw(150000);
        System.out.println("Withdraw 150000 allowed? " + second);

        limited.printInfo();
    }
}