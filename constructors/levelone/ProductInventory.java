package com.bridgelabz.constructors.levelone;

import java.util.Scanner;

class Product{
    String productName;
    float price;
    static int totalProducts;

    Product(String productName, float price){
        this.productName = productName;
        this.price = price;
        totalProducts++;

    }

    public void displayDetails(){
        System.out.println("Name: " + this.productName);
        System.out.println("Price: " + this.price);
    }

    static void displayTotalProducts(){
        System.out.println("Total products: " + totalProducts);
    }

}

public class ProductInventory {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String name = input.nextLine();
        System.out.print("Enter product price: ");
        float price = input.nextFloat();

//      Creating an object of product class
        Product product = new Product(name, price);
        Product product1 = new Product("vibhor", 234);

        product1.displayDetails();
        product.displayDetails();
        Product.displayTotalProducts();



    }
}
