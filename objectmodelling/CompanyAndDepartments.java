package com.bridgelabz.objectmodelling;

import java.util.ArrayList;
import java.util.List;

// Employee Class (Exists only inside a Department)
class Employee {
    private String name;
    private String designation;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void displayInfo() {
        System.out.println("Employee: " + name + " | Designation: " + designation);
    }
}

// Department Class (Exists only inside a Company)
class Departments {
    String departmentName;
    private List<Employee> employees;

    public Departments(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, String designation) {
        employees.add(new Employee(name, designation));
    }

    public void displayDepartmentDetails() {
        System.out.println("\nDepartment: " + departmentName);
        for (Employee emp : employees) {
            emp.displayInfo();
        }
    }
}

// Company Class (Composition - Owns Departments)
class Company {
    private String companyName;
    private List<Departments> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String departmentName) {
        departments.add(new Departments(departmentName));
    }

    public void addEmployeeToDepartment(String departmentName, String employeeName, String designation) {
        for (Departments dept : departments) {
            if (dept.departmentName.equals(departmentName)) {
                dept.addEmployee(employeeName, designation);
                return;
            }
        }
        System.out.println("Department not found: " + departmentName);
    }

    public void displayCompanyDetails() {
        System.out.println("\nCompany: " + companyName);
        for (Departments dept : departments) {
            dept.displayDepartmentDetails();
        }
    }

    // When the company is deleted, all departments and employees are deleted
    public void deleteCompany() {
        departments.clear();
        System.out.println("\nCompany " + companyName + " and all its departments & employees are deleted!");
    }
}

// Main Class
public class CompanyAndDepartments {
    public static void main(String[] args) {
        Company company = new Company("Tech Solutions");

        // Adding departments
        company.addDepartment("IT");
        company.addDepartment("HR");

        // Adding employees
        company.addEmployeeToDepartment("IT", "Vibhor", "Software Engineer");
        company.addEmployeeToDepartment("IT", "Mayank", "Data Analyst");
        company.addEmployeeToDepartment("HR", "Priya", "HR Manager");

        // Display company details
        company.displayCompanyDetails();

        // Delete company (Automatically deletes departments and employees)
        company.deleteCompany();
    }
}
