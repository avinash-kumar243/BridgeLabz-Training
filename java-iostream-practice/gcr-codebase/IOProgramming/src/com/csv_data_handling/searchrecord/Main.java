package com.csv_data_handling.searchrecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String employeesPath = "DataFiles/com/csv_data_handling/searchrecord/employees.csv";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String empName = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(employeesPath))) {
			
			String line;
			br.readLine();
			
			while((line = br.readLine()) != null) {
				String employee[] = line.split(",");
				
				int id = Integer.parseInt(employee[0]);
				String name = employee[1].trim();
				String dept = employee[2];
				int salary = Integer.parseInt(employee[3]);
				
				if(name.equalsIgnoreCase(empName)) {
					System.out.println("Department:" + dept + ", salary: " + salary); 
					return;
				}
			}
			System.out.println("Employee not found");
			
		} catch(IOException e) {
			System.out.println("IOException occurs: " + e.getMessage());
		}
	}
}