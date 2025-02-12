package com.bridgelabz.objectmodelling;

import java.util.ArrayList;
import java.util.List;

// Course Class (Aggregation: Exists independently but linked to Students & Professors)
class Course {
    private String courseName;
    private Professor professor;
    private List<Students> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(Students student) {
        enrolledStudents.add(student);
    }

    public void displayCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        if (professor != null) {
            System.out.println("Taught by: " + professor.getName());
        } else {
            System.out.println("No professor assigned yet.");
        }
        System.out.println("Enrolled Students:");
        for (Students student : enrolledStudents) {
            System.out.println(" - " + student.getName());
        }
    }
}

// Professor Class (Aggregation: Exists independently but linked to Courses)
class Professor {
    private String name;
    private List<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void teachCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this);
    }

    public void displayProfessorCourses() {
        System.out.println("\nProfessor: " + name);
        System.out.println("Teaches Courses:");
        for (Course course : courses) {
            System.out.println(" - " + course.getCourseName());
        }
    }
}

// Student Class (Association: Can enroll in multiple courses)
class Students {
    private String name;
    private List<Course> courses;

    public Students(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void displayStudentCourses() {
        System.out.println("\nStudent: " + name);
        System.out.println("Enrolled Courses:");
        for (Course course : courses) {
            System.out.println(" - " + course.getCourseName());
        }
    }
}

// Main Class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        Students student1 = new Students("Vibhor");
        Students student2 = new Students("Leon");

        Professor professor1 = new Professor("Dr. Gupta");
        Professor professor2 = new Professor("Dr. Jha");

        Course course1 = new Course("Computer Science");
        Course course2 = new Course("Mathematics");

        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student1.enrollCourse(course2);

        professor1.teachCourse(course1);
        professor2.teachCourse(course2);

        student1.displayStudentCourses();
        student2.displayStudentCourses();

        professor1.displayProfessorCourses();
        professor2.displayProfessorCourses();

        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}

