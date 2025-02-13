package com.bridgelabz.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;
import java.util.List;

interface Department{
    public void assignDepartment(String department);
    public String getDepartmentDetails();

}

abstract class Employee{
    private int employeeID;
    private String name;
    private double baseSalary;
    private String department;

//  Constructor for employee
    public Employee(int employeeID, String name, double baseSalary){
        this.employeeID = employeeID;
        this.name = name;
        this.baseSalary = baseSalary;
    }

//  Getter methods for the attributes
    public double getBaseSalary(){
        return baseSalary;
    }
    public int getEmployeeID(){
        return employeeID;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }

//  Setter methods
    public void setDepartment(String department){
        this.department = department;
    }

//  Abstract method
    public abstract double calculateSalary();


    public void displayDetails(){
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Name: " + name);
            System.out.println("Total Salary: " + calculateSalary());

    }
}

class FullTimeEmployee extends Employee implements Department{
    private double bonus;

    public FullTimeEmployee(int employeeID, String name, double baseSalary, double bonus){
        super(employeeID, name, baseSalary);
        this.bonus= bonus;
    }

    @Override
    public void assignDepartment(String department) {
        setDepartment(department);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public String getDepartmentDetails() {
        return "Full time employee " + getEmployeeID() + " is in " + getDepartment();
    }
}

class PartTimeEmployee extends Employee implements Department{
    private double hourlyRate;
    private double hoursWorked;

    public PartTimeEmployee(int employeeID, String name, double baseSalary, double hourlyRate, double hoursWorked){
        super(employeeID, name, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate(){
        return hourlyRate;
    }

    public double getHoursWorked(){
        return hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hourlyRate * hoursWorked);
    }

    @Override
    public void assignDepartment(String department) {
        setDepartment(department);
    }

    @Override
    public String  getDepartmentDetails() {
        return "Part time employee " + getEmployeeID() + " is in " + getDepartment();
    }
}

public class EmployeeManagementSystem {

        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();

            FullTimeEmployee emp1 = new FullTimeEmployee(101, "Vibhor", 50000, 5000);
            emp1.assignDepartment("HR");

            PartTimeEmployee emp2 = new PartTimeEmployee(102, "Shreyas", 0, 40, 20);
            emp2.assignDepartment("IT");

            employees.add(emp1);
            employees.add(emp2);

            // Polymorphism: Processing employees using the Employee reference
            for (Employee emp : employees) {
                emp.displayDetails();
                System.out.println(((Department) emp).getDepartmentDetails());
                System.out.println("----------------------");
            }
        }
}
