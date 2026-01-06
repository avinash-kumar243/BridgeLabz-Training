package com.fitnesstrackerapp;

abstract class Workout implements ITrackable {
	protected String type;
	protected int duration;
	protected double caloriesBurned;
	boolean doesWorkout = false;
	
	public Workout(String type, int duration) {
		this.type = type;
		this.duration = duration;	
	}
	
	public abstract void calculateCalories();

	@Override
	public void startWorkout() {
		doesWorkout = true;
		System.out.println(type + " Workout has started");
	}

	@Override
	public void stopWorkout() {
		doesWorkout = false;
		System.out.println(type + " workout has been stopped");
	}
	
	public double getCaloriesBurned() {
		return caloriesBurned;
	}
}