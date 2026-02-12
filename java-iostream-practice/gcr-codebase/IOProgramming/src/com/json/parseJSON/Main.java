package com.json.parseJSON;
import java.io.File;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // Step 1: Read JSON file
            JsonNode rootNode = mapper.readTree(new File("DataFiles/com/files/student4.json"));

            // Step 2: Iterate array
            for(JsonNode student : rootNode) {
                int age = student.get("age").asInt();

                // Step 3: Filter condition
                if(age > 25) {
                    System.out.println(student.get("name").asText() + " - Age: " + age);
                }
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}