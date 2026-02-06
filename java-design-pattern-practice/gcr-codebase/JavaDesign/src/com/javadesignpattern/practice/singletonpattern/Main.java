package com.javadesignpattern.practice.singletonpattern;

public class Main {
	public static void main(String[] args) {
		
		LibraryCatalog library1 = LibraryCatalog.getInstance();
		LibraryCatalog library2 = LibraryCatalog.getInstance();
		
		library1.showBooks();
		
		// Both instance are pointing to a single instance means only one instance exist
		System.out.println(library1 == library2);  // true
	}
}