package com.practice.jdbc_setup1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	// Step 1 :- Database URL, root and password
	private static final String URL = "jdbc:mysql://localhost:3306/mydb";
	private static final String user = "root";
	private static final String password = "Avinash269";
	
	// Step 2 :- Database connection logic should be in a method
	public static Connection getConnection() {
		Connection connection = null;
		
		// Step 3 :- Write necessary try - catch statement
		try {
			// Step 4 :- Load MySQL JDBC Driver class (Optional in Modern JDBC)
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Step 5 :- Establish Connection
			connection = DriverManager.getConnection(URL, user, password);
			System.out.println("Database connected successfully!!!");
			
		} catch(ClassNotFoundException e) {
			System.out.println("MySQL JDBC Driver not found!");
		} catch(SQLException e) {
			System.out.println("Connection failed!");
		}
		
		// Step 6 :- return connection;
		return connection; 
	}
}