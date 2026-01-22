package com.interfaces.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ComputeUnionAndIntersection {
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
		
		Set<Integer> union = computeUnion(set1, set2);
		Set<Integer> intersection = computeIntersection(set1, set2);

		System.out.println("\nUnion of both set are: " + union);
		System.out.println("\nIntersection of both set are: " + intersection);
	}

	private static Set<Integer> computeUnion(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> union = new HashSet<>();
		
		union.addAll(set1);
		union.addAll(set2);
		
		return union;
	}
	
	private static Set<Integer> computeIntersection(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> intersection = new HashSet<>();
		
		for(int num : set1) {
			if(set2.contains(num)) {
				intersection.add(num);
			}
		}
		
		return intersection;
	}

}