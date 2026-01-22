package com.interfaces.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindNthElement {
	
	// Method to find nth position element from last
	private static int findNthElement(List<Integer> list, int pos) {
		int n = list.size();
		if(pos <= 0 || pos > n) return -1;
				
		int i = n-1;
		while(pos != 0) {
			pos--;
			i--;
		}
		
		return list.get(i+1); 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(45);
		list.add(50);
		
		System.out.println("List are: " + list);
		
		System.out.println("\nEnter position: ");
		int pos = sc.nextInt();

		int result = findNthElement(list, pos);		
		System.out.println("\nResult is: " + result);
	}
}