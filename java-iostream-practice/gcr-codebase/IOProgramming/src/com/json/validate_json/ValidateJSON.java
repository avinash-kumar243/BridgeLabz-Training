package com.json.validate_json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJSON {
	public static void main(String[] args) throws IOException {
		File file = new File("DataFiles/com/files/student3.json");
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			mapper.readTree(file); 
			System.out.println("Format is valid");
		} catch(FileNotFoundException e) {
			System.out.println("File not found");
		} catch(JsonParseException e) {
			System.out.println("Format not valid");
		}
	}
}