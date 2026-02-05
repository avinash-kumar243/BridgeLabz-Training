package com.questions.java8_conversionlogical.list_to_map_conversion;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("--------------------- List to Map Conversions ---------------------------");
		System.out.println("-------------------------------------------------------------------------\n");
		
				
		// 1.Convert List of strings to Map with string as key and length as value
		System.out.println("\n1. Converting List of strings to Map with string as key and length as value");
		List<String> list1 = List.of("Hello", "World", "Temple", "Day", "Technology");
		
		Map<String, Integer> map1 = list1.stream()
									   .collect(Collectors.toMap(
											   s -> s,
											   s -> s.length()
											   ));
		
		map1.forEach((k, v) -> System.out.println(k + " -> " + v));
		
		
		// 2.Convert List of integers to Map with number and its square
		System.out.println("\n2. Converting List of integers to Map with number and its square");
		List<Integer> list2 = List.of(10, 15, 20, 12, 16, 25);
		
		Map<Integer, Integer> map2 = list2.stream()
										  .collect(Collectors.toMap(
												  x -> x,
												  x -> x*x
											));
		
		map2.forEach((k, v) -> System.out.println(k + " -> " + v));
		
		
		
		// 3.Convert List of employees to Map with id as key and name as value
		System.out.println("\n3. Converting List of employees to Map with id as key and name as value");
		List<Employee> employees = List.of(new Employee(101, "Avi", 10000),
										   new Employee(102, "Mohan", 30000),
										   new Employee(103, "Ravi", 40000),
										   new Employee(104, "Sonam", 50000));
		
		Map<Integer, String> map3 = employees.stream()
											 .collect(Collectors.toMap( 
											 		Employee::getId,
											 		Employee::getName 
											  ));
		
		map3.forEach((k, v) -> System.out.println(k + " -> " + v)); 
		
		
		
		// 4.Convert List of words to Map with word and frequency
		System.out.println("\n4. Converting List of words to Map with word and frequency");
		List<String> wordlist = List.of("Hello", "World", "Temple", "Day", "Technology");
		
		Map<String, Long> wordmap = wordlist.stream()
											   .collect(Collectors.groupingBy(
													   	word -> word,
													   	Collectors.counting()
											    ));
		wordmap.forEach((k, v) -> System.out.println(k + " -> " + v));
		
		
		
		// 5.Convert List to Map with index as key and element as value
		System.out.println("\n5. Converting List to Map with index as key and element as value");
		List<String> wordlist2 = List.of("Hello", "World", "Temple", "Day", "Technology");
		Map<Integer, String> elementmap = IntStream.range(0, wordlist2.size())
												.boxed()
												.collect(Collectors.toMap(i -> i, wordlist2::get));
		elementmap.forEach((k, v) -> System.out.println(k + " -> " + v));
		
		
		
		// 6. Convert List of objects to Map using custom key field
		System.out.println("\n6. Converting List of objects to Map using custom key field");
		List<Employee> employees2 = List.of(new Employee(101, "Avi", 10000),
				   new Employee(102, "Mohan", 30000),
				   new Employee(103, "Ravi", 40000),
				   new Employee(104, "Sonam", 50000));
		
		employees2.stream()
				  .collect(Collectors.toMap(Employee::getId, employee -> employee))
				  .forEach((id, emp) -> System.out.println(id + " -> " + emp));
		
		
		
		// 7. Convert List to Map and handle duplicate keys
		System.out.println("\n7. Converting List to Map and handle duplicate keys");
		List<Employee> employees3 = List.of(new Employee(101, "Avi", 10000),
				   new Employee(102, "Mohan", 30000),
				   new Employee(102, "Ravi", 40000),
				   new Employee(104, "Sonam", 50000));
		
		employees3.stream()
				  .collect(Collectors.toMap(Employee::getId, emp -> emp, (existing, replacement) -> existing)) 
				  .forEach((id, e) -> System.out.println(id + " -> " + e)); 
		
		
		
		// 8. Convert List to Map keeping only first duplicate
		System.out.println("\n8. Converting List to Map keeping only first duplicate");
		List<Employee> employees4 = List.of(new Employee(101, "Avi", 10000),
				   new Employee(102, "Mohan", 30000),
				   new Employee(102, "Ravi", 40000),
				   new Employee(104, "Sonam", 50000));
		
		Map<Integer, Employee> employeemap = employees4.stream()
				  .collect(Collectors.toMap(Employee::getId, emp -> emp, (existing, replacement) -> existing));
		employeemap.forEach((id, emp) -> System.out.println(id + " -> " + emp)); 
		
		
		
		// 9. Convert List to Map keeping only last duplicate
		System.out.println("\n9. Converting List to Map keeping only last duplicate");
		List<Employee> employees5 = List.of(new Employee(101, "Avi", 10000),
				   new Employee(102, "Mohan", 30000),
				   new Employee(102, "Ravi", 40000),
				   new Employee(104, "Sonam", 50000));
		
		employees5.stream()
				  .collect(Collectors.toMap(Employee::getId, emp -> emp, (existing, replacement) -> replacement))
				  .forEach((id, emp) -> System.out.println(id + " -> " + emp));
		
		
		
		// 10. Convert List into Map grouped by string length
		System.out.println("\n10. Converting List into Map grouped by string length");
		List<String> stringlist = List.of("Hello", "World", "Temple", "Day", "Technology");
		
		stringlist.stream()
				  .collect(Collectors.groupingBy(String::length))
				  .forEach((len, str) -> System.out.println(len + " -> " + str));
	}
}