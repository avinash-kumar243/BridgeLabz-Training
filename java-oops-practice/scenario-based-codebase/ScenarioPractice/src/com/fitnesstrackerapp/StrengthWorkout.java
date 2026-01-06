package com.fitnesstrackerapp;

public class StrengthWorkout extends Workout {
	private int reps;

	public StrengthWorkout(int duration, int reps) {
		super("Strength", duration);
		this.reps = reps;
	}

	@Override
	public void calculateCalories() {
		caloriesBurned = (duration * 5) + (reps * 0.3);
	} 
}  