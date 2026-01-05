package com.linkedlist.doublylinkedlist.librarymanagementsystem;


public class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean available;

    Book next;
    Book prev;

    public Book(String title, String author, String genre, int bookId, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.available = available;
        this.next = null;
        this.prev = null;
    }
}
