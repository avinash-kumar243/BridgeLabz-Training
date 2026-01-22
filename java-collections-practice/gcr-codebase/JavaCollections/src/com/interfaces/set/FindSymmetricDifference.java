package com.interfaces.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindSymmetricDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(80);
		set1.add(60);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(30);
		set2.add(80);
		set2.add(50);
		set2.add(40);
		set2.add(100);
		set2.add(90);
		
		Set<Integer> result = symmetricDiff(set1, set2);

		System.out.println("\nSymmetric difference set elements are: " + result);
	}

	private static Set<Integer> symmetricDiff(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> result = new HashSet<>();
		
		for(int num : set1) {
			if(!set2.contains(num)) {
				result.add(num);
			}
		}
		for(int num : set2) {
			if(!set1.contains(num)) {
				result.add(num);
			}
		}
		
		return result;
	}
}