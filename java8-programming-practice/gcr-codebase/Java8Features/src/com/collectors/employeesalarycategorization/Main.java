package com.collectors.employeesalarycategorization;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = List.of(new Employee("Avi", "IT", 10000),
										   new Employee("Ravi", "CSE", 80000),
										   new Employee("Sani", "CSE", 120000),
										   new Employee("Mohan", "CE", 40000),
										   new Employee("Komal", "IT", 50000),
										   new Employee("Deepika", "ME", 60000),
										   new Employee("Sachin", "EC", 70000),
										   new Employee("Golu", "CE", 80000));
		
		// Calculating and storing each department average salaries
		Map<String, Double> departmentAvgSalary = employees.stream()
															.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		
		
		// Displaying each department average salaries
		System.out.println("---------------- Each department and their average salaries are --------------");
		for(Map.Entry<String, Double> emt : departmentAvgSalary.entrySet()) {
			String department = emt.getKey();
			double avgSalary = emt.getValue();
			
			System.out.println(department + " -> " + avgSalary);
		}
	}
}