package com.linkedlist.circularlinkedlist.playlistmanagement;

public class NextSong {
    // Returns the next song in the circular list
    public static Song playNextSong(Song current) {
        if(current == null) {
            System.out.println("Playlist is empty");
            return null;
        }

        current = current.next;
        
        System.out.println("Song: " + current.songName);
        System.out.println("Artist: " + current.artistName);
        System.out.println("Duration: " + current.duration);
        
        return current;
    }
}