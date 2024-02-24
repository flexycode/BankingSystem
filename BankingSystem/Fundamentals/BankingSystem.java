package Fundamentals;

public class BankingSystem {
    private Account[] accounts;
    private int numAccounts;

    public BankingSystem() {
        accounts = new Account[100];
        numAccounts = 0;
    }

    public void createAccount(int accountNumber, String accountHolderName, double balance) {
        Account account = new Account(accountNumber, accountHolderName, balance);
        accounts[numAccounts] = account;
        numAccounts++;
        System.out.println("Account created successfully.");
    }

    public void deposit(int accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(int accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void checkBalance(int accountNumber) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.checkBalance();
        } else {
            System.out.println("Account not found.");
        }
    }

    public void displayAccountDetails(int accountNumber) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.displayAccountDetails();
        } else {
            System.out.println("Account not found.");
        }
    }

    private Account findAccount(int accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }
        return null;
    }
}