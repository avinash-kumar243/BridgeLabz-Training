package com.interfaces.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicate {
	
	private static void removeDuplicate(List<Integer> list) {
		HashSet<Integer> set = new HashSet<>();
		List<Integer> ans = new ArrayList<>();
		
		int j = 0;
		for(int num : list) {
			if(!set.contains(num)) {
				set.add(num);
				ans.add(num);
			}
		}
		
		list.clear();
		list.addAll(ans);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(30);
		list.add(45);
		list.add(30);
		list.add(50);
		
		System.out.println("List are: " + list);

		removeDuplicate(list);		
		System.out.println("\nAfter removing duplicates, list are: " + list);
	}
}
	