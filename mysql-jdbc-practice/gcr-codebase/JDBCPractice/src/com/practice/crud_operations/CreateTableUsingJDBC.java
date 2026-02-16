package com.practice.crud_operations;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateTableUsingJDBC {
	public void createTable() {
		try {
			
			// Step 1 :- Get instance of Singleton
			DBConnection instance = DBConnection.getInstance();
			
			// Step 2 :- Get connection
			Connection connection = instance.getConnection();

			// Step 3 :- Write SQL queries in string
			String sql = "CREATE TABLE IF NOT EXISTS student (" +
						 "id INT AUTO_INCREMENT PRIMARY KEY, " +
						 "name VARCHAR(30), " + 
						 "age INT NOT NULL" +
						 ")";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			// Step 4 :- Execute statement
			statement.executeUpdate();
			
			// Step 5 :- Print message and close resource
			System.out.println("Table created successfully using Singleton!\n");	
			statement.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}