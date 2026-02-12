package com.json.convert_java_objects_to_json_array;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Student> students = Arrays.asList(
                	new Student("Avinash", 23),
                	new Student("Allu", 24),
                	new Student("Deepu", 25)
        );

        ObjectMapper mapper = new ObjectMapper();

        String jsonArray = mapper.writerWithDefaultPrettyPrinter()
                                 .writeValueAsString(students);
        System.out.println(jsonArray);
    }
}