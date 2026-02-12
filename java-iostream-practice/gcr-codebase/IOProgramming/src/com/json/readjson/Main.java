package com.json.readjson;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[] args) {
		
		try {
			File file = new File("DataFiles/com/files/student.json"); 
			
			ObjectMapper mapper = new ObjectMapper();
			
			JsonNode node = mapper.readTree(file);
			
			for(JsonNode jsonNode : node) {
				System.out.println(jsonNode.get("name").asText());
				System.out.println(jsonNode.get("salary").asText());
				System.out.println("----------------------------------");
			}
		} catch(Exception e) {
			System.out.println("Exception occurs!!!");
		}
		
	}
}