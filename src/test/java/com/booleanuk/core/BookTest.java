package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.booleanuk.core.items.Book;

public class BookTest {
    Author author = new Author("Test Author", "test@example.com", "example.com");
    Book book = new Book("example", author);

    @Test
    public void shouldCheckOutIfAvailable() {
        Book book = new Book("example", author);
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Book book = new Book("example", author);
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Book book = new Book("example", author);
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Book book = new Book("example", author);

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }
}
