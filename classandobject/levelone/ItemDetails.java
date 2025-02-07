package com.bridgelabz.classandobject.levelone;

import java.util.Scanner;

class Item{
    String itemCode;
    String itemName;
    double price;

    public void printDetails(){
        System.out.println("Item code: " + this.itemCode);
        System.out.println("Item Name: " + this.itemName);
        System.out.println("Item code: " + this.price);
    }

    public double totalCost(double price, int quantity){
        return price * quantity;
    }
}

public class ItemDetails {
    public static void main(String[] args){
        Item item = new Item();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Item Code: ");
        item.itemCode = input.nextLine();

        System.out.print("Enter Item Name: ");
        item.itemName = input.nextLine();

        System.out.print("Enter Item Price: ");
        item.price = input.nextFloat();

        System.out.print("Enter Quantity of items: ");
        int quantity = input.nextInt();
        item.printDetails();
        double totalCostOfItems = item.totalCost(item.price, quantity);

        System.out.println("Total cost of items: " + totalCostOfItems);

    }

}
