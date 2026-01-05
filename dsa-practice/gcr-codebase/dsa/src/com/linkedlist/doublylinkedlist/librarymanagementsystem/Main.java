package com.linkedlist.doublylinkedlist.librarymanagementsystem;



public class Main {
    public static void main(String[] args) {

        Book head = new Book("The Alchemist", "Paulo Coelho", "Fiction", 101, true);

        head = LibraryOperations.addAtEnd(new Book("Atomic Habits", "James Clear", "Self Help", 102, true), head);
        head = LibraryOperations.addAtBeginning(new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "Finance", 103, false), head);
        head = LibraryOperations.addAtPosition(new Book("Invisible Man", "Ralph Ellison", "Novel", 104, true), 2, head);

        LibraryOperations.displayForward(head);
        LibraryOperations.displayReverse(head);

        // Update availability
        LibraryOperations.updateAvailability(102, false, head);

        // Remove book
        head = LibraryOperations.removeById(101, head);

        System.out.println("\nAfter Update and Deletion:");
        LibraryOperations.displayForward(head);

        // Count books
        System.out.println("\nTotal Books: " + LibraryOperations.countBooks(head));

        // Search examples
        Book found = LibraryOperations.searchByAuthor("James Clear", head);
        if (found != null)
            System.out.println("\nSearch Result: " + found.title);
    }
}
