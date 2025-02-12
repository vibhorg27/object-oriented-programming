package com.bridgelabz.objectmodelling;

import java.util.ArrayList;
import java.util.List;

// Book class
class Book{
    private String title;
    private String author;

//  Book class constructor to take book title and author title input
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

//  getter to get title
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public void displayBookDetails(){
        System.out.println("Book Name: " + title + " , Author: " + author);

    }

}

class Library{
    private String libraryName;
    private List<Book> books;

    Library(String libraryName){
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void displayLibraryBooks(){
        System.out.println(libraryName + " has the following books:");
        for(Book book : books){
            book.displayBookDetails();
        }
    }
}

public class LibraryAndBooks {
    public static void main(String[] args){
        Book book1 = new Book("The Alchemist" , "Paulo Coehlo");
        Book book2 = new Book("Norwegian Woods" , "Murakamai");
        Book book3 = new Book("Panchtantra" , "Vishnu Sharma" );

        Library cityLibrary = new Library("City Library");
        Library uniLibrary = new Library("University Library");

        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);

        uniLibrary.addBook(book3);

        cityLibrary.displayLibraryBooks();
        System.out.println();

        uniLibrary.displayLibraryBooks();
        System.out.println();
    }
}
