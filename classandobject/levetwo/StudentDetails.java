package com.bridgelabz.classandobject.levetwo;

import java.util.Scanner;

class Student{
    String name;
    int rollNumber;
    int marks;

    public void getDetails(String name, int rollNumber ,int marks ){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void printDetails(){
        System.out.println("Name of the Student: " + this.name);
        System.out.println("Roll Number of the Student: " + this.rollNumber);
        System.out.println("Marks of the Student: " + this.marks);
    }

    public void getGrades(int marks){
        if(this.marks >= 90){
            System.out.println("Grade A");
        }
        else if(this.marks >= 80 && this.marks <= 89){
            System.out.println("Grade B");
        }
        else if(this.marks >= 80 && this.marks <= 89){
            System.out.println("Grade C");
        }
        else if(this.marks >= 70 && this.marks <= 79){
            System.out.println("Grade D");
        }

        else System.out.println("Grade F");

    }
}

public class StudentDetails {
    public static void main(String[] args){
        Student student = new Student();
//        Student student2 = new Student();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter student name: ");
        student.name = input.nextLine();

        System.out.print("Enter student roll number: ");
        student.rollNumber = input.nextInt();

        System.out.print("Enter student marks: ");
        student.marks = input.nextInt();

        student.getDetails(student.name, student.rollNumber, student.marks);
        student.printDetails();
        student.getGrades(student.marks);



    }
}
