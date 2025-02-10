package com.bridgelabz.constructors.levelone;

import java.util.Scanner;

class Books{
    String title;
    String author;
    double price;
    boolean available;

    public void isBookAvailable(){
        if(this.available){
            this.available = false;
            System.out.println("Book is available");
        }
        else System.out.println("Book is unavailable");
    }

    public void getDetails(){
        System.out.println("Book Name: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + available);

    }
}
public class LibraryBookSystem {
    public static void main(String[] args){
        Books books = new Books();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Book name: ");
        books.title = input.nextLine();

        System.out.print("Enter author name: ");
        books.author = input.nextLine();

        System.out.print("Enter Book price: ");
        books.price = input.nextInt();

        System.out.print("Enter book availability: ");
        books.available = input.nextBoolean();

        books.isBookAvailable();

        System.out.println();

        books.getDetails();

    }
}
