package com.csv_data_handling.readcsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String employeePath = "DataFiles/com/csv_data_handling/readcsv/employee2.csv";
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(employeePath))) {
			
			String line;
			
			// Read and skip header
			br.readLine();
			
			while((line = br.readLine()) != null) {
				String columns[] = line.split(",");
				System.out.println("ID: " + columns[0] + ", Name: " + columns[1] + ", Age: " + columns[2] + ", Marks: " + columns[3]);
			}
		} catch(IOException e) {
			System.out.println("IOException occurs: " + e.getMessage());
			e.printStackTrace();
		}
	}
}