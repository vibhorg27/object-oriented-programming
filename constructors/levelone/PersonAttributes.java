package com.bridgelabz.constructors.levelone;

import java.util.Scanner;

class Person{
    String name;
    double height;
    double weight;

    Person(String name, double height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    Person(Person copyAttributes){
        this.name = copyAttributes.name;
        this.height = copyAttributes.height;
        this.weight = copyAttributes.weight;
    }

    public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }
}

public class PersonAttributes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        double height = input.nextDouble();
        double weight = input.nextDouble();

        //Creating an object of person class
        Person person = new Person(name, height, weight);
        person.printDetails();

        System.out.println();

        Person personCopy = new Person(person);
        personCopy.printDetails();

    }
}
