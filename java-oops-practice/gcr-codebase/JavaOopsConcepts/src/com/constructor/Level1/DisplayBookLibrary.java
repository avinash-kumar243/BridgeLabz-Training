package com.constructor.Level1;

public class DisplayBookLibrary {
	public static void main(String[] args) {
		
		// Super-class Object
		BookLibrary book = new BookLibrary(3872938729578L, "The Top Ten", "J. Peder Zane");
		book.showBookDetails();
		
		System.out.println("\nBook author name is : " + book.getAuthor());
		book.setAuthor("Deepanshu");
		System.out.println("Book author name is : " + book.getAuthor());
		
		
		// Sub-class Object
		EBook ebook = new EBook(8794629323702L, "The Wizard", "Akshay");
		ebook.showBookDetails();
		
		System.out.println("\nBook author name is : " + ebook.getAuthor());
		book.setAuthor("Deepanshu");
		System.out.println("Book author name is : " + ebook.getAuthor());
	}
}