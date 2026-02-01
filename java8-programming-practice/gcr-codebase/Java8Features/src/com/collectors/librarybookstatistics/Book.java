package com.collectors.librarybookstatistics;

public class Book {
	private String genre;
	private int page;
	
	public Book(String genre, int page) {
		this.genre = genre;
		this.page = page;
	}

	public String getGenre() {
		return genre;
	}
	public int getPage() {
		return page;
	}

	@Override
	public String toString() {
		return "Book [genre=" + genre + ", page=" + page + "]";
	}	
}