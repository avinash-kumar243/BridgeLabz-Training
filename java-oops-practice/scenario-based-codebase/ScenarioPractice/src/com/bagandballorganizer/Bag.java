package com.bagandballorganizer;

public class Bag {
	private String id;
	private String color;
	private int capacity;
	
	public Bag(String id, String color, int capacity) {
		this.id = id;
		this.color = color;
		this.capacity = capacity;
	}

	
	// Getters for Bag
	public String getId() {
		return id;
	}
	public String getColor() {
		return color;
	}
	public int getCapacity() {
		return capacity;
	}
	
	
	@Override
	public String toString() {
		return "Bag id: " + id + " || color: " + color + " || capacity: " + capacity; 
	}
}