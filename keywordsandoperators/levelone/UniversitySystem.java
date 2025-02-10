package com.bridgelabz.keywordsandoperators.levelone;

class Student {
    private static String universityName = "SRM University";
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private double grade;

    public Student(int rollNumber, String name, double grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
            System.out.println("University: " + universityName);
        }
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Vibhor", 9.2);
        Student student2 = new Student(2, "Mayank", 8.8);

        student1.displayStudentDetails();
        student2.displayStudentDetails();
        Student.displayTotalStudents();
    }
}

