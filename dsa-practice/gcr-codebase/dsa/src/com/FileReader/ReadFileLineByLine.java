package com.FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\91628\\localDownload\\Download\\HelloWorld.txt";
		
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch(IOException e) {
			System.out.println("Error occured: " + e.getMessage());
		}
	}
}