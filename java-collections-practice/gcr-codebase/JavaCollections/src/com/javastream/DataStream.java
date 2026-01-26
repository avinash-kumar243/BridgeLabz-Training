package com.javastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {
	public static void main(String[] args) {
	    String fileName = "student.dat"; 

        // Writing data to file
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(101);
            dos.writeUTF("Avinash");
            dos.writeDouble(8.6);

            System.out.println("Student data written successfully.");
        } catch(IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        // Reading data from file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int rollNo = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("\nRetrieved Student Details:");
            System.out.println("Roll No : " + rollNo);
            System.out.println("Name    : " + name);
            System.out.println("GPA     : " + gpa);
        } catch(IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
	}
}