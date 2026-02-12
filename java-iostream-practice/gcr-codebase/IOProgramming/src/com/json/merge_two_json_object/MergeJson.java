package com.json.merge_two_json_object;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJson {
	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		
		// First JSON
		ObjectNode json1 = mapper.createObjectNode();
		json1.put("name", "Avinash");
		json1.put("age", 23);
		
		// Second JSON
		ObjectNode json2 = mapper.createObjectNode();
		json2.put("email", "avikumar@gamil.com");
		json2.put("city", "mumbai");
		
		// Merge
		json1.setAll(json2);
		
		// Stored merged JSON objects to JSON file
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File("DataFiles/com/files/student2.json"), json1);
	}
}