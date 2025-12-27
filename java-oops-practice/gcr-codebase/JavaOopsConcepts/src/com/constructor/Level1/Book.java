package com.constructor.Level1;

public class Book {
	public static void main(String[] args) {
		DisplayBook book1 = new DisplayBook();
		DisplayBook book2 = new DisplayBook("The Top Ten", "J. Peder Zane", 500);
		
		book1.displayBook();
		book2.displayBook();
	}
}