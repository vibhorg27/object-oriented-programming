package com.bridgelabz.classandobject.levelone;

import java.util.Scanner;

class MobilePhones{
    String brand;
    String model;
    float price;

    public void getDetails(String brand, String model, float price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void printDetails(){

        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
    }
}

public class MobilePhoneDetails {
    public static void main(String[] args){

        MobilePhones mobile = new MobilePhones();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter brand: ");
        String brand = input.nextLine();

        System.out.print("Enter model: ");
        String model = input.nextLine();

        System.out.print("Enter price: ");
        float price = input.nextFloat();

        mobile.getDetails(brand, model, price);
        mobile.printDetails();
    }

}
