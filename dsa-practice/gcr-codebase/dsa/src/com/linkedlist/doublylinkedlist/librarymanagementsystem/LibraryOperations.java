package com.linkedlist.doublylinkedlist.librarymanagementsystem;

public class LibraryOperations {

    // Add book at beginning
    public static Book addAtBeginning(Book newBook, Book head) {
        if (head != null) {
            newBook.next = head;
            head.prev = newBook;
        }
        return newBook;
    }

    // Add book at end
    public static Book addAtEnd(Book newBook, Book head) {
        if (head == null) return newBook;

        Book temp = head;
        while (temp.next != null) temp = temp.next;

        temp.next = newBook;
        newBook.prev = temp;

        return head;
    }

    // Add book at specific position (1-based index)
    public static Book addAtPosition(Book newBook, int position, Book head) {
        if (position == 1) return addAtBeginning(newBook, head);

        Book temp = head;
        for (int i = 1; temp != null && i < position - 1; i++)
            temp = temp.next;

        if (temp == null) return head; // invalid position

        newBook.next = temp.next;
        newBook.prev = temp;

        if (temp.next != null)
            temp.next.prev = newBook;

        temp.next = newBook;

        return head;
    }

    // Remove book by Book ID
    public static Book removeById(int id, Book head) {
        if (head == null) return null;

        // delete head
        if (head.bookId == id) {
            Book newHead = head.next;
            if (newHead != null) newHead.prev = null;
            return newHead;
        }

        Book temp = head;
        while (temp != null && temp.bookId != id)
            temp = temp.next;

        if (temp == null) return head; // not found

        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;

        return head;
    }

    // Search by Title
    public static Book searchByTitle(String title, Book head) {
        while (head != null) {
            if (head.title.equalsIgnoreCase(title)) return head;
            head = head.next;
        }
        return null;
    }

    // Search by Author
    public static Book searchByAuthor(String author, Book head) {
        while (head != null) {
            if (head.author.equalsIgnoreCase(author)) return head;
            head = head.next;
        }
        return null;
    }

    // Update availability status
    public static void updateAvailability(int id, boolean status, Book head) {
        while (head != null) {
            if (head.bookId == id) {
                head.available = status;
                return;
            }
            head = head.next;
        }
    }

    // Display forward
    public static void displayForward(Book head) {
        System.out.println("\n--- Books (Forward Order) ---");
        while (head != null) {
            printBook(head);
            head = head.next;
        }
    }

    // Display reverse
    public static void displayReverse(Book head) {
        if (head == null) return;

        while (head.next != null) head = head.next; // move to last

        System.out.println("\n--- Books (Reverse Order) ---");
        while (head != null) {
            printBook(head);
            head = head.prev;
        }
    }

    // Count total books
    public static int countBooks(Book head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    // Utility printer
    private static void printBook(Book b) {
        System.out.println(
            "ID: " + b.bookId +
            ", Title: " + b.title +
            ", Author: " + b.author +
            ", Genre: " + b.genre +
            ", Available: " + (b.available ? "Yes" : "No")
        );
    }
}
