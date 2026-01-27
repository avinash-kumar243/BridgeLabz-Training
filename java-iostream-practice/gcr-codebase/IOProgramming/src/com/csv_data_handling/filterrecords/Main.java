package com.csv_data_handling.filterrecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		String studentFile = "DataFiles/com/csv_data_handling/filterrecords/Student.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(studentFile));) {
			
			String line;
			br.readLine();
			
			while((line = br.readLine()) != null) {
				String studentData[] = line.split(",");
				
				int roll = Integer.parseInt(studentData[0]);
				String name = studentData[1];
				int marks = Integer.parseInt(studentData[2]);
				
				if(marks > 80) {
					System.out.println("roll: " + roll + ", name: " + name + ", marks: " + marks);
				}
			}
			
			br.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}