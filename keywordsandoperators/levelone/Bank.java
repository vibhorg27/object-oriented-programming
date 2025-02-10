package com.bridgelabz.keywordsandoperators.levelone;

class BankAccount {
    private static String bankName = "National Bank";
    private static int totalAccounts = 0;

    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: $" + balance);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456", "Vibhor", 5000.0);
        BankAccount account2 = new BankAccount("987654", "Mayank", 10000.0);

        account1.displayAccountDetails();
        System.out.println();
        account2.displayAccountDetails();

        BankAccount.getTotalAccounts();
    }
}
