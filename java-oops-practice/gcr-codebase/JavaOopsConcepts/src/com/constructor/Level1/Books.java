package com.constructor.Level1;

public class Books {
	public static void main(String[] args) {
		DisplayBooks book = new DisplayBooks("The Top Ten", "J. Peder Zane", 500, true);
		
		book.showBook();
		book.borrowBook();  // First Time book will be borrowed
		book.borrowBook();  // Second Time book won't be borrowed
	}
}