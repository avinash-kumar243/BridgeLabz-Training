package com.encapsulation.librarymanagementsystem;

public class LibraryMain {
    public static void main(String[] args) {
        LibraryItem item1 = new Book("B101", "Java Programming", "James Gosling");
        LibraryItem item2 = new Magazine("M202", "AI Monthly", "Tech Press");
        LibraryItem item3 = new DVD("D303", "Inception", "Christopher Nolan");

        item1.getItemDetails();
        item1.getLoanDuration();

        item2.getItemDetails();
        item2.getLoanDuration();

        item3.getItemDetails();
        item3.getLoanDuration();

        Reservable r1 = (Reservable) item1;
        r1.reserveItem();
        r1.checkAvailability();
    }
}