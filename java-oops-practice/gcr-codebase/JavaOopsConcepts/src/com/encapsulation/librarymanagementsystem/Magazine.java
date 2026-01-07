package com.encapsulation.librarymanagementsystem;

public class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        System.out.println("Magazine loan duration : 7 days");
        return 7;
    }

    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Magazine reserved successfully");
        } else {
            System.out.println("Magazine is currently unavailable");
        }
    }

    @Override
    public boolean checkAvailability() {
        System.out.println("Magazine availability : " + isAvailable);
        return isAvailable;
    }
}