package com.linkedlist.circularlinkedlist.playlistmanagement;

public class DeleteSong {
    public static Song deleteSong(String songName, Song head) {
        if(head == null) return null;

        Song curr = head;
        Song prev = null;

        // List has one node
        if(head.next == head) {
            if (head.songName.equals(songName)) {
                System.out.println("Song deleted: " + songName);
                return null;
            }
            System.out.println("Song not found");
            return head;
        }

        // Deleting head
        if (head.songName.equals(songName)) {

            // find last node
            Song last = head;
            while(last.next != head) {
                last = last.next;
            }

            last.next = head.next;
            head = head.next;

            System.out.println("Song deleted: " + songName);
            return head;
        }

        // Delete middle or last node
        curr = head.next;
        prev = head;

        while(curr != head) {
            if(curr.songName.equals(songName)) {
                prev.next = curr.next;
                System.out.println("Song deleted: " + songName);
                return head;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Song not found");
        return head;
    }
}