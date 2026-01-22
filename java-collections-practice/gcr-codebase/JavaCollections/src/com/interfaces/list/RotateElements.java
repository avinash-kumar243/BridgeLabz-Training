package com.interfaces.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateElements {
	
	private static void roateList(List<Integer> list, int pos) {
		int n = list.size();
		if(pos == 0 || pos >= n) return;
				
		List<Integer> temp = new ArrayList<>();
		
		int i = pos + 1;
		temp.add(list.get(pos)); 
		
		while(i != pos) {
			i %= n;
			temp.add(list.get(i));
			i++;
		}
		
		list.clear();
		list.addAll(temp);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		System.out.println("List are: " + list);

		System.out.println("\nEnter number of position to rotate list: ");
		int pos = sc.nextInt();
		
				
		roateList(list, pos);
		
		System.out.println("\nAfter rotation, list are: " + list);
	}
}