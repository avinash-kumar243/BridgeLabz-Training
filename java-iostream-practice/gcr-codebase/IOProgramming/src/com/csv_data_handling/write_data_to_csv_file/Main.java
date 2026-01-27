package com.csv_data_handling.write_data_to_csv_file;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String csvFile = "DataFiles/employee2.csv";
		
		try {
			FileWriter file = new FileWriter(csvFile);
			
			file.write("ID, Name, Department, Salary\n"); 
			file.write("101, Avinash, IT, 10000\n"); 
			file.write("102, Akshay, CSE, 30000\n");
			file.write("103, Deepanshu, AIML, 50000\n");
			file.write("104, Priyanshu, IT, 25000\n");
			file.write("105, Mohan, CD, 20000\n");
			file.write("106, Kavya, AI, 32000\n");
			
			System.out.println("Students data written successfully");
			file.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}