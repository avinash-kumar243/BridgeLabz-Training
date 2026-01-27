package com.csv_data_handling.modifycsvfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String employeesPath = "DataFiles/com/csv_data_handling/modifycsvfile/employees.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(employeesPath))) {
			
			String line;
			br.readLine();
			
			while((line = br.readLine()) != null) {
				String employee[] = line.split(",");
				
				int id = Integer.parseInt(employee[0]);
				String name = employee[1].trim();
				String dept = employee[2].trim();
				int salary = Integer.parseInt(employee[3]);
				
				if(dept.equalsIgnoreCase("IT")) {
					int interest = (salary * 10) / 100;
					int newSalary = salary + interest;
					employee[3] = Integer.toString(newSalary);
					System.out.println("name: " + name + ", old salary: " + salary + ", new salary: " + newSalary);
				}
			}			
		} catch(IOException e) {
			System.out.println("IOException occurs: " + e.getMessage());
		}
	}
}