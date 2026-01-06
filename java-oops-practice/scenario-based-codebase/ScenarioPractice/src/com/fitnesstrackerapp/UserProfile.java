package com.fitnesstrackerapp;

public class UserProfile {
	private String name;
	private int age;
	private double weight;
	private String goal;
	private int dailyCaloryTarget;
	
	public UserProfile(String name, int age, double weight) {
		this(name, age, weight, "Fit");
		this.dailyCaloryTarget = 2000;
	}
	public UserProfile(String name, int age, double weight, String goal) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.goal = goal;
		this.dailyCaloryTarget = 2500;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}
	public String getGoal() {
		return this.goal;
	} 
	public int getDailyCaloryTarget() {
		return dailyCaloryTarget;
	}
 	
	public void showUserDetails() {
		System.out.println("User name: " + name + " || goal: " + goal);
	}
}