package org.example;

public class Book extends Item {

    //Fields
    private String ISBN;
    private String author;
    private String genre;


    //Constructor
    public Book(String itemId, String title, String ISBBN, String author, String genre) {
        super(itemId, title);
    }
    
    //Getters and Setters
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book: " +
                "ISBN='" + ISBN + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'';
    }

    
}
