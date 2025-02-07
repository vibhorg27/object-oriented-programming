package com.bridgelabz.classandobject.levetwo;

import java.util.ArrayList;
import java.util.Scanner;

class Item{
    String itemName;
    double itemPrice;
    int quantity;


    Item(String itemName, double itemPrice ,int quantity){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

}

class Cart{
    private ArrayList<Item> itemList = new ArrayList<>();
    private double cartCost = 0;


    public void addItems(Item item){
        itemList.add(item);
        System.out.println("Added item " + item.itemName);

    }

    public void removeItem(Item item){
        itemList.remove(item);
        System.out.println("Removed item " + item.itemName);
    }

    public void displayitems(Cart cart){
        for(Item i : itemList){
            System.out.println(i.itemName + " | " + i.itemPrice + " | " + i.quantity + " | ");
        }
    }

    public void totalCost(int quantity, double itemPrice ){
        for(Item i : itemList){
            cartCost = i.quantity * i.itemPrice + cartCost;
        }
        System.out.println("Total cost = " + cartCost);
    }


}

public class ShoppingCart {
    public static void main(String[] args){

        Item item1 = new Item("Banana", 20, 3);
        Item item2 = new Item("Apples", 70, 4);
        Item item3 = new Item("oranges", 30, 2);

        Cart cart = new Cart();
        cart.addItems(item1);
        cart.addItems(item2);
        cart.addItems(item3);

        cart.displayitems(cart);

        cart.removeItem(item2);
        cart.displayitems(cart);
    }
}
