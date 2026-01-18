package com.bagandballorganizer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
	
	Map<Bag, List<Ball>> map = new HashMap<>();

	
	// Adding a bag 
	public void addBag(Bag newBag) {
		for(Bag bag : map.keySet()) {
			if(bag.getId().equals(newBag.getId())) {
				System.out.println("Bag with this id already exist");
				return; 
			}
		}
		
		map.put(newBag, new ArrayList<>());
		System.out.println("Bag added successfully");
	}

	
	// Adding a ball to a bag
	public void addBallToBag(Ball ball, String bagId) {
		for(Bag bag : map.keySet()) {
			if(bag.getId().equalsIgnoreCase(bagId)) {
				
				// Check if bag full or not
				if(bag.getCapacity() == map.get(bag).size()) {
					System.out.println("Bag full!!!");
					return; 
				}
				
				// Check if ball with this id already exist or not
				for(Ball currBall : map.get(bag)) {
					 if(currBall.getId().equalsIgnoreCase(ball.getId())) {
						 System.out.println("Ball with this id already exist");
						 return;
					 }
				}
				
				// Add ball to bag
				map.get(bag).add(ball);
				System.out.println("Ball added into bag successfully");
				return;
			}
		}
		
		System.out.println("Bag not found!!!");
	}


	// Removing a ball from a bag
	public void removeBallFromBag(String ballId, String bagId) {
		for(Bag bag : map.keySet()) {
			if(bag.getId().equalsIgnoreCase(bagId)) {
				
				// Bag found
				for(Ball ball : map.get(bag)) {
					if(ball.getId().equalsIgnoreCase(ballId)) {
						// Ball found
						map.get(bag).remove(ball);
						System.out.println("Ball removed successfully");
						return;
					}
				}
				
				// Ball not found in bag
				System.out.println("Ball not found");
				return;
			}
		}
		
		// Bag not found
		System.out.println("Bag not found");
	}


	// Display all balls in a bag
	public void displayAllBallsInBag(String bagId) {
		for(Map.Entry<Bag, List<Ball>> entry : map.entrySet()) {
			Bag bag = entry.getKey();
			List<Ball> balls = entry.getValue();
			
			// Bag found
			if(bag.getId().equalsIgnoreCase(bagId)) {
				if(balls.isEmpty()) {
					System.out.println("No ball present in this bag");
					return;
				}
				
				int ballCount = 1;
				for(Ball ball : balls) {
					System.out.println("Ball " + ballCount + " details -> id: " + ball.getId() + ", color: " + ball.getColor() + ", size: " + ball.getSize());
					ballCount++;
				}
				return;
			}
		}
		System.out.println("Bag not found");
	}


	// Display all balls and their ball count
	public void displayAllBagsAndBallCount() {
		System.out.println("All Bags and their ball counts are :- ");
		
		int bagCount = 1;
		for(Map.Entry<Bag, List<Ball>> entry : map.entrySet()) {
			Bag bag = entry.getKey();
			List<Ball> balls = entry.getValue();
			
			System.out.println("\nBag " + bagCount + " details -> id: " + bag.getId() + " || color: " + bag.getColor() + " || capacity: " + bag.getCapacity());
			System.out.println("Total ball count: " + balls.size());
			bagCount++;
		}
	}
}