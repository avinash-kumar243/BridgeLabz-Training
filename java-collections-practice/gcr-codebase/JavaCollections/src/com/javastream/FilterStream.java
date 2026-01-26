package com.javastream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilterStream {
	public static void main(String[] args) {

        String sourceFile = "input.txt";
        String destinationFile = "output.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(sourceFile)); BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))) {
            int ch;

            while((ch = br.read()) != -1) {
                bw.write(Character.toLowerCase((char) ch));
            }
            System.out.println("File converted successfully.");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}