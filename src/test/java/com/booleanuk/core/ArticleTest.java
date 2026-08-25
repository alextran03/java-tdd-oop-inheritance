package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.booleanuk.core.*;
import com.booleanuk.core.items.Article;
import com.booleanuk.core.items.Book;

class ArticleTest {

    Author author = new Author("Test Author", "test@example.com", "example.com");
    Book book = new Book("example", author);
    
    @Test
    public void shouldCheckOutIfAvailable() {
        Article article = new Article("example", author);
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Article article = new Article("example", author);
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Article article = new Article("example", author);
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Article article = new Article("example", author);

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }
}
