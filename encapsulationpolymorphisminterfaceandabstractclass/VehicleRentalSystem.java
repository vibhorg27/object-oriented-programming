package com.bridgelabz.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;
import java.util.List;

// Interface for insurance calculations
interface Insurable {
    double calculateInsurance();
    void getInsuranceDetails();
}

// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    // Abstract method to be implemented in subclasses
    public abstract double calculateRentalCost(int days);

    // Display vehicle details
    public void displayDetails(int days) {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Cost for " + days + " days: Rs." + calculateRentalCost(days));
    }
}

// Subclass Car implementing Insurable
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1;  // 10% of rental rate
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Car Insurance Policy Number: " + insurancePolicyNumber);
        System.out.println("Insurance Cost: Rs." + calculateInsurance());
    }
}

// Subclass Bike
class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9;  // 10% discount for bikes
    }
}

// Subclass Truck implementing Insurable
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2; // 20% extra charge for trucks
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.2;  // 20% of rental rate
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Truck Insurance Policy Number: " + insurancePolicyNumber);
        System.out.println("Insurance Cost: Rs." + calculateInsurance());
    }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("C123", 50, "CAR-INS-001"));
        vehicles.add(new Bike("B456", 20));
        vehicles.add(new Truck("T789", 100, "TRUCK-INS-002"));

        int rentalDays = 5;

        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails(rentalDays);

            if (vehicle instanceof Insurable) {
                ((Insurable) vehicle).getInsuranceDetails();
            }

            System.out.println("----------------------");
        }
    }
}

