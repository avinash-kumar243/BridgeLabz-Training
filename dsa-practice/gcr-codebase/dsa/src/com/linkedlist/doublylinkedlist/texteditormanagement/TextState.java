package com.linkedlist.doublylinkedlist.texteditormanagement;

public class TextState {
    String text;
    TextState prev;
    TextState next;

    public TextState(String text) {
        this.text = text;
        this.prev = null;
        this.next = null;
    }
}
