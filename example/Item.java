package org.example;

public class Item implements Comparable<Item>{

    //Fields
    private String itemId;
    private String title;
    private ItemStatus status;

    public enum ItemStatus{
        IN_STORE, BORROWED, LOST
    }

    //Constructor
    public Item(String itemId, String title) {
        this.itemId = itemId;
        this.title = title;
        this.status = ItemStatus.IN_STORE;
    }

    //Getters and Setters
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ItemStatus getStatus() {
        return status;
    }

    public void setStatus(ItemStatus status) {
        this.status = status;
    }

    //ToString
    @Override
    public String toString() {
        return "Item: " +
                "itemId='" + itemId + '\'' +
                ", title='" + title + '\'' +
                ", status=" + status;
    }

    //CompareTo
    @Override
    public int compareTo(Item o) {
        return 0;
    }
}
