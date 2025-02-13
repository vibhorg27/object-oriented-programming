package com.bridgelabz.inheritance;

// Base class: BankAccount
class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + " | Balance: Rs." + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Savings Account | Interest Rate: " + interestRate + "%");
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Checking Account | Withdrawal Limit: Rs." + withdrawalLimit);
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    private int maturityPeriod; // in months

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    public void displayAccountType() {
        System.out.println("Fixed Deposit Account | Maturity Period: " + maturityPeriod + " months");
    }
}

// Main class to test hierarchical inheritance
public class BankAccountTypes {
    public static void main(String[] args) {
        // Step 1: Savings Account
        SavingsAccount savings = new SavingsAccount("SA12345", 5000.00, 3.5);
        savings.displayBalance();
        savings.displayAccountType();

        // Step 2: Checking Account
        CheckingAccount checking = new CheckingAccount("CA67890", 2000.00, 1000.00);
        checking.displayBalance();
        checking.displayAccountType();

        // Step 3: Fixed Deposit Account
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD54321", 10000.00, 12);
        fixedDeposit.displayBalance();
        fixedDeposit.displayAccountType();
    }
}
