package com.questions.functionalinterface.comparator.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("Avi", 101 ,1 , 24),
				new Student("Rahul", 102 ,4 , 21)
				);
		
		System.out.println("\nBefore sort apply");
		list.stream().forEach(System.out::println);
		
		
		//this do temporaray sort not in actUal list
		System.out.println("\nAfter sort apply Comparator-");
		list.stream().sorted(Comparator.comparing(Student::getRank)).forEach(System.out::println);
		
		
		System.out.println("\n\nBefore sort apply ");
		list.stream().forEach(System.out::println);
		
		
		//this will sort in orignal list 
		list.sort((a,b) -> Integer.compare(a.getRank(), b.getRank()));
		
		System.out.println("\nAfter all sorted then -");
		list.stream().forEach(System.out::println);
	}
}