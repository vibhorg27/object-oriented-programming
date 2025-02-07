package com.bridgelabz.classandobject.levetwo;

import java.util.Scanner;

class MovieTicket{
    String movie;
    int seatNumber;
    double price;

    public void bookTicket(int seatNumber, double price){
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void getBookingDetails(){
        System.out.println("Movie name: " + this.movie);
        System.out.println("Seat number: " + this.seatNumber);
        System.out.println("Movie Price: " + this.price);

    }

}

public class MovieTicketBooking {
    public static void main(String[] args){
        MovieTicket booking = new MovieTicket();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Movie name: ");
        booking.movie = input.nextLine();

        System.out.print("Enter seat number: ");
        booking.seatNumber = input.nextInt();

        System.out.print("Enter price: ");
        booking.price = input.nextDouble();

        booking.bookTicket(booking.seatNumber, booking.price);
        booking.getBookingDetails();
    }
}
