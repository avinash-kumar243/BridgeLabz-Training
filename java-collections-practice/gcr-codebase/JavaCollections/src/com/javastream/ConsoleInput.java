package com.javastream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {
	 public static void main(String[] args) {
        File file = new File("Sample.txt");

        // BufferedReader for console input
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileWriter writer = new FileWriter(file)) {

            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Write data to file
            writer.write("Name: " + name + System.lineSeparator());
            writer.write("Age: " + age + System.lineSeparator());
            writer.write("Favorite Programming Language: " + language + System.lineSeparator());

            System.out.println("User data saved successfully in " + file.getName());

        } catch(IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
	}
}