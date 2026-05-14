package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class Library {

    private String libraryName;

    private Map<String, Item> itemCatalogue = new LinkedHashMap<>();

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }
    
}
