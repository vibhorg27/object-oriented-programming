package com.bridgelabz.inheritance;

// Base class: Person
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + " | Age: " + age);
    }
}

// Subclass: Teacher
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher | Subject: " + subject);
    }
}

// Subclass: Student
class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student | Grade: " + grade);
    }
}

// Subclass: Staff
class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role: Staff | Department: " + department);
    }
}

// Main class to test hierarchical inheritance
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alice Johnson", 35, "Mathematics");
        teacher.displayInfo();
        teacher.displayRole();

        Student student = new Student("Bob Smith", 16, 10);
        student.displayInfo();
        student.displayRole();


        Staff staff = new Staff("Charlie Brown", 40, "Administration");
        staff.displayInfo();
        staff.displayRole();
    }
}

