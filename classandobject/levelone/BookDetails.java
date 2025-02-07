package com.bridgelabz.classandobject.levelone;

import com.bridgelabz.constructors.levelone.UniversityManagementSystem.*;

import java.util.Scanner;

class Book{
    String bookTitle;
    String author;
    double price;

    public void printBookDetails(){
        System.out.println("Book Title: " + this.bookTitle);
        System.out.println("Author Name: " + this.author);
        System.out.println("Price: " + this.price);
    }
}

public class BookDetails {
    public static void main(String[] args){
        Book b1 = new Book();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Book title: ");
        b1.bookTitle = input.nextLine();
        System.out.print("Enter Author: ");
        b1.author = input.nextLine();
        System.out.print("Enter price: ");
        b1.price = input.nextDouble();

        b1.printBookDetails();

    }
}
