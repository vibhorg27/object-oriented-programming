package com.bridgelabz.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;
import java.util.List;

// Interface for managing medical records
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// Abstract class for Patients
abstract class Patient implements MedicalRecord {
    private int patientId;
    private String name;
    private int age;
    private List<String> medicalRecords;  // Encapsulated medical history

    // Constructor
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalRecords = new ArrayList<>();
    }

    // Getters
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method for bill calculation
    public abstract double calculateBill();

    // Method to get patient details
    public void getPatientDetails() {
        System.out.println("\nPatient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Implement MedicalRecord interface
    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + name + ":");
        for (String record : medicalRecords) {
            System.out.println("- " + record);
        }
    }
}

// Subclass for InPatients (Admitted Patients)
class InPatient extends Patient {
    private int admissionDays;
    private double dailyCharge;

    public InPatient(int patientId, String name, int age, int admissionDays, double dailyCharge) {
        super(patientId, name, age);
        this.admissionDays = admissionDays;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return admissionDays * dailyCharge;
    }
}

// Subclass for OutPatients (Consultation-based patients)
class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;

    }
}

// Main class for hospital management
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Creating patients
        InPatient patient1 = new InPatient(101, "Alice", 45, 5, 2000);
        OutPatient patient2 = new OutPatient(102, "Bob", 30, 500);

        // Adding medical records
        patient1.addRecord("Surgery on 10th Feb 2024");
        patient1.addRecord("Routine checkup on 15th Feb 2024");

        patient2.addRecord("Consultation for flu on 12th Feb 2024");

        // List of patients (Polymorphism)
        List<Patient> patients = new ArrayList<>();
        patients.add(patient1);
        patients.add(patient2);

        // Processing patients
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Total Bill: Rs." + patient.calculateBill());
            patient.viewRecords();
            System.out.println("----------------------");

        }
    }
}

