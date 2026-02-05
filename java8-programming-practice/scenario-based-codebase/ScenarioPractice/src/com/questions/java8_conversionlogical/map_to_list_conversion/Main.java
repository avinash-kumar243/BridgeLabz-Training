package com.questions.java8_conversionlogical.map_to_list_conversion;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("--------------------- Map to List Conversions ---------------------------");
		System.out.println("-------------------------------------------------------------------------\n");
		
				
		
		// 1. Convert Map keys to List
		System.out.println("\n1. Converting Map keys to List");
		Map<Integer, String> map1 = Map.of(
				1, "Avi",
				2, "Komal",
				3, "Geeta",
				4, "Deepak"
		);
		
		List<Integer> keylist = map1.keySet().stream()
											 .collect(Collectors.toList());
		 
		keylist.forEach(key -> System.out.println(key));
		
		
		
		// 2. Convert Map values to List
		System.out.println("\n2. Converting Map values to List");
		Map<Integer, String> map2 = Map.of(
				1, "Avi",
				2, "Komal",
				3, "Geeta",
				4, "Deepak"
		);

		List<String> valuelist = map2.values()
									 .stream()
									 .collect(Collectors.toList());
		
		valuelist.forEach(val -> System.out.println(val));
		
		
		
		// 3. Convert Map entries to List
		System.out.println("\n3. Converting Map entries to List");
		Map<Integer, String> map3 = Map.of(
				1, "Avi",
				2, "Komal",
				3, "Geeta",
				4, "Deepak"
		);
		
		List<Map.Entry<Integer, String>> maplist = map3.entrySet().stream()
															.collect(Collectors.toList());
		maplist.forEach(list -> System.out.println(list.getKey() + " -> " + list.getValue())); 
		
		
		
		// 4. Convert Map to List of key-value strings
		System.out.println("\n4. Converting Map to List of key-value strings");
		Map<Integer, String> map4 = Map.of(
				1, "Avi",
				2, "Komal",
				3, "Geeta",
				4, "Deepak"
		);
		
		List<Map.Entry<Integer, String>> maplist2 = map4.entrySet().stream()
																   .collect(Collectors.toList());
		maplist2.forEach(map -> System.out.println(map.getKey() + " -> " + map.getValue()));
		
		 
		
		// 5. Convert Map to List of custom objects
		System.out.println("\n5. Converting Map to List of custom objects");
		Map<Integer, String> personmap = Map.of(
				1, "Avi",
				2, "Komal",
				3, "Geeta",
				4, "Deepak"
		);
		
		List<Person> personList = personmap.entrySet()
									  .stream()
									  .map(p -> new Person(p.getKey(), p.getValue()))
									  .toList();
		
		personList.forEach(p -> System.out.println(p)); 
		
		
		
		// 6.Convert Map to sorted List by key
		System.out.println("\n6. Converting Map to sorted List by key");
		Map<Integer, String> map5 = Map.of(
				1, "Avi",
				6, "Komal",
				3, "Geeta",
				5, "Deepak",
				2, "Krishna",
				4, "Shekhar"
		);
		
		List<Map.Entry<Integer, String>> sortedlist = map5.entrySet()
														  .stream()
														  .sorted(Map.Entry.comparingByKey())
														  .collect(Collectors.toList());
		
		sortedlist.forEach(list -> System.out.println(list));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}