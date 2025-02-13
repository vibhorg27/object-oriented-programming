package com.bridgelabz.encapsulationpolymorphisminterfaceandabstractclass;


import java.util.ArrayList;
import java.util.List;

interface GPS{
    public String getCurrentLocation();
    public void updateLocation(String newLocation);

}

abstract class Vehicles implements GPS{
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currLocation = "Unknown";

    public Vehicles(String vehicleId, String driverName, double ratePerKm){
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

//  Getters
    public double getRatePerKm() {
        return ratePerKm;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getVehicleId() {
        return vehicleId;
    }

//  Setter
    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

//  display vehicle details
    public void getVehicleDetails(){
        System.out.println("Vehicle ID: " + vehicleId + " , Driver Name: " + driverName + " , Rate per Km: " + ratePerKm);
    }

    @Override
    public String getCurrentLocation() {
        return currLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currLocation = newLocation;
    }

}

class Cars extends Vehicles{
    private static final double BASE_FARE = 30 ;

    public Cars(String vehicleId, String driverName, double ratePerKm){
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return BASE_FARE + distance * getRatePerKm();
    }

}

class Bikes extends Vehicles{
    private static final double BASE_FARE = 10 ;

    public Bikes(String vehicleId, String driverName, double ratePerKm){
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return BASE_FARE + distance * getRatePerKm();
    }
}

class Auto extends Vehicles{
    private static final double BASE_FARE = 20 ;

    public Auto(String vehicleId, String driverName, double ratePerKm){
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return BASE_FARE + distance * getRatePerKm();
    }
}

public class RideHailing {
    public static void main(String[] args) {
        List<Vehicles> vehicles = new ArrayList<>();

        Auto auto = new Auto("101", "Manoj", 5);
        Cars cars = new Cars("102", "Anup", 15);
        Bikes bikes = new Bikes("103", "Mukesh", 5);

        auto.updateLocation("Srm college");
        cars.updateLocation("Anna nagar");
        bikes.updateLocation("Bessy beach");

        vehicles.add(auto);
        vehicles.add(cars);
        vehicles.add(bikes);

        for(Vehicles v : vehicles){
            System.out.println("Vehicle Id: " + v.getVehicleId() + "|| Total Fare = " + v.calculateFare(20) + " || Final destination: " + v.getCurrentLocation());
        }
    }
}
