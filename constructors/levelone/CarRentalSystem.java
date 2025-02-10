package com.bridgelabz.constructors.levelone;

import java.util.Scanner;

class CarRental{
    String customerName;
    String carModel;
    int rentalDays;
    double pricePerDay;
    double totalCost;

    CarRental(String customerName, String carModel, int rentalDays, double pricePerDay,int numberOfDays){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.pricePerDay = pricePerDay;
        this.rentalDays = numberOfDays;
        this.totalCost = pricePerDay * numberOfDays;
    }


    public void printInfo(){
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("No of Days: " + rentalDays);
        System.out.println("Total Cost: " + totalCost);
    }
}

public class CarRentalSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter car name: ");
        String name = input.nextLine();

        System.out.print("Enter car model: ");
        String model = input.nextLine();

        System.out.print("Enter number of days: ");
        int days = input.nextInt();

        System.out.print("Enter price per day: ");
        double pricePerDay = input.nextDouble();


        CarRental car = new CarRental(name, model, days, pricePerDay, days);
        car.printInfo();



    }
}
