package com.inheritance.singleinheritance.librarymanagement;

public class Author extends Book {
	protected String name;
	protected String bio;
	
	public Author(String title, int publishYear, String name, String bio) {
		super(title, publishYear);
		this.name = name;
		this.bio = bio; 
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Title: " + title + " | publishYear: " + publicationYear + " | Author: " + name + " | bio: " + bio);
	}
}