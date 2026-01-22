package com.interfaces.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
	private String employeeName;
	private String department;
	
	public Employee(String employeeName, String department) {
		this.employeeName = employeeName;
		this.department = department;
	}

	
	// Getters for employee data
	public String getEmployeeName() {
		return employeeName;
	}
	public String getDepartment() {
		return department;
	}
}

public class GroupEmployees {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee("avi", "CSE"));
		employees.add(new Employee("alice", "IT"));
		employees.add(new Employee("bob", "AIML"));
		employees.add(new Employee("deepak", "CSE"));
		employees.add(new Employee("carol", "AIDS"));
		employees.add(new Employee("khusi", "AIML"));

		HashMap<String, List<Employee>> result = groupEmployee(employees);
		
		for(Map.Entry<String, List<Employee>> emt : result.entrySet()) {
			String key = emt.getKey();
			List<Employee> value = emt.getValue();
			
			System.out.print(emt.getKey() + ": ");
			for(Employee employee : value) {
				System.out.print(employee.getEmployeeName() + " ");
			}
			System.out.println();
		}
	}

	private static HashMap<String, List<Employee>> groupEmployee(List<Employee> employees) {
		HashMap<String, List<Employee>> result = new HashMap<>();
		
		for(Employee employee : employees) {
			String dept = employee.getDepartment();
			
			if(result.containsKey(dept)) {
				List<Employee> emp = result.get(dept);
				emp.add(employee);
				result.put(dept, emp);
			} else {
				result.put(dept, new ArrayList<>(Arrays.asList(employee)));
			}
		}
		return result;
	}
}


