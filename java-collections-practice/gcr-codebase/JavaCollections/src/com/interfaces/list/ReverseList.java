package com.interfaces.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {
	public static void arrayListReverse(List<Integer> list) {
		int i = 0, j = list.size()-1;
		
		while(i < j) {
			int curr = list.get(i);
			list.set(i, list.get(j));
			list.set(j, curr);
			
			i++;
			j--;
		}
	}
	
	public static void linkedListReverse(LinkedList<Integer> list) {
		LinkedList<Integer> temp = new LinkedList<>();
		
		for(Integer num : list) {
			temp.addFirst(num);
		}
		
		list.clear();
		list.addAll(temp);
	}
	
	public static void main(String[] args) {
		
		// ArrayList
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		
		System.out.println("All elements are: ");
		System.out.println(list1);
		
		arrayListReverse(list1);
		
		System.out.println("After ArrayList Reversing, all elements are: ");
		System.out.println(list1);

		
		// LinkedList
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(1);
		list2.add(5);
		list2.add(8);
		list2.add(10);
		
		System.out.println("\n\nAll elements are: ");
		System.out.println(list2);
		
		linkedListReverse(list2);
		
		System.out.println("After LinkedList Reversing, all elements are: ");
		System.out.println(list2);
	}
}	