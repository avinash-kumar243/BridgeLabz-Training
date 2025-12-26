package com.classandobject.Level1;

public class Book {
	public static void main(String[] args) {
		HandBook book1 = new HandBook("2States", "Chetan Bhagat", 500);
		HandBook book2 = new HandBook("Wings Of Fire", "Abdul kalam.A.P.J", 500);
		
		book1.displayBookDetails();
		book2.displayBookDetails();
	}
}