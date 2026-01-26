package com.javastream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) {
		
		// Source and Destination files
		File source = new File("Source.txt");
		File destination = new File("destination.txt");
		
		// return if source file not exits
		if(!source.exists()) {
			System.out.println("Source file does not exist!");
			return;
		}
		
		// create destination file
		try {
			if(!destination.exists()) {
				destination.createNewFile();
			}
		} catch(IOException e) {
			System.out.println("Error creating destination file: " + e.getMessage());
			return;
		}
		
		
		// perform data copy operation from source file to destination file
		try(FileInputStream fis = new FileInputStream(source); FileOutputStream fos = new FileOutputStream(destination)) {
			int data;
			
			while((data = fis.read()) != -1) { // read data byte by byte
				fos.write(data);  // write data byte by byte
			}
			
			System.out.println("File data copies successfully!");
		} catch(IOException e) {  // throw exception if any exception occurs
			System.out.println("IOException occured: " + e.getMessage());
		}
	}
}