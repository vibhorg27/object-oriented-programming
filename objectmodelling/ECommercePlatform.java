package com.bridgelabz.objectmodelling;

import java.util.ArrayList;
import java.util.List;

// Product Class
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Order Class (Aggregation: Contains multiple products)
class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in Order:");
        for (Product product : products) {
            System.out.println(" - " + product.getName() + " (Rs." + product.getPrice() + ")");
        }
        System.out.println("Total Amount: Rs." + calculateTotal());
    }
}

// Customer Class (Association: Places orders)
class Customers {
    private String name;
    private List<Order> orders;

    public Customers(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void displayCustomerOrders() {
        System.out.println("\nCustomer: " + name);
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}

// Main Class
public class ECommercePlatform {
    public static void main(String[] args) {
        Customers customer1 = new Customers("Alice");

        Product product1 = new Product("Laptop", 900);
        Product product2 = new Product("Headphones", 50);
        Product product3 = new Product("Smartphone", 600);

        Order order1 = new Order(101);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order(102);
        order2.addProduct(product3);

        customer1.placeOrder(order1);
        customer1.placeOrder(order2);

        customer1.displayCustomerOrders();
    }
}

