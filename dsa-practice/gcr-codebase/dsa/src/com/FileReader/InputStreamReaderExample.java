package com.FileReader;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets; 

public class InputStreamReaderExample {
    public static void main(String[] args) {
        String filePath = "sample_utf8.txt";

        try (
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr =
                    new InputStreamReader(fis, StandardCharsets.UTF_8); // byte → char
            BufferedReader br = new BufferedReader(isr)
        ) {

            String line;

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}