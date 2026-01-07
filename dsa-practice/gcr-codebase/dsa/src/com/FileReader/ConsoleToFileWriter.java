package com.FileReader;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleToFileWriter {
    public static void main(String[] args) {
        System.out.println("Enter text to write to the file (type 'exit' to stop):");

        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             FileWriter fw = new FileWriter("temp.txt", true)) { // append mode

            String line;

            while((line = br.readLine()) != null) {
                if (line.equalsIgnoreCase("exit")) {
                    System.out.println("Input stopped. File saved.");
                    break;
                }

                fw.write(line + System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}