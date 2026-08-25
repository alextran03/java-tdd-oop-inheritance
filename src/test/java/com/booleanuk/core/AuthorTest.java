package com.booleanuk.core;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthorTest {

    @Test
    public void shouldReturnName() {
        Author author = new Author("Rackaren", "rackare@rackaren.com", "rackare.com");

        Assertions.assertEquals("Rackaren", author.getName());
    }

    @Test
    public void shouldReturnContactInformation() {
        Author author = new Author("Rackaren", "rackare@rackaren.com", "rackaren.com");

        Assertions.assertEquals("rackare@rackaren.com", author.getContactInformation());
    }
    
    @Test
    public void shouldReturnWebsite() {
        Author author = new Author("Rackaren", "rackare@rackaren.com", "rackaren.com");

        Assertions.assertEquals("rackaren.com", author.getWebsite());
    }
}
