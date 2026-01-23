package com.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
	public static void main(String[] args) {
		
		// try-with-resources (Auto-closing Resources)
		try(BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {
			String line;
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch(IOException e) {
			System.out.println("IOException occurs: " + e.getMessage() + "\n");
				e.printStackTrace();
		}
	}
}