package com.interfaces.set;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class CheckForEqualSet {
	
	// A method to check if both set are equals or not
	private static boolean isEquals(Set<Integer> set1, Set<Integer> set2) {
		return set1.equals(set2);
	} 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		set1.add(60);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(30);
		set2.add(60);
		set2.add(50);
		set2.add(40);
		set2.add(10);
		set2.add(20);
		
		boolean result = isEquals(set1, set2);
		
		System.out.println("\nBoth set are equals: " + result);
	}
}