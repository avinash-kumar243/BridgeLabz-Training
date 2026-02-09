package com.junit.testing_list_operations;

import java.util.List;

public class ListManager {
	
	public int addElement(List<Integer> list, int element) {
		list.add(element); 
		return element;
	}
	
	public boolean removeElement(List<Integer> list, int element) {
		if(list.isEmpty() || !list.contains(element)) return false;
		
		list.remove(Integer.valueOf(element));
		return true; 
	}
	
	public int getSize(List<Integer> list) {
		return list.size();
	}
}