package com.bridgelabz.inheritance;

// Superclass Book
class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Publication Year: " + publicationYear);
    }
}

// Subclass Author
class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name + ", Bio: " + bio);
    }
}

// Main class to demonstrate single inheritance
public class Library {
    public static void main(String[] args) {
        Author book1 = new Author("The Great Gatsby", 1925, "F. Scott Fitzgerald", "An American novelist and short-story writer.");
        book1.displayInfo();
    }
}

