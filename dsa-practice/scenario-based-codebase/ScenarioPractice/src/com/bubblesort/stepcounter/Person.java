package com.bubblesort.stepcounter;

public class Person {
	private String id;
	private int stepCount;
	
	public Person(String id, int stepCount) {
		this.id = id;
		this.stepCount = stepCount;
	}

	
	// Getters for person id and total steps
	public String getId() {
		return id;
	}
	public int getStepCount() {
		return stepCount;
	}
}