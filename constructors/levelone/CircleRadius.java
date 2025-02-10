package com.bridgelabz.constructors.levelone;

import java.util.Scanner;

class Circle{
    float radius;

    Circle(){
        this.radius = 4;
        System.out.println(this.radius + " is the default radius.");
    }

    Circle(float radius){
        this.radius = radius;
        System.out.println(radius + " is the user defined radius");
    }
}
public class CircleRadius {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Circle circleDefault = new Circle();

        System.out.print("Enter radius: ");
        float radius = input.nextInt();
        Circle circle = new Circle(radius);
    }
}
