package com.linkedlist.circularlinkedlist.playlistmanagement;

// Node class
public class Song {
	protected String songName;
	protected String artistName;
	protected int duration;
	Song next;
	
	public Song(String songName, String artistName, int duration) {
		this.songName = songName;
		this.artistName = artistName;
		this.duration = duration;
		this.next = this;
	}
}