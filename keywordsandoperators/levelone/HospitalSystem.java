package com.bridgelabz.keywordsandoperators.levelone;

class Patient {
    private static String hospitalName = "SRM Hospital";
    private static int totalPatients = 0;
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Hospital: " + hospitalName);
        }
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Patient patient1 = new Patient(101, "Vibhor", 25, "Fever");
        Patient patient2 = new Patient(102, "Mayank", 30, "Flu");

        patient1.displayPatientDetails();
        patient2.displayPatientDetails();
        Patient.getTotalPatients();
    }
}
