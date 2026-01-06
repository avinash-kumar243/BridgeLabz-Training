package com.fitnesstrackerapp;

import java.time.Duration;

public class CardioWorkout extends Workout {

	public CardioWorkout(int duration) {
		super("Cardio", duration);
	}

	@Override
	public void calculateCalories() {
		caloriesBurned = duration * 8.5;
	}
}	