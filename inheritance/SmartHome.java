package com.bridgelabz.inheritance;

//Super Class
class Devices{
    protected String deviceId;
    protected String status;

    public Devices(String deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus(){
        System.out.println("Status: " + status);
    }
}

// Subclass
class Thermostat extends Devices{
    private int tempSettings;

    public Thermostat(String deviceId, String status, int tempSettings){
        super(deviceId, status);
        this.tempSettings = tempSettings;
    }
//    Setter for temperature
    public int getTempSettings() {
        return tempSettings;
    }

//    Getter for temperature
    public void setTempSettings(int tempSettings) {
        this.tempSettings = tempSettings;
    }

//    overriding the displayStatus method from the Devices super class
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Settings: " + tempSettings);
    }
}

public class SmartHome {
    public static void main(String[] args){
// calling an object of teh super class
        Devices devices = new Thermostat("R001", "Working", 24);
        devices.displayStatus();
    }
}
