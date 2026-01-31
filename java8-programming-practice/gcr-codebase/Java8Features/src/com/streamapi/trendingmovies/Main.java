package com.streamapi.trendingmovies;

import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Movie> movies = List.of(new Movie("Black Panther", 4.5, 2018),
									 new Movie("Avatar", 4.3, 2009),
									 new Movie("Joker", 4.0, 2019),
									 new Movie("Interstellar", 3.7, 2014),
									 new Movie("RRR", 4.7, 2022),
									 new Movie("Master", 4.2, 2021),
									 new Movie("3 Idiots", 3.9, 2009),
									 new Movie("Dangal", 4.6, 2016),
									 new Movie("Magadheera", 4.1, 2009),
									 new Movie("Padmaavat", 4.5, 2017),
									 new Movie("Bahubali", 4.8, 2015),
									 new Movie("Drishyam", 3.8, 2013));
		
		System.out.println("Top 5 movies are :- ");
		movies.stream()
			  .filter(movie -> movie.getYear() > 2010)
			  .sorted(Comparator.comparing(Movie :: getRating).reversed().thenComparing(Movie::getYear, Comparator.reverseOrder()))
			  .limit(5)
			  .forEach(System.out::println); 
	}
}