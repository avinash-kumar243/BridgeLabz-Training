package com.csv_data_handling.sortcsvrecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		String employeesPath = "DataFiles/com/csv_data_handling/sortcsvrecords/employees.csv";
		
		List<Employee> employees = new ArrayList<>();
		
		// Step 1 : - Read CSV
		try(BufferedReader br = new BufferedReader(new FileReader(employeesPath))) {
			
			String line;
			br.readLine();
			
			while((line = br.readLine()) != null) {
				
				if(line.trim().isEmpty()) continue;
				
				String employee[] = line.split(",");
				
				int id = Integer.parseInt(employee[0]);
				String name = employee[1].trim();
				String dept = employee[2].trim();
				int salary = Integer.parseInt(employee[3]);
				
				employees.add(new Employee(id, name, dept, salary));
			}			
		} catch(IOException e) {
			System.out.println("IOException occurs: " + e.getMessage());
		}
		 
		
		// Step 2 : - Sort by salary
		employees.sort((e1, e2) -> Integer.compare(e2.salary, e1.salary)); 
		
		
		// Step 3 : Print top 5 highest paid employee details
		System.out.println("Top 5 highest paid employee details are : \n");
		for(int i=0; i<Math.min(5,  employees.size()); i++) {
			Employee emp = employees.get(i);
			
			System.out.println("ID: " + emp.id + ", name: " + emp.name + ", dept: " + emp.dept + ", salaey: " + emp.salary);
		}
	}
}