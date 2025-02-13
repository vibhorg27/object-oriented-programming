package com.bridgelabz.inheritance;

class Employee{
    protected String name;
    protected String id;
    protected double salary;

    public Employee(String name, String id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee{
    private int teamSize;
    public Manager(String name, String id, double salary ,int teamSize){
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);

    }
}

class Developer extends Employee{
    private String programmingLanguage;
    public Developer(String name, String id, double salary ,String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);

    }

}

class Intern extends Employee{
    private int numberOfMonths;

    public Intern(String name, String id, double salary ,int numberOfMonths){
        super(name, id, salary);
        this.numberOfMonths = numberOfMonths;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Intern time in months: " + numberOfMonths);


    }

}

public class EmployeeManagementSystem {
    public static void main(String[] args){
        Employee emp1 = new Employee("Vibhor", "R09", 30000);
        Employee emp2 = new Manager("Mayank", "R03", 20000, 2);
        Employee emp3 = new Intern("Shreyas", "R04", 10000, 3);
        Employee emp4 = new Developer("Arnav", "R05", 5000, "Java");


        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
        emp4.displayDetails();
    }
}
