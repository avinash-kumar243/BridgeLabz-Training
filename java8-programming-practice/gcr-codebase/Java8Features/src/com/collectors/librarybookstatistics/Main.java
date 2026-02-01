package com.collectors.librarybookstatistics;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Book> books = List.of(new Book("A", 100),
								   new Book("B", 160),
								   new Book("C", 125),
								   new Book("D", 180),
								   new Book("E", 150),
								   new Book("F", 60),
								   new Book("G", 110),
								   new Book("H", 95),
								   new Book("I", 130),
								   new Book("J", 80));
		
		// Total pages
		IntSummaryStatistics pages = books.stream()
							  .collect(Collectors.summarizingInt(Book::getPage));
		
		long totalPage = pages.getSum();
		double avgPage = pages.getAverage();
		long maxPage = pages.getMax();
		
		
		System.out.println("Total pages: " + totalPage);
		System.out.println("Average pages: " + avgPage);
		System.out.println("Max pages: " + maxPage); 
	}
}