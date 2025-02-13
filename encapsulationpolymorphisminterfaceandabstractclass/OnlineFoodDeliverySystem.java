package com.bridgelabz.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;

// Abstract class FoodItem
abstract class FoodItem {
    private String itemName;
    double price;
    int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    public abstract double calculateTotalPrice();
}

// Interface Discountable
interface Discountable {
    double applyDiscount(double discountPercentage);
    String getDiscountDetails();
}

// VegItem class that extends FoodItem and implements Discountable
class VegItem extends FoodItem implements Discountable {

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return price * quantity;
    }

    @Override
    public double applyDiscount(double discountPercentage) {
        double totalPrice = calculateTotalPrice();
        double discountAmount = (totalPrice * discountPercentage) / 100;
        return totalPrice - discountAmount;
    }

    @Override
    public String getDiscountDetails() {
        return "10% off on Veg items";
    }
}

// NonVegItem class that extends FoodItem and implements Discountable
class NonVegItem extends FoodItem implements Discountable {

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        // Additional charge for non-veg items
        double additionalCharge = 5;
        return (price + additionalCharge) * quantity;
    }

    @Override
    public double applyDiscount(double discountPercentage) {
        double totalPrice = calculateTotalPrice();
        double discountAmount = (totalPrice * discountPercentage) / 100;
        return totalPrice - discountAmount;
    }

    @Override
    public String getDiscountDetails() {
        return "5% off on Non-Veg items";
    }
}

// Order class to handle different food items (Polymorphism)
class Order {
    private ArrayList<FoodItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public double processOrder() {
        double totalAmount = 0;
        for (FoodItem item : items) {
            System.out.println(item.getItemDetails());
            totalAmount += item.calculateTotalPrice();
        }
        return totalAmount;
    }

    public double applyOrderDiscount(double discountPercentage) {
        double totalAmount = 0;
        for (FoodItem item : items) {
            totalAmount += item instanceof Discountable ? ((Discountable) item).applyDiscount(discountPercentage) : item.calculateTotalPrice();
        }
        return totalAmount;
    }
}

// Main class to demonstrate the functionality
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        VegItem vegItem = new VegItem("Veg Pizza", 10, 2);
        NonVegItem nonVegItem = new NonVegItem("Chicken Burger", 12, 1);

        Order order = new Order();
        order.addItem(vegItem);
        order.addItem(nonVegItem);

        System.out.println("\nOrder Details:");
        double totalPrice = order.processOrder();
        System.out.println("Total Price: " + totalPrice);

        // Apply discount on order
        double discountedPrice = order.applyOrderDiscount(10);
        System.out.println("Total Price after Discount: " + discountedPrice);
    }
}


