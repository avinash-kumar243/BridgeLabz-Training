package com.linkedlist.doublylinkedlist.texteditormanagement;

public class Main {
    public static void main(String[] args) {

        TextHistoryManager editor = new TextHistoryManager(10); // limit = 10 states

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        // New typing after undo clears redo history
        editor.addState("Hello Java Developers");
        editor.displayCurrentState();
    }
}
