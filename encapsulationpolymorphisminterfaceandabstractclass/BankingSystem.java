package com.bridgelabz.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;
import java.util.List;

// Loanable interface
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Abstract class BankAccount
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holderName + " deposited Rs." + amount + ". New Balance: Rs." + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(holderName + " withdrew Rs." + amount + ". New Balance: Rs." + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Abstract method for interest calculation
    public abstract double calculateInterest();

    // Display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: Rs." + balance);
        System.out.println("Interest Earned: Rs." + calculateInterest());
    }
}

// Subclass SavingsAccount implementing Loanable
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate; // Annual Interest Rate

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100); // Simple interest calculation
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " applied for a loan of Rs." + amount + " (Savings Account)");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000; // Eligible if balance is at least $5000
    }
}

// Subclass CurrentAccount implementing Loanable
class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for current accounts
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " applied for a loan of Rs." + amount + " (Current Account)");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000 || overdraftLimit >= 5000; // More relaxed criteria for current accounts
    }
}

// Main class
public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        SavingsAccount acc1 = new SavingsAccount("SA123", "Alice", 8000, 5.0);
        CurrentAccount acc2 = new CurrentAccount("CA456", "Bob", 12000, 5000);

        accounts.add(acc1);
        accounts.add(acc2);

        // Process accounts dynamically using polymorphism
        for (BankAccount acc : accounts) {
            acc.displayDetails();

            if (acc instanceof Loanable) {
                ((Loanable) acc).applyForLoan(5000);
                System.out.println("Loan Eligibility: " + ((Loanable) acc).calculateLoanEligibility());
            }

            System.out.println("----------------------");
        }
    }
}

