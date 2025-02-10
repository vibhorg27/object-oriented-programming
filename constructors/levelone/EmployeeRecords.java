package com.bridgelabz.constructors.levelone;

// Super class
class Employee{
    public int employeeID;
    protected String department;
    private double salary;

//  Constructor for employee
    Employee(int employeeID, String department, double salary){
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

//  getter function for salary
    public double getSalary(){
        return salary;
    }

//  Setter function or salary
    public void setSalary(double salary){
        if(salary > 0){
            this.salary = salary;
        }
        else System.out.println("Invalid Salary");
    }

    public void displayEmployeeDetails(){
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);

    }
}

class Manager extends Employee{
    int managerID;

    Manager(int employeeID, String department, double salary, int managerID){
        super(employeeID, department, salary);
        this.managerID = managerID;
    }

    public void displayManagerDetails(){
        displayEmployeeDetails();
        System.out.println("Manager ID: " + managerID);
    }

}

public class EmployeeRecords {
    public static void main(String[] args){
        Employee emp = new Employee(1, "Developer", 40000);

        emp.displayEmployeeDetails();
        emp.setSalary(600000);
        System.out.println("\nUpdated Salary: " + emp.getSalary());

        Manager manager = new Manager(2, "Sales", 300000, 101);
        manager.displayManagerDetails();

    }
}
