package com.insertionsort.sortartist;

import java.time.LocalTime;

public class Artist {
	private String artistName;
	private LocalTime registrationTime;
	
	public Artist(String artistName, LocalTime registrationTime) {
		this.artistName = artistName;
		this.registrationTime = registrationTime;
	}

	
	// Getters for artist
	public String getArtistName() {
		return artistName;
	}
	public LocalTime getRegistrationTime() {
		return registrationTime;
	}
	
	 
	@Override
	public String toString() {
		return "Artist name: " + artistName + " || registration date: " + registrationTime;
	}
}