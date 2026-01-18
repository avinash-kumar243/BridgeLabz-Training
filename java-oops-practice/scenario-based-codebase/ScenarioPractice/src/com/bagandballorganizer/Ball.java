package com.bagandballorganizer;

public class Ball {
	private String id;
	private String color;
	private String size;
	
	public Ball(String id, String color, String size) {
		this.id = id;
		this.color = color;
		this.size = size;
	}
	

	// Getters for Ball
	public String getId() {
		return id;
	}
	public String getColor() {
		return color;
	}
	public String getSize() {
		return size;
	}
	
	
	@Override
	public String toString() {
		return "Ball id: " + id + " || color: " + color + " || size: " + size; 
	}
}