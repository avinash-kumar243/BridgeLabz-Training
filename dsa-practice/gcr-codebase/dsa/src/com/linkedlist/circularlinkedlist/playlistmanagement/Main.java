package com.linkedlist.circularlinkedlist.playlistmanagement;

public class Main {
	public static void main(String[] args) {
		
		// Creating a song LinkedList
		Song head = new Song("O Maahi", "Arijit Singh", 225);
		
		// Adding songs into LinkedList
		System.out.println("\n---------- Adding a song ----------\n");
		head = AddSong.addSongAtBeginning("Ab Tumhare Hawale Watan Saathiyon", "Divya Khosla", 1000, head);
		head = AddSong.addSongAtMiddle("Apna Bana Le", " Arijit Singh", 260, 2, head);
		head = AddSong.addSongAtEnd("Dil To Pagal Hai", "Lata Mangeshkar & Udit Narayan", 325, head);
		
		DisplaySongs.displaySong(head);
		
		// Deleting a song form LinkedList
		System.out.println("\n---------- Deleting a song ----------\n");
		head = DeleteSong.deleteSong("Apna Bana Le", head);
		System.out.println("\nRemaining songs are :- ");
		
		DisplaySongs.displaySong(head);
		
		
		System.out.println("\n---------- Next Song is playing ----------\n");
		Song nextSong = NextSong.playNextSong(head);
	}
} 