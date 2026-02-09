package com.junit.testing_filehandlingmethods;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class FileProcessorTest {
	
	FileProcessor fileProcessor = new FileProcessor();
	String filename = "testfile.txt";

	
	@AfterEach
	void cleanUp() throws IOException {
	    Files.deleteIfExists(Path.of(filename));
	}

	// Test 1: content written and read correctly
    @Test
    void testWriteAndReadFile() throws IOException {
    	fileProcessor.writeToFile(filename, "Hello JUnit");

        String content = fileProcessor.readFromFile(filename);

        assertEquals("Hello JUnit", content);
    }

    // Test 2: file exists after writing
    @Test
    void testFileExistsAfterWrite() throws IOException {
    	fileProcessor.writeToFile(filename, "File Exists Test");

        assertTrue(Files.exists(Path.of(filename)));
    }

    // Test 3: IOException when file does not exist
    @Test
    void testReadNonExistingFileThrowsException() {
        assertThrows(IOException.class, () -> {
        	fileProcessor.readFromFile("nofile.txt");
        });
    }
}