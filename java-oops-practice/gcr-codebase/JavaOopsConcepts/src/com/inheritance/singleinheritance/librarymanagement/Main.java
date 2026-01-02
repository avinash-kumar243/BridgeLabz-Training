package com.inheritance.singleinheritance.librarymanagement;

public class Main {
	public static void main(String args[]) {
		Book book1 = new Book("The God of Small Things", 1997);
		System.out.println(book1.title);
		book1.displayInfo(); 
		
		Author book2 = new Author("Godaan", 1936, "Munshi Premchand", "Godaan: a renowned Hindi novel written by Munshi Premchand, published in 1936");
		System.out.println(book2.name);
		book2.displayInfo();
	}
}