package com.encapsulation.librarymanagementsystem;

public class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        System.out.println("DVD loan duration : 3 days");
        return 3;
    }

    @Override
    public void reserveItem() {
        if(isAvailable) {
            isAvailable = false;
            System.out.println("DVD reserved successfully");
        } else {
            System.out.println("DVD is currently unavailable");
        }
    }

    @Override
    public boolean checkAvailability() {
        System.out.println("DVD availability : " + isAvailable);
        return isAvailable;
    }
}