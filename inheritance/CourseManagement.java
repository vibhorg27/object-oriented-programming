package com.bridgelabz.inheritance;

// Base class: Course
class Course {
    protected String courseName;
    protected int duration; // in weeks

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseDetails() {
        return "Course: " + courseName + " | Duration: " + duration + " weeks";
    }
}

// Subclass: OnlineCourse (extends Course)
class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public String getCourseDetails() {
        return super.getCourseDetails() + " | Platform: " + platform + " | Recorded: " + (isRecorded ? "Yes" : "No");
    }
}

// Subclass: PaidOnlineCourse (extends OnlineCourse)
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // in percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public String getCourseDetails() {
        return super.getCourseDetails() + " | Fee: $" + fee + " | Discount: " + discount + "% | Final Price: $" + getFinalFee();
    }
}

// Main class to test multilevel inheritance
public class CourseManagement {
    public static void main(String[] args) {
        // Step 1: General Course
        Course course = new Course("Data Structures", 6);
        System.out.println(course.getCourseDetails());

        // Step 2: Online Course
        OnlineCourse onlineCourse = new OnlineCourse("Java Programming", 8, "Udemy", true);
        System.out.println(onlineCourse.getCourseDetails());

        // Step 3: Paid Online Course
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Machine Learning", 12, "Coursera", true, 299.99, 20);
        System.out.println(paidCourse.getCourseDetails());
    }
}

