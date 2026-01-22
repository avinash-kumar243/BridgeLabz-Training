package com.interfaces.map;

import java.util.HashMap;
import java.util.Map;

public class FindKeyWithHighestValue {
	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		map.put('A', 10);
		map.put('B', 20);
		map.put('C', 45);
		map.put('D', 36);
		map.put('E', 12);
		
		Character key = findingKey(map);
		
		System.out.println("Key with heighest value is: " + key);
	}

	private static Character findingKey(HashMap<Character, Integer> map) {
		int maxValue = 0;
		Character result = 'a';
		
		for(Map.Entry<Character, Integer> emt : map.entrySet()) {
			Character key = emt.getKey();
			Integer value = emt.getValue();
			
			if(value > maxValue) {
				result = key;
				maxValue = value;
			}
		}
		return result;
	}
}