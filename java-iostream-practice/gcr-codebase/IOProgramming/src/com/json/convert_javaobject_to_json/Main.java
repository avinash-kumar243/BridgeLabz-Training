package com.json.convert_javaobject_to_json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[] args) {
		
		try {
			
			// Step 1 :- Create a car object
			Car car = new Car("BMW", "Black", 10000000);
			
			// Step 2 :- Create ObjectMapper
			ObjectMapper mapper = new ObjectMapper();
			
			// Step 3 :- Convert Java Object → JSON and write to file in pretty format
			mapper.writerWithDefaultPrettyPrinter().writeValue(new File("DataFiles/com/files/cardetails.json"), car);
			
		} catch(Exception e) { 
			System.out.println("Error occurs during object to json conversion!!!");
			e.printStackTrace();
		}
	}
}