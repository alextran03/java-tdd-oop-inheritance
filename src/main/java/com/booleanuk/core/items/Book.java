package com.booleanuk.core.items;

import com.booleanuk.core.Author;

public class Book extends LibraryItem{

    private Author author;

    public Book(String title, Author author) {
        super(title);
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }
}
