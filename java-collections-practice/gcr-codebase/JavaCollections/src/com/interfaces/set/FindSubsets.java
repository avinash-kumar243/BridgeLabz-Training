package com.interfaces.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindSubsets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(50);
		
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(10);
		set2.add(60);
		set2.add(30);
		set2.add(20);
		set2.add(80);
		set2.add(50);
		
		boolean isSubset = subsetChecker(set1, set2);

		System.out.println("Is first set is subset of second set: " + isSubset);
	}

	// Check if first set is subset of second set or not
	private static boolean subsetChecker(Set<Integer> set1, Set<Integer> set2) {
		for(int num : set1) {
			if(!set2.contains(num)) return false;
		}
		return true;
	} 
}