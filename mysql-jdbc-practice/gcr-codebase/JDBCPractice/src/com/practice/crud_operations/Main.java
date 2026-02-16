package com.practice.crud_operations;

public class Main {
	public static void main(String[] args) {
		
		// Create Table
		CreateTableUsingJDBC table = new CreateTableUsingJDBC();
		table.createTable();
		
		
		// Insert student
		InsertData insert = new InsertData();
		insert.insertData(101, "Avinashi", 22);
		insert.insertData(105, "Suraj", 23);
		insert.insertData(104, "Komal", 24);
		
		
		// Read students
		ReadData read = new ReadData();
		read.readAllStudents();
				
		
		// Update student
		UpdateData update = new UpdateData();
		update.updateAge(104, 26);
		
		
		// Delete student
		DeleteData delete = new DeleteData();
		delete.deleteStudent(101);
		
		
		// Read students
		read.readAllStudents();
		
	}
}
