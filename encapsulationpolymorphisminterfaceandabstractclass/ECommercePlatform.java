package com.bridgelabz.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;
import java.util.List;

interface Taxable{
    public double calculateTax();
    public void getTaxDetails();

}

abstract class Product{
    private String productID;
    private String name;
    private double price;

    Product(String productID, String name, double price){
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

//  Getter functions to get the private attributes
    public String getProductID(){
        return productID;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

//  Setter functions to set the attributes
    public void setPrice(double price){
        this.price = price;
    }

    public abstract double calculateDiscount();


    public void displayDetails(){
        System.out.println("Product ID: " + productID + ", Name: " + name + ", Price: " + price);
    }

}

class Electronics extends Product implements Taxable{

    private int warrantyPeriod;

    public Electronics(String productID, String name, double price, int warrantyPeriod){
        super(productID, name, price);
        this.warrantyPeriod = warrantyPeriod;

    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Electronics tax = 18%");
    }
}

class Clothing extends Product implements Taxable{
    private String size;

    public Clothing(String productID, String name, double price, String size){
        super(productID, name, price);
        this.size = size;
    }

    public double calculateTax() {
        return getPrice() * 0.05;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Apparel tax = 5%");
    }

}

class Groceries extends Product{
    private double weight;

    public Groceries(String productID, String name, double price, double weight){
        super(productID, name, price);
        this.weight = weight;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        Electronics laptop = new Electronics("101", "Laptop", 50000, 3);
        Clothing tShirt = new Clothing("102", "Blue Tshirt", 599, "M");
        Groceries rice = new Groceries("103", "Basmati Rice", 99, 3);

        productList.add(laptop);
        productList.add(tShirt);
        productList.add(rice);

        for(Product product : productList){
            product.displayDetails();
            double discount = product.calculateDiscount();
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0;
            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Final Price: " + finalPrice);
            if (product instanceof Taxable) ((Taxable) product).getTaxDetails();

        }
    }
}
