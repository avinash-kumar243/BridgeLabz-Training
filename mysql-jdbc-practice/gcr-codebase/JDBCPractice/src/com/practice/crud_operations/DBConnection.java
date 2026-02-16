package com.practice.crud_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private Connection connection;
	private static DBConnection instance;
	
	// Step 1 :- Database details
	private static final String URL = "jdbc:mysql://localhost:3306/studentdb";
	private static final String user = "root";
	private static final String password = "Avinash269";
	
	
	// Step 2 :- private constructor
	private DBConnection() throws SQLException {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			connection = DriverManager.getConnection(URL, user, password);
			System.out.println("Connection formed successfully");
			
		} catch(ClassNotFoundException e) { 
			throw new SQLException("Database Driver not found!");
		}
	}
	
	public static synchronized DBConnection getInstance() throws SQLException {
		if(instance == null || instance.getConnection().isClosed()) {
			instance = new DBConnection();
		}
		return instance; 
	}
	
	public Connection getConnection() {
		return connection;
	}
}
