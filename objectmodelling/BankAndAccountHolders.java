package com.bridgelabz.objectmodelling;

import java.util.ArrayList;
import java.util.List;

// Bank class
class Bank {
    String bankName;
    List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, BankAccount account) {
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened for " + customer.name + " at " + bankName);
    }


    public void showCustomers() {
        System.out.println("Customers of " + bankName + ":");
        for (Customer c : customers) {
            System.out.println(" - " + c.name);
        }
    }
}

// BankAccount class
class BankAccount {
    final int accountNumber;
    double balance;
    Bank bank;

    

    public BankAccount(int accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into account " + accountNumber);
    }

    public void viewBalance() {
        System.out.println("Balance in account " + accountNumber + ": Rs." + balance);
    }
}

// Customer class
class Customer {
    String name;
    List<BankAccount> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void viewAllBalances() {
        System.out.println("Bank accounts of " + name + ":");
        for (BankAccount acc : accounts) {
            acc.viewBalance();
        }
    }
}

// Main class
public class BankAndAccountHolders {
    public static void main(String[] args) {
        Bank sbi = new Bank("SBI");
        Customer vibhor = new Customer("Vibhor");
        Customer mayank = new Customer("Mayank");

        BankAccount acc1 = new BankAccount(101, 5000, sbi);
        BankAccount acc2 = new BankAccount(102, 10000, sbi);

        sbi.openAccount(vibhor, acc1);
        sbi.openAccount(mayank, acc2);

        acc1.deposit(2000);
        acc2.viewBalance();

        vibhor.viewAllBalances();
        mayank.viewAllBalances();

        sbi.showCustomers();
    }
}

