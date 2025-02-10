package com.bridgelabz.constructors.levelone;

import java.util.Scanner;

class HotelBooking{
    String guestName;
    String roomType;
    int numberOfNights;

    //Default constructor
    HotelBooking(){
        System.out.println("This is a default constructor");
    }

    //Parametrized constructor
    HotelBooking(String guestName, String roomType , int numberOfNights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        System.out.println("This is a parametrized constructor");
    }

    //copy Constructor
    HotelBooking(HotelBooking prevBooking){
        this.guestName = prevBooking.guestName;
        this.roomType = prevBooking.roomType;
        this.numberOfNights = prevBooking.numberOfNights;
        System.out.println("This is a copy constructor");

    }

    public void printDetails(){
        System.out.println("Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + numberOfNights);
    }

}

public class Hotel {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter room Type: ");
        String roomType = input.nextLine();

        System.out.print("Enter number of nights: ");
        int numberOfNights = input.nextInt();

        //Object of the default constructor
        HotelBooking bookingOne = new HotelBooking();
        System.out.println();

        //Object of the parameterized Constructor
        HotelBooking bookingTwo = new HotelBooking(name, roomType, numberOfNights);
        bookingTwo.printDetails();
        System.out.println();

        //Object of copy Constructor
        HotelBooking bookingThree = new HotelBooking(bookingTwo);
        bookingThree.printDetails();
        System.out.println();
    }
}
