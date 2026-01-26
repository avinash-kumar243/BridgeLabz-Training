package com.javastream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayStream {
	public static void main(String[] args) {
        String sourceImage = "source.jpg";
        String destinationImage = "copy.jpg";

        try {
            // step 1: Read image into FileInputStream
            FileInputStream fis = new FileInputStream(sourceImage);

            // step 2: Write image data to ByteArrayOutputStream
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            int data;
            while((data = fis.read()) != -1) {
                baos.write(data);
            }

            // convert ByteArrayOutputStream to byte array
            byte[] imageBytes = baos.toByteArray();

            // step 3: Read from byte array using ByteArrayInputStream
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);

            // step 4: Write to new image file
            FileOutputStream fos = new FileOutputStream(destinationImage);

            while((data = bais.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();
            baos.close();
            bais.close();

            // Step 5: Verify file size
            File original = new File(sourceImage);
            File copied = new File(destinationImage);

            if(original.length() == copied.length()) {
                System.out.println("Image copied successfully. Files are identical.");
            } else {
                System.out.println("Files are not identical.");
            }

        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}