package com.interfaces.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class MergeMaps {
	public static void main(String[] args) {
		HashMap<Character, Integer> map1 = new HashMap<>();
		map1.put('A', 1);
		map1.put('B', 2);
		map1.put('C', 1);
		
		
		HashMap<Character, Integer> map2 = new HashMap<>();
		map2.put('B', 3);
		map2.put('C', 2);
		map2.put('D', 3);
		
		
		HashMap<Character, Integer> result = mergeMaps(map1, map2);
		
		System.out.println("Old map 1: " + map1);
		System.out.println("\nOld map 2: " + map2);

		System.out.println("\nMerged map: " + result);
	}

	private static HashMap<Character, Integer> mergeMaps(HashMap<Character, Integer> map1,
			HashMap<Character, Integer> map2) {
		HashMap<Character, Integer> result = new HashMap<>();
		
		for(Entry<Character, Integer> emt : map1.entrySet()) {
			Character key = emt.getKey();
			Integer value = emt.getValue();
			
			if(map2.containsKey(emt.getKey())) {
				result.put(key, value + map2.get(key));
			} else {
				result.put(key, value);
			}
		}
		
		for(Entry<Character, Integer> emt : map2.entrySet()) {
			if(!map1.containsKey(emt.getKey())) {
				result.put(emt.getKey(), emt.getValue());
			}
		}
		
		return result;
	}
}