package com.encapsulation.librarymanagementsystem;

public abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    private String borrowerName;   

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public void assignBorrower(String borrowerName) {
        this.borrowerName = borrowerName;
    }
    public String getBorrowerName() {
        return borrowerName;
    }

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public abstract int getLoanDuration();
}