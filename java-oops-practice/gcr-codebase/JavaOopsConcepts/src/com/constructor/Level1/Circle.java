package com.constructor.Level1;

public class Circle {
	public static void main(String[] args) {
		DisplayCircle circle1 = new DisplayCircle();
		circle1.displayCircle();
		
		DisplayCircle circle2 = new DisplayCircle(10);
		circle2.displayCircle();
	}
}