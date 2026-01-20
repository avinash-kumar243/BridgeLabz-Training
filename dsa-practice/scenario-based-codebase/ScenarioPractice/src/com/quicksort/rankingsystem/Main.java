package com.quicksort.rankingsystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n--------------- GamerZone – High Score Ranking System (Quick Sort) ---------------\n");
		
		List<Player> players = new ArrayList<>();
		
		
		while(true) {
			System.out.println("\nEnter 1 to add a player details");
			System.out.println("Enter 2 to sort player details");
			System.out.println("Enter 3 display all player details");
			System.out.println("Enter 4 to exit");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			
			switch(choice) {
				case 1:
					System.out.println("Enter player id: ");
					String id = sc.nextLine();
					
					System.out.println("Enter score: ");
					int score = sc.nextInt();
					
					addPlayer(players, new Player(id, score));
					break;
					
				case 2:
					sortPlayer(players, 0, players.size()-1);
					System.out.println("Players are sorted by scores");
					break;
					
				case 3:
					displayPlayerDetails(players);
					break;
					
				case 4:
					System.out.println("Thank you");
					return;
					
				default:
					System.out.println("Invalid choice!!!");
			}
		}
	}
	

	// Add a player
	private static void addPlayer(List<Player> players, Player player) {
		players.add(player);
		System.out.println("Player added");
	}
	

	// sort player details by scores - Quick sort
	private static void sortPlayer(List<Player> players, int low, int high) {
		if(low < high) {
			int pi = partition(players, low, high);
			
			sortPlayer(players, low, pi-1);
			sortPlayer(players, pi+1, high);
		}
	}		
	private static int partition(List<Player> players, int low, int high) {
		int i = low-1;
		for(int j=low; j<high; j++) {
			if(players.get(j).getScore() > players.get(high).getScore()) {
				i++;
				
				Player player = players.get(i);
				players.set(i, players.get(j));
				players.set(j, player);
			}
		}
		
		i++;
		Player player = players.get(i);
		players.set(i, players.get(high));
		players.set(high, player);
		
		return i; 
	}


	// Displaying all players details
	private static void displayPlayerDetails(List<Player> players) {
		System.out.println("\nAll players details are: ");
		
		for(Player player : players) {
			System.out.println(player);
		}
	}
}