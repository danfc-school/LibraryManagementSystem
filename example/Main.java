package org.example;


public class Main {
    static void main() {

        System.out.println("Library Management System - \n");

        Library library = new Library("City Central Library");

        //Books
        library.addItem(new Book("B-001", "Harry Potter", "123456789", "J.K ROWLING", "MAGIC"));
        library.addItem(new Book("B-002", "Ubik", "987654321", "Philip K. Dick", "Supernatural"));
        library.addItem(new Book("B-003", "1984", "135792468", "George Orwell", "Dystopia"));

        System.out.println("\n Descriptions:");
        library.getAllItems().forEach(item -> System.out.println(" " + item.getDescription()));
    }
}
