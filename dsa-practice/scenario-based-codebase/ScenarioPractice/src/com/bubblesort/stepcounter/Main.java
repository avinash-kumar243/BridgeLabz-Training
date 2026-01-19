package com.bubblesort.stepcounter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.quicksort.productsorting.Product;

public class Main {

	// Method to sort people by their total step count -> Descending order using bubble sort
	private static void sortStepCount(List<Person> people) {
		int n = people.size();
		
		for(int i = 0; i < n-1; i++) {
			boolean isSwap = false;
			
			for(int j = 0; j < n-1-i; j++) {
				if(people.get(j).getStepCount() < people.get(j+1).getStepCount()) {
					// Swap
					Person curr = people.get(j);
					people.set(j, people.get(j+1));
					people.set(j+1, curr);
					isSwap = true;
				}
			}
			if(!isSwap) break;
		}
	}
	
	public static void display(List<Person> people) {
		System.out.println("all people and their total foot steps are: - \n");
		for(Person person : people) {
			System.out.println("Id: " + person.getId() + ", total foot steps: " + person.getStepCount());
		}
		
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		System.out.println("\n--------------- Daily Step Count Ranking (Bubble Sort) ---------------\n");
		
		
		// List of person and their total foot steps
		List<Person> people = new ArrayList<>(Arrays.asList(new Person("101", 5000), new Person("102", 2000), new Person("103", 3500), new Person("104", 4800), new Person("105", 8000), new Person("106", 10000), new Person("107", 6800), new Person("108", 15000), new Person("109", 7200), new Person("110", 6500), new Person("111", 7500), new Person("112", 12000), new Person("113", 1000), new Person("104", 9000), new Person("115", 8000)));
		System.out.print("\nBefore sorting -> ");
		display(people);
		
		
		sortStepCount(people);
		System.out.print("\nAfter sorting -> ");
		display(people);
	}
}