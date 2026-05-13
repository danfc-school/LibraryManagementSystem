package org.example;

public class Book extends Item {

    //Fields
    private String ISBN;
    private String author;
    private String genre;


    //Constructor
    public Book(String itemId, String title) {
        super(itemId, title);
    }

    
}
