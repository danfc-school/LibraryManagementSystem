package org.example;

public class Item implements Comparable<Item>{

    private String itemId;
    private String title;
    private ItemStatus status;

    public enum ItemStatus{
        IN_STORE, BORROWED, LOST
    }
    @Override
    public int compareTo(Item o) {
        return 0;
    }
}
