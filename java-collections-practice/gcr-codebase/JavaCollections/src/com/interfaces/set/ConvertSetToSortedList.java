package com.interfaces.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ConvertSetToSortedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(60);
		set.add(30);
		set.add(20);
		set.add(80);
		set.add(50);
		
		
		List<Integer> sortedList = setConversion(set);

		System.out.println("\nSorted list are: " + sortedList);
	}

	private static List<Integer> setConversion(Set<Integer> set) {
		List<Integer> result = new ArrayList<>();
		
		for(int num : set) {
			result.add(num);
		}
		
		Collections.sort(result);
		return result;
	}
}