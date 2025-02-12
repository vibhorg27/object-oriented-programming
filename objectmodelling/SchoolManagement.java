package com.bridgelabz.objectmodelling;

import java.util.ArrayList;
import java.util.List;

class Courses{
    private String courseName;

    private List<Student> enrolledStudents;

    public Courses(String courseName){
        this.courseName = courseName;

        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName(){
        return courseName;
    }

//    Setter for enrolling student in course
    public void enrollStudents(Student student){
        enrolledStudents.add(student);
    }

    public void displayEnrolledStudents(){
        System.out.println("Course name: " + courseName + " has the following enrolled students");
        for(Student s : enrolledStudents){
            System.out.println("- " + s.getStudentName() );
        }
    }
}

// Association Student <--> Courses
class Student{
    private String studentName;
    private List<Courses> enrolledCourses;


    public Student(String studentName){
        this.studentName = studentName;
        this.enrolledCourses = new ArrayList<>();

    }
//    Getter function to get student name
    public String getStudentName(){
        return studentName;
    }

    public void enrollInCourse(Courses course){
        enrolledCourses.add(course);
        course.enrollStudents(this);
    }

    public void displayEnrolledCourses() {
        System.out.println("\nStudent: " + studentName);
        for (Courses course : enrolledCourses) {
            System.out.println(" - " + course.getCourseName());
        }
    }
}

// Aggregation with students School -> Student
class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("\nSchool: " + schoolName);
        for (Student student : students) {
            System.out.println(" - " + student.getStudentName());
        }
    }
}

// Main Class
public class SchoolManagement {
    public static void main(String[] args) {
        // Create School
        School school = new School("Greenwood High");

        // Create Students
        Student student1 = new Student("Vibhor");
        Student student2 = new Student("Mayank");

        // Add students to School (Aggregation)
        school.addStudent(student1);
        school.addStudent(student2);

        // Create Courses
        Courses math = new Courses("Mathematics");
        Courses science = new Courses("Science");
        Courses history = new Courses("History");

        // Students enroll in courses (Many-to-Many Association)
        student1.enrollInCourse(math);
        student1.enrollInCourse(science);
        student2.enrollInCourse(math);
        student2.enrollInCourse(history);

        // Display Information
        school.displayStudents(); // Aggregation
        student1.displayEnrolledCourses(); // Association
        student2.displayEnrolledCourses(); // Association
        math.displayEnrolledStudents(); // Association
        science.displayEnrolledStudents();
        history.displayEnrolledStudents();
    }
}

