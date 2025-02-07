package com.bridgelabz.classandobject.levetwo;

import java.util.Scanner;

class AccountDetails{
    String accountHolder;
    int accountNumber;
    double balance;

    public void depositMoney(double amount){
        this.balance += amount;
        System.out.println(amount + "Rs deposited");
    }

    public void withdrawMoney(double amount){
        this.balance -= amount;
        System.out.println(amount + "Rs withdrawn");
    }

    public void displayBalance(){
        System.out.println("Current Balance: " + this.balance);
    }
}
public class BankAccount {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        AccountDetails account = new AccountDetails();

        System.out.print("Enter account holder name: ");
        account.accountHolder = input.nextLine();

        System.out.print("Enter account holder number: ");
        account.accountNumber = input.nextInt();

        System.out.print("Enter account balance: ");
        account.balance = input.nextDouble();

        System.out.print("Enter amount to be deposited: ");
        double moneyToBeDeposited = input.nextDouble();

        account.depositMoney(moneyToBeDeposited);
        account.displayBalance();

        System.out.print("Enter amount to be withdrawn: ");
        double moneyToBeWithdrawn = input.nextDouble();

        account.withdrawMoney(moneyToBeWithdrawn);
        account.displayBalance();
    }

}
