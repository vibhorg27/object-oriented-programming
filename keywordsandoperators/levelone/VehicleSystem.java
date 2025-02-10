package com.bridgelabz.keywordsandoperators.levelone;

class Vehicle {
    private static double registrationFee = 5000.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: Rs." + registrationFee);
        }
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("TN-01-1234", "Vibhor", "Car");
        vehicle1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(5500.0);
        vehicle1.displayVehicleDetails();
    }
}

