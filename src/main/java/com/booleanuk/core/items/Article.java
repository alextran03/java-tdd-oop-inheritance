package com.booleanuk.core.items;
import com.booleanuk.core.Author;

public class Article extends LibraryItem{

    private Author author;

    public Article(String title, Author author) {
        super(title);
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }
}
