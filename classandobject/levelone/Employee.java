package com.bridgelabz.classandobject.levelone;

public class Employee {
    String name;
    int id;
    float salary;


    public void printDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Id: " + this.id);
        System.out.println("Salary: " + this.salary);
    }

}
class Main{
    public static void main(String[] args){
        Employee emp1 = new Employee();
        emp1.name = "Aditya";
        emp1.id =1;
        emp1.salary = 20000;

        emp1.printDetails();

        }
    }
