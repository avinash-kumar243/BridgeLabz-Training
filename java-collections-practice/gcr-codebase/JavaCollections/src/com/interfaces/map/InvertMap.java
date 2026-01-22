package com.interfaces.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMap {
	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		map.put('A', 1);
		map.put('B', 2);
		map.put('C', 1);
		map.put('D', 3);
		map.put('E', 3);

		HashMap<Integer, List<Character>> result = invertMap(map);
		
		System.out.println("\nOld map: " + map);
		System.out.println("\nInverted map: " + result);
	}

	private static HashMap<Integer, List<Character>> invertMap(HashMap<Character, Integer> map) {
		HashMap<Integer, List<Character>> result = new HashMap<>();
		
		for(Map.Entry<Character, Integer> emt : map.entrySet()) {
			Integer key = emt.getValue();
			Character value = emt.getKey(); 
			
			if(result.containsKey(key)) {
				List<Character> list = result.get(key);
				list.add(value);
				
				result.put(key, list);
			} else {
				result.put(key, new ArrayList<>(Arrays.asList(value)));
			}
		}
		return result;
	}
}