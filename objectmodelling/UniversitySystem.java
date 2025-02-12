package com.bridgelabz.objectmodelling;

import java.util.ArrayList;
import java.util.List;

// Department Class (Composition: Exists only if the University exists)
class Department {
    private String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}

// Faculty Class (Aggregation: Can exist independently)
class Faculty {
    private String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }
}

// University Class (Composition with Departments, Aggregation with Faculties)
class University {
    private String universityName;
    private List<Department> departments;
    private List<Faculty> faculties; // Aggregation

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Add Department (Composition: Department belongs ONLY to this University)
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // Add Faculty (Aggregation: Faculty can exist independently)
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Display University Details
    public void displayDetails() {
        System.out.println("\nUniversity: " + universityName);

        System.out.println("Departments:");
        for (Department dept : departments) {
            System.out.println(" - " + dept.getDepartmentName());
        }

        System.out.println("Faculties:");
        for (Faculty faculty : faculties) {
            System.out.println(" - " + faculty.getFacultyName());
        }
    }

    // Delete University (Composition: Departments get deleted)
    public void deleteUniversity() {
        System.out.println("\nDeleting University: " + universityName);
        departments.clear(); // Departments are deleted
        faculties.clear(); // Faculties are NOT necessarily deleted
        System.out.println("University and its departments deleted, but faculties still exist.");
    }
}

// Main Class
public class UniversitySystem {
    public static void main(String[] args) {
        // Create University
        University uni = new University("SRM Institute of Science and Technology");

        // Add Departments (Composition)
        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical Engineering");
        uni.addDepartment("Electronics and Communication");

        // Create Faculty Members (Aggregation)
        Faculty faculty1 = new Faculty("Dr. Sharma");
        Faculty faculty2 = new Faculty("Dr. Gupta");

        // Add Faculties to University (Aggregation)
        uni.addFaculty(faculty1);
        uni.addFaculty(faculty2);

        // Display University Details
        uni.displayDetails();

        // Delete University (Departments get deleted, Faculties remain)
        uni.deleteUniversity();

        // Faculties Still Exist
        System.out.println("\nFaculties still exist independently:");
        System.out.println(" - " + faculty1.getFacultyName());
        System.out.println(" - " + faculty2.getFacultyName());
    }
}


