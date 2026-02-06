package com.practice.singletonpattern;

public class LibraryCatalog {
	
	// step 1 :- single instance
	private static LibraryCatalog instance;
	
	// step 2 :- private constructor
	private LibraryCatalog() {
		System.out.println("Library Catalog created");
	}
	
	// step 3 :- Control access point
	public static LibraryCatalog getInstance() {
		if(instance == null) {
			instance = new LibraryCatalog();
		}
		return instance; 
	}
	
	
	// temporary method
	public void showBooks() {
		System.out.println("Library Catalog books are showing");
	}
}