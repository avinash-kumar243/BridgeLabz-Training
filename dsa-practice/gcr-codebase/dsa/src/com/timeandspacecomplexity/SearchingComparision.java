package com.timeandspacecomplexity;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SearchingComparision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Creating an array and taking a number to search
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		int nums[] = new int[size];
		System.out.println("Enter elements in array: ");
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		
		// Linear search calling
		System.out.println("Enter a number to search: ");
		int num = sc.nextInt();
		
		long searchingStartTime = System.nanoTime();
		arraySearch(nums, num);
		long searchingEndTime = System.nanoTime();
		System.out.println("Linear search for an element time taken : " + (searchingEndTime - searchingStartTime));
		
		
		// HashSet searching an element
		HashSet<Integer> set = new HashSet<>();
		for(int n : nums) {
			set.add(n);
		}
		long hashSetStartTime = System.nanoTime();
		hashsetSearch(nums, num, set);
		long hashSetEndTime = System.nanoTime();
		System.out.println("\nSearching an element through HashSet takes time : " + (hashSetEndTime - hashSetStartTime));
		
		
		// TreeSet searching an element
		TreeSet<Integer> treeset = new TreeSet<>();
		for(int n : nums) {
			treeset.add(n);
		}
		long treeSetStartTime = System.nanoTime();
		treesetSearch(nums, num, treeset);
		long treeSetEndTime = System.nanoTime();
		System.out.println("\nSearching an element through TreeSet takes time : " + (treeSetEndTime - treeSetStartTime));
	}

	// TreeSet
	private static boolean treesetSearch(int[] nums, int num, TreeSet<Integer> treeset) {
		if(treeset.contains(num)) return true;
		else return false;
	} 

	// HashSet search
	private static boolean hashsetSearch(int[] nums, int num, HashSet<Integer> set) {
		if(set.contains(num)) return true;
		else return false;
	}

	// Linear search
	private static boolean arraySearch(int[] nums, int num) {
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == num) return true;
		}
		return false;
	}
}