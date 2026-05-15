package org.example;

public class Magazine extends Item{

    //Fields
    private int issueNumber;
    private String publisher;

    //Constructor
    public Magazine(String itemId, String title, int issueNumber, String publisher) {
        super(itemId, title);
    }

    //Getters and Setters
    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    //toString
    @Override
    public String toString() {
        return "Magazine: " +
                "issueNumber=" + issueNumber +
                ", publisher='" + publisher;
    }

    //Abstract Methods
    @Override
    public String getDescription() {
        return String.format("Magazine: %s \n Issue Number: %d \n Publisher: %s", getTitle(), issueNumber, publisher);
    }
}
