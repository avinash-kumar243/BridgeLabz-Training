package com.FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordOccurance {
	public static void main(String[] args) {
		String dataPath = "C:\\Users\\91628\\localDownload\\Download\\HelloWorld.txt";
		String searchingWord = "you";
		
		int count = 0;
		
		try {
			FileReader fr = new FileReader(dataPath);
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			
			while((line = br.readLine()) != null) {
				String words[] = line.toLowerCase().split("\\W+");
				
				for(String word : words) {
					if(word.equals(searchingWord.toLowerCase())) {
						count++;
					}
				}
			}
			
			System.out.println("Word \"" + searchingWord + "\" found " + count + " times");
		} catch(IOException e) {
			System.out.println("Error occured: " + e.getMessage());	
		}
	}
}