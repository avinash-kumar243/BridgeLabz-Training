package com.linkedlist.circularlinkedlist.playlistmanagement;

public class DisplaySongs {
	public static void displaySong(Song head) {
		Song song = head;
		while(song.next != head) {
			System.out.println("\nSong name: " + song.songName);
			System.out.println("Artist name: " + song.artistName);
			System.out.println("Total duration of the song is: " + song.duration);
			
			song = song.next;
		}
	}
}