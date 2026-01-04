package com.linkedlist.circularlinkedlist.playlistmanagement;

public class AddSong {
	
    // Add at beginning
    public static Song addSongAtBeginning(String name, String artist, int duration, Song head) {
        Song newSong = new Song(name, artist, duration);

        // empty list → point to itself
        if(head == null) {
            newSong.next = newSong;
            return newSong;
        }

        // find last node
        Song last = head;
        while(last.next != head) {
            last = last.next;
        }
        last.next = newSong;
        newSong.next = head;
        return newSong;
    }

    // Add at middle (position starts at 1)
    public static Song addSongAtMiddle(String name, String artist, int duration, int position, Song head) {
        if(position <= 1 || head == null) return addSongAtBeginning(name, artist, duration, head);

        Song newSong = new Song(name, artist, duration);
        Song temp = head;
        int index = 1;

        // Stop at node before target position or last node
        while(index < position - 1 && temp.next != head) {
            temp = temp.next;
            index++;
        }
        newSong.next = temp.next;
        temp.next = newSong;
        return head;
    }

    // Add Song at end
    public static Song addSongAtEnd(String name, String artist, int duration, Song head) {
        Song newSong = new Song(name, artist, duration);

        // empty list → self loop
        if(head == null) {
            newSong.next = newSong;
            return newSong;
        }

        Song temp = head;
        while(temp.next != head) {
            temp = temp.next;
        }
        temp.next = newSong;
        newSong.next = head;
        return head;
    }
}