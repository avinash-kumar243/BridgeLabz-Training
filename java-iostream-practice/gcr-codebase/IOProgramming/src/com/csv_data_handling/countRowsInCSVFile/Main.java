package com.csv_data_handling.countRowsInCSVFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String employee = "DataFiles/employee3.csv";

	    // Step 1 : - write data to CSV file
		try {
			FileWriter fw = new FileWriter(employee);
		
			fw.write("ID, Name, Age, Salary\n");
			fw.write(new Employee3(101, "Avi", 22, 10000).toCSV());
			fw.write(new Employee3(102, "Allu", 23, 20000).toCSV());
			fw.write(new Employee3(103, "Aman", 25, 30000).toCSV());
			fw.write(new Employee3(104, "Deepu", 21, 40000).toCSV());
			fw.write(new Employee3(105, "Deepika", 26, 50000).toCSV());
			
			fw.close();
		} catch(IOException e) {
			System.out.println("IOException occurs: " + e.getMessage());
		}
		
		
		// Step 2 :- Read and count rows in a CSV file
		try(BufferedReader br = new BufferedReader(new FileReader(employee));) {
			
			String line;
			int count = 0;
			while((line = br.readLine()) != null) {
				count++;
			}
			
			System.out.println("Total count of rows: " + count);
			
			br.close();
		} catch(IOException e) {
			System.out.println("IOException occurs: " + e.getMessage());
		}
	}
}