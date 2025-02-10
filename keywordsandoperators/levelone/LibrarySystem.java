package com.bridgelabz.keywordsandoperators.levelone;

class Book {
    private static String libraryName = "City Library";
    private final String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book("978-1234567890", "Java Programming", "James Gosling");
        book1.displayBookDetails();
        Book.displayLibraryName();
    }
}

