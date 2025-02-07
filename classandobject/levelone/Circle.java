package com.bridgelabz.classandobject.levelone;
import java.util.Scanner;

public class Circle {

    double radius;
    public double getArea(double radius){
        return 3.14 * radius * radius;
    }

    public double getCircumference(double radius){
        return 2 * 3.14 * radius;
    }
}

class CircleDetails{
    public static void main(String[] args){
        Circle c1 = new Circle();
        Scanner input = new Scanner(System.in);
        c1.radius = input.nextDouble();

        System.out.println("Area of the circle is: " + c1.getArea(c1.radius));
        System.out.println("Circumference of the circle is: " + c1.getCircumference(c1.radius));

    }
}
