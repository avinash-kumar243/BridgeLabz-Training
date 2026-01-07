package com.encapsulation.librarymanagementsystem;

public class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        System.out.println("Book loan duration : 14 days");
        return 14;
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book reserved successfully");
        } else {
            System.out.println("Book is currently unavailable");
        }
    }

    @Override
    public boolean checkAvailability() {
        System.out.println("Book availability : " + isAvailable);
        return isAvailable;
    }
}