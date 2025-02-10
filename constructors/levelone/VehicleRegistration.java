package com.bridgelabz.constructors.levelone;

class Vehicle{
    String ownerName;
    String vehicleType;
    static float registrationFees;

    Vehicle(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails(){
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fees: " + registrationFees);
    }

    static void updateRegistrationFee (float newRegistrationFee){
        registrationFees = newRegistrationFee;
    }
}

public class VehicleRegistration {
    public static void main(String[] args){
        Vehicle.updateRegistrationFee(400);

        Vehicle vehicle1 = new Vehicle("Vibhor", "LMV");
        Vehicle vehicle2 = new Vehicle("Mayank", "SUV");

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(200);

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();


    }
}
