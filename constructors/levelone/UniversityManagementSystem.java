package com.bridgelabz.constructors.levelone;

class Student{
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA){
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

//  getter  function
    public double getCGPA(){
        return CGPA;
    }

//  Setter function
    public void setCGPA(double CGPA){
        if(CGPA >= 0.0 && CGPA <= 10.0){
            this.CGPA = CGPA;
        }
        else System.out.println("Invalid CGPA");
    }

    public void displayStudentDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("CGPA: " + CGPA);
    }
}

// PostGraduateStudent class inheriting the student class
class PostGraduateStudent extends Student{
    String pgType;
    PostGraduateStudent(int rollNumber, String name, double CGPA, String pgType) {
        super(rollNumber, name, CGPA);
        this.pgType = pgType;
    }

    public void displayPgStudentDetails(){
        System.out.println("PG student Details: ");
        displayStudentDetails();
        System.out.println("PG Type: " + pgType);
    }

}

public class UniversityManagementSystem {
    public static void main(String[] args){

        Student student = new Student(1, "Vibhor", 8.8);

        student.displayStudentDetails();
        student.setCGPA(9.0);
        student.displayStudentDetails();

        PostGraduateStudent pgStudent = new PostGraduateStudent(1, "Rohan", 9.1, "MBA");

        pgStudent.setCGPA(3.0);
        pgStudent.displayPgStudentDetails();

    }
}
