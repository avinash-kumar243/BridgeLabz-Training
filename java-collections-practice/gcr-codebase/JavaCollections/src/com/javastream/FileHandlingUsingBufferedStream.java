package com.javastream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingUsingBufferedStream {
	public static void main(String[] args) {
		File source = new File("Source.txt");
		File destination1 = new File("Destination2.txt");
		File destination2 = new File("D	estination2.txt");
		
		if(!source.exists()) {
			System.out.println("Source file does not exits!");
			return;
		}
		
		
		// Creates destination1 and destination2 file, if they don'e exist
		try {
			if(!destination1.exists()) {
				destination1.createNewFile();
			}
		} catch(IOException e) {
			System.out.println("Error creating destination1 file: " + e.getMessage());
			return;
		}
		
		try {
			if(!destination2.exists()) {
				destination2.createNewFile();
			}
		} catch(IOException e) {
			System.out.println("Error creating destination2 file: " + e.getMessage());
			return;
		}
		
		
		long bufferedTime = copyFilesUsingBufferedStream(source, destination1);

		long fileTime = copyFilesUsingFileStream(source, destination2);
		
		System.out.println("File stream taken time: " + fileTime);
		System.out.println("Buffered stream taken time: " + bufferedTime);
	}
	
	
	private static long copyFilesUsingBufferedStream(File source, File destination) {
		long startTime = System.nanoTime();
		
		// try-with-resources
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source)); BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination));) {
			
			byte[] buffer = new byte[4096];
			int data;
			
			while((data = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, data); 
			}
			
		} catch (IOException e) {
			System.out.println("IOException occurs: " + e.getMessage());
		}
		
		long endTime = System.nanoTime();
		
		return endTime - startTime; 
	}


	private static long copyFilesUsingFileStream(File source, File destination) {
		long startTime = System.nanoTime();

		try(FileInputStream fis = new FileInputStream(source); FileOutputStream fos = new FileOutputStream(destination);) {
			
			int data;
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
			
		} catch(IOException e) {
			System.out.println("IOException occurs: " + e.getMessage());
		}
		
		long endTime = System.nanoTime();
		return endTime - startTime; 
	}
}