package com.insertionsort.sortartist;

import java.util.ArrayList;
import java.util.List;

public class ArtistSort {
	List<Artist> artists = new ArrayList<>();

	// Add artist
	public void addArtist(Artist artist) {
		artists.add(artist);
		System.out.println("Artist added");
	}

	// Sort artists - Insertion Sort
	public void sortArtists() {
		int n = artists.size();
		
		for(int i=1; i<n; i++) {
			int j = i-1;
			Artist top = artists.get(i);
			
			while(j >= 0 && artists.get(j).getRegistrationTime().isAfter(top.getRegistrationTime())) {
				artists.set(j+1, artists.get(j));
				j--;
			}
			
			// Put last artist at its correct position
			j++;
			artists.set(j, top);			
		}		
		System.out.println("Artists sorted");
	}
	
	// print Artist details
	public void showArtistDetails() {
		if(artists.isEmpty()) {
			System.out.println("No Artist Registration till yet");
			return;
		}
		
		System.out.println("\nArtists details are: ");
		for(Artist artist : artists) {
			System.out.println(artist);
		}
	}	
}