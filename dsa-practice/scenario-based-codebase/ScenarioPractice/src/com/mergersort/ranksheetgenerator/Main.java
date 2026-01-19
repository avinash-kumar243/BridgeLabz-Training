package com.mergersort.ranksheetgenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	// Merge Sort - Divide and Conquer
	public static void finalMarksList(List<Integer> marks, int low, int high) {
		if(low < high) {
			int mid = low + (high - low) / 2;
			
			finalMarksList(marks, low, mid);
			finalMarksList(marks, mid+1, high);
			
			mergeMarks(marks, low, mid, high);
		}
	}
	private static void mergeMarks(List<Integer> marks, int low, int mid, int high) {
		int n1 = mid - low + 1;
		int n2 = high - mid;
		
		List<Integer> left = new ArrayList<>(marks.subList(low, mid+1));
		List<Integer> right = new ArrayList<>(marks.subList(mid+1, high+1));
		
		int i = 0, j = 0, k = low;
		
		while(i < n1 && j < n2) {
			if(left.get(i) <= right.get(j)) {
				marks.set(k++, left.get(i++));
			} else {
				marks.set(k++, right.get(j++));
			}
		}
		while(i < n1) {
			marks.set(k++, left.get(i++));
		}
		while(j < n2) {
			marks.set(k++, right.get(j++));
		}
	}
	
	public static void main(String[] args) {
		System.out.println("\n--------------- Rank Sheet Generator ---------------\n");
		
		String state = "state";
		List<Integer> marks = new ArrayList<>();
		
		// Both districts send student marks list in sorted order
		List<Integer> district1 = new ArrayList<>(Arrays.asList(24, 38, 58, 63, 76, 86, 88, 90, 95, 98, 100));
		List<Integer> district2 = new ArrayList<>(Arrays.asList(16, 28, 31, 36, 53, 66, 78, 80, 83, 87, 90, 92, 98, 99));

		
		// Adding both district marks list for final rank generation
		List<Integer> allStudentMarks = new ArrayList<>();
		allStudentMarks.addAll(district1);
		allStudentMarks.addAll(district2);
		
		finalMarksList(allStudentMarks, 0, allStudentMarks.size()-1);
		
		
		System.out.println("\nDistrict 1 marks list is :- \n" + district1);
		System.out.println("\nDistrict 2 marks list is :- \n" + district2);
		System.out.println("\nFinal state marks list is :- \n" + allStudentMarks);
	}
}