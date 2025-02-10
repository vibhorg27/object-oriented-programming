package com.bridgelabz.constructors.levelone;

// Parent class: BankAccount
class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Setter method to modify balance
    public void setBalance(double amount) {
        if (amount >= 0) {
            this.balance = amount;
        } else {
            System.out.println("Invalid balance amount!");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs." + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account details (calls superclass method)
    public void displaySavingsDetails() {
        displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class
public class BankSystem {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("123456", "John Doe", 5000.0);
        bankAccount.displayAccountDetails();

        bankAccount.setBalance(7000.0);
        System.out.println("\nUpdated Balance: Rs." + bankAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount("987654", "Alice Brown", 10000.0, 3.5);
        System.out.println("\nSavings Account Details:");
        savingsAccount.displaySavingsDetails();
    }
}

