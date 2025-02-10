package com.bridgelabz.constructors.levelone;

import java.util.Scanner;

class Course{
    String courseName;
    int duration;
    float fee;
    static StringBuilder instituteName = new StringBuilder("Srm");

    Course(String courseName, int duration, float fee){
        this.courseName = courseName;
        this.fee = fee;
        this.duration = duration;
//        Course.instituteName = instituteName;
    }

    public void displayCourseDetails(){
        System.out.println("Course Name: " + courseName);
        System.out.println("Course fees: " + fee);
        System.out.println("Course duration: " + duration);
        System.out.println("Institute Name: " + instituteName);

    }

    static void updateInstituteName(StringBuilder newInstituteName){
        instituteName = newInstituteName;
    }
}

public class OnlineCourseManagement {
    public static  void main(String[] args){
//        Course.instituteName = "SRM";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Course Name: ");
        String courseName = input.nextLine();

        System.out.print("Enter Course duration: ");
        int courseDuration = input.nextInt();

        System.out.print("Enter Course fees: ");
        float courseFee = input.nextFloat();


//      Creating course instances
        Course course = new Course(courseName, courseDuration, courseFee);
        Course course1 = new Course("Java", 4 , 399);

//      Display the details before update
        course.displayCourseDetails();
        System.out.println();
        course1.displayCourseDetails();

//      Update the institute name
        Course.updateInstituteName(new StringBuilder("SSn"));

//      Display the details after update
        course.displayCourseDetails();
        System.out.println();
        course1.displayCourseDetails();
    }


}
