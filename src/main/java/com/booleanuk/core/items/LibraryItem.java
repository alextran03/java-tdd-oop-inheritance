package com.booleanuk.core.items;

public abstract class LibraryItem {
    private String title;
    boolean onLoan = false;
    
      public LibraryItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public String checkIn() {
        if (!this.isOnLoan()) {
            return "item is not currently on loan";
        }
        this.onLoan = false;
        return "item has been checked in";
    }

    public String checkOut() {
        if (this.isOnLoan()) {
            return "item is currently on loan";
        }
        this.onLoan = true;
        return "item has been checked out";
    }
}
