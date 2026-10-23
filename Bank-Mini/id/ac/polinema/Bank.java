package id.ac.polinema;

public class Bank {
    private Account[] accounts;
    private int count;

    public Bank(int capacity) {
        accounts = new Account[capacity];
        count = 0;
    }

    public boolean addAccount(Account account) {
        if (count >= accounts.length) {
            return false;
        }
        accounts[count] = account;
        count++;
        return true;
    }

    public Account findAccount(String number) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber().equals(number)) {
                return accounts[i];
            }
        }
        return null;
    }

    public Account[] findAccountsByOwnerName(String name) {
        int matchCount = 0;

        for (int i = 0; i < count; i++) {
            if (accounts[i].getOwner().getName().equals(name)) {
                matchCount++;
            }
        }

        Account[] result = new Account[matchCount];
        int index = 0;

        for (int i = 0; i < count; i++) {
            if (accounts[i].getOwner().getName().equals(name)) {
                result[index] = accounts[i];
                index++;
            }
        }

        return result;
    }

    public void printAllAccounts() {
        for (int i = 0; i < count; i++) {
            accounts[i].printInfo();
        }
    }
}