package com.linkedlist.doublylinkedlist.texteditormanagement;

public class TextHistoryManager {

    private TextState head;      // first state
    private TextState tail;      // last state
    private TextState current;   // current active state
    private final int LIMIT;     // max history size
    private int size;

    public TextHistoryManager(int limit) {
        this.LIMIT = limit;
        this.size = 0;
    }

    // Add new text state (record user action)
    public void addState(String newText) {

        // If undo was used earlier, clear redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        TextState newState = new TextState(newText);

        if (head == null) {
            head = tail = current = newState;
        } else {
            tail.next = newState;
            newState.prev = tail;
            tail = newState;
            current = newState;
        }

        size++;

        // Enforce history size limit
        if (size > LIMIT) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo -> move to previous state
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo performed.");
        } else {
            System.out.println("No more undo available.");
        }
    }

    // Redo -> move to next state
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo performed.");
        } else {
            System.out.println("No more redo available.");
        }
    }

    // Display current editor content
    public void displayCurrentState() {
        if (current == null)
            System.out.println("Editor is empty.");
        else
            System.out.println("Current Text: " + current.text);
    }
}
