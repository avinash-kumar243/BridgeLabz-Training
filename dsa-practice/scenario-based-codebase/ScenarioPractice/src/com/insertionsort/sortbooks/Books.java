package com.insertionsort.sortbooks;

public class Books {
	private String title;

	public Books(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	
	
	@Override
	public String toString() {
		return "Book title: " + title;
	}
}