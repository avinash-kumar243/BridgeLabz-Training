package com.quicksort.rankingsystem;

public class Player {
	private String playerId;
	private int score;
	
	public Player(String playerId, int score) {
		this.playerId = playerId;
		this.score = score;
	}

	
	// Getters for player details
	public String getPlayerId() {
		return playerId;
	}
	public int getScore() {
		return score;
	}
	
	
	@Override
	public String toString() {
		return "Player id: " + playerId + ", score: " + score; 
	}
}