package com.csv_data_handling.validatecsvdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.csv_data_handling.sortcsvrecords.Employee;

public class Main {
	
	private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
	private static final Pattern PHONE_PATTERN = Pattern.compile("^\\d{10}$");
	
	
	public static void main(String[] args) {
		String employeesPath = "DataFiles/com/csv_data_handling/validatecsvdata/employees.csv";
		
		List<Employee> employees = new ArrayList<>();
		
		// Step 1 : - Read CSV
		try(BufferedReader br = new BufferedReader(new FileReader(employeesPath))) {
			
			String line;
			int row = 0;
			
			br.readLine();
			
			while((line = br.readLine()) != null) {
				row++;
				
				if(line.trim().isEmpty()) continue;
				
				String employee[] = line.split(",");
				
				int id = Integer.parseInt(employee[0]);
				String name = employee[1].trim();
				String email = employee[2].trim();
				String phone = employee[3].trim();
				
				
				boolean valid = true;
				
				if(!EMAIL_PATTERN.matcher(email).matches()) {
					System.out.println("Invalid Email at row: " + row + " -> " + line);
					valid = false;
				}
				
				 if(!PHONE_PATTERN.matcher(phone).matches()) {
                    System.out.println(
                        "Invalid Phone Number at row " + row +
                        " → " + line
                    );
                    valid = false;
                }
			}			
		} catch(IOException e) {
			System.out.println("IOException occurs: " + e.getMessage());
		}
	}
}