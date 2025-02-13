package com.bridgelabz.inheritance;

// Interface created
interface Refuelable{
    public void refuel();
}

// Parent class
class Vehicles{
    protected int maxSpeed;
    protected String model;

    public Vehicles(int maxSpeed, String model){
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

}

// child class that extends vehicles class
class ElectricVehicle extends Vehicles{
    private double wattage;

    public ElectricVehicle(int maxSpeed, String model, double wattage){
        super(maxSpeed, model);
        this.wattage = wattage;
    }

    public void charge(){
        System.out.println("EV is charging");
    }
}

// child class inheriting the parent class and also implements the interface Refuelable
class PetrolVehicle extends Vehicle implements Refuelable{
    private int tankSize;

    public PetrolVehicle(int maxSpeed, String model, int tankSize){
        super(maxSpeed, model);
        this.tankSize = tankSize;
    }

    public int getTankSize() {
        return tankSize;
    }

    @Override
    public void refuel() {
        System.out.println("Tank refueling");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles(300, "SUV");

        ElectricVehicle electricVehicle = new ElectricVehicle(200 , "coupe", 233);
        electricVehicle.charge();

        PetrolVehicle petrolVehicle = new PetrolVehicle(300, "Sedan", 6);
        petrolVehicle.refuel();
    }
}
