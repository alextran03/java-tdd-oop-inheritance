package com.booleanuk.core;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.booleanuk.core.items.Article;
import com.booleanuk.core.items.Book;

public class LibraryTest {
    
    Author author = new Author("Test Author", "test@example.com", "example.com");
    Book book = new Book("example", author);

    @Test
    public void testAddToStock() {
        Library library = new Library();
        Newspaper newspaper = new Newspaper("testNewspaper");
        Book book = new Book("testBook", author);
        Article article = new Article("testArticle", author);

        library.addToStock(newspaper);
        library.addToStock(book);
        library.addToStock(article);

        Assertions.assertTrue(library.getItems().contains(book));
        Assertions.assertTrue(library.getItems().contains(newspaper));
        Assertions.assertTrue(library.getItems().contains(article));
    }

    @Test
    public void testCheckOutFromStock() {
        Library library = new Library();
        library.addToStock(new Book("testBook", author));
        library.addToStock(new Article("testArticle", author));
        library.addToStock(new Newspaper("testNewspaper"));

        Assertions.assertEquals("item has been checked out", library.checkOut("testBook"));
        Assertions.assertEquals("item has been checked out", library.checkOut("testArticle"));
        Assertions.assertEquals("newspapers are not available for loan", library.checkOut("testNewspaper"));
    }

    @Test
    public void testCheckOutUnkownItem() {
        Library library = new Library();

        Assertions.assertEquals("item is not part of the library's collection",
        library.checkOut("Nonexistent"));
    }

    @Test
    public void testCheckInFromStock() {
      Library library = new Library();

      library.addToStock(new Book("testBook", author));
      library.addToStock(new Article("testArticle", author));
      library.addToStock(new Newspaper("testNewspapper"));

      library.checkOut("testBook");
      library.checkOut("testArticle");

      Assertions.assertEquals("item has been checked in", library.checkIn("testBook"));
      Assertions.assertEquals("item has been checked in", library.checkIn("testArticle"));
      Assertions.assertEquals("newspapers are not available for loan",
      library.checkIn("testNewspapper"));
    }
    
}
