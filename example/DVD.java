package org.example;

public class DVD extends Item{

    //Fields
    private String director;
    private int durationMinutes;

    //Constructor
    public DVD(String itemId, String title, String director, int durationMinutes) {
        super(itemId, title);
    }

    //Getters and Setters
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    //toString


    @Override
    public String toString() {
        return "DVD: " +
                "director='" + director + '\'' +
                ", durationMinutes=" + durationMinutes;
    }

    //Abstract Methods
    @Override
    public String getDescription() {
        return String.format("DVD: %s \n Directed by: %s \n Duration: %s mins ", getTitle(), director, durationMinutes);
    }



}
