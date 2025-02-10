package com.bridgelabz.constructors.levelone;

class Book{
    String title;
    String author;
    float price;

    Book(){
        System.out.println("This is a default constructor");
    }

    Book(String title, String author, float price){
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println(title + " by " + author + " is priced at Rs " + price);
    }
}

public class BookDetails {
    public static void main(String[] args){
        Book book = new Book();
        Book books = new Book("Norwegian Woods", "Murakami", 599);
    }
}
