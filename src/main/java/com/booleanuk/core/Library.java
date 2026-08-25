package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

import com.booleanuk.core.items.Article;
import com.booleanuk.core.items.Book;
import com.booleanuk.core.items.LibraryItem;

public class Library {
    private List<LibraryItem> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addToStock(LibraryItem item) {
        this.items.add(item);
    }

    public String checkOut(String title) {
        List<LibraryItem> filtered = this.items.stream().filter(item -> item.getTitle().equals(title)).toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }

    public String checkIn(String title) {
        List<LibraryItem> filtered = this.items.stream().filter(item -> item.getTitle().equals(title)).toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }

    public List<LibraryItem> getItems() {
        return items;
    }


}
