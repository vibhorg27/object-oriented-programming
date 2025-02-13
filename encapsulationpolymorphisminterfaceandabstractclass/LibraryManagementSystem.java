package com.bridgelabz.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;
import java.util.List;

// Reservable interface
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Abstract class LibraryItem
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean isReserved;
    private String borrowerName; // Encapsulated borrower details

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
        this.borrowerName = null;
    }

    // Getters
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isReserved() {
        return isReserved;
    }

    // Abstract method to define loan duration per item type
    public abstract int getLoanDuration();

    // Concrete method to display item details
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("Availability: " + (isReserved ? "Reserved by " + borrowerName : "Available"));
    }

    // Encapsulation - Secure borrower details
    protected void setReserved(boolean reserved, String borrowerName) {
        this.isReserved = reserved;
        this.borrowerName = borrowerName;
    }
}

// Subclass Book implementing Reservable
class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // Books have a loan duration of 14 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setReserved(true, borrowerName);
            System.out.println(borrowerName + " has reserved the book: " + getTitle());
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Subclass Magazine implementing Reservable
class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines have a loan duration of 7 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setReserved(true, borrowerName);
            System.out.println(borrowerName + " has reserved the magazine: " + getTitle());
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Subclass DVD implementing Reservable
class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5; // DVDs have a loan duration of 5 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setReserved(true, borrowerName);
            System.out.println(borrowerName + " has reserved the DVD: " + getTitle());
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Main class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> libraryItems = new ArrayList<>();

        Book book1 = new Book("B101", "Java Programming", "James Gosling");
        Magazine mag1 = new Magazine("M202", "Tech Monthly", "TechWorld");
        DVD dvd1 = new DVD("D303", "Inception", "Christopher Nolan");

        libraryItems.add(book1);
        libraryItems.add(mag1);
        libraryItems.add(dvd1);

        // Polymorphism: Process all items dynamically
        for (LibraryItem item : libraryItems) {
            item.getItemDetails();
            System.out.println("----------------------");
        }

        // Reserving items using Reservable interface
        book1.reserveItem("Alice");
        mag1.reserveItem("Bob");
        dvd1.reserveItem("Charlie");

        System.out.println("\n After Reservations:");
        for (LibraryItem item : libraryItems) {
            item.getItemDetails();
            System.out.println("----------------------");
        }
    }
}

