package com.bridgelabz.constructors.levelone;

// Parent class: Book
class BooksDetails {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public BooksDetails(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter method for author
    public String getAuthor() {
        return author;
    }

    // Setter method for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook
class EBook extends BooksDetails {
    private String fileSize;

    // Constructor
    public EBook(String ISBN, String title, String author, String fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method to display eBook details (calls superclass method)
    public void displayEBookDetails() {
        displayBookDetails();
        System.out.println("File Size: " + fileSize);
    }
}

// Main class
public class BookLibrarySystem {
    public static void main(String[] args) {
        BooksDetails book = new BooksDetails("123-456789", "Java Programming", "John Doe");
        book.displayBookDetails();

        book.setAuthor("Jane Smith");
        System.out.println("\nUpdated Author: " + book.getAuthor());

        EBook ebook = new EBook("987-654321", "Python Programming", "Alice Brown", "5MB");
        System.out.println("\nEBook Details:");
        ebook.displayEBookDetails();
    }
}
