package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class Library {

    private String libraryName;

    private Map<String, Item> itemCatalogue = new LinkedHashMap<>();

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }
    //Adds a new item
    public void addItem(Item item) {
        itemCatalogue.put(item.getItemId(), item);
    }

    //Gets items by its personal id
    public Item getItemById(String itemId) {
        Item item = itemCatalogue.get(itemId);
        return item;
    }

    //Removes items by their Id's and returns it
    public Item removeItem(String itemId) {
        Item removed = itemCatalogue.remove(itemId);
        return removed;
    }

    //Returns all the items we got
    public List<Item> getAllItems() {

        return Collections.unmodifiableList(new ArrayList<>(itemCatalogue.values()));
    }

    // Getters

    public String getLibraryName() {
        return libraryName;
    }

    //toString
    @Override
    public String toString() {
        return "Library: " +
                "libraryName='" + libraryName + '\'' +
                ", itemCatalogue=" + itemCatalogue;
    }
    
}
