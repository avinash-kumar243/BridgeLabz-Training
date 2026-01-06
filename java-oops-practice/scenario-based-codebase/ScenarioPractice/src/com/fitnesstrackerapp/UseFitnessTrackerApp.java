package com.fitnesstrackerapp;

import java.lang.annotation.Target;
import java.util.Scanner;

public class UseFitnessTrackerApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// User does the registration
		UserProfile user1 = new UserProfile("Avi", 22, 65, "Strength cardio");	
		user1.showUserDetails();
		
	    Workout workout = new CardioWorkout(60);
	    workout.startWorkout();
	    workout.calculateCalories();
	    workout.stopWorkout(); 
	    
	    double burnedCalory = workout.caloriesBurned;
	    System.out.println("Total burned calories: " + burnedCalory);
	    
	    double progress = user1.getDailyCaloryTarget() - burnedCalory;
	    System.out.println("Remaining daily target calories: " + progress);
	}
}