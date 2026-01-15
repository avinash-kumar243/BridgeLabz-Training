package com.bubblesort.hospitalqueue;

public class Patient {
	private int id;
	private int criticalLevel;
	
	public Patient(int id, int criticalLevel) {
		this.id = id;
		this.criticalLevel = criticalLevel;
	}

	
	// Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCriticalLevel() {
		return criticalLevel;
	}
	public void setCriticalLevel(int criticalLevel) {
		this.criticalLevel = criticalLevel;
	}
}