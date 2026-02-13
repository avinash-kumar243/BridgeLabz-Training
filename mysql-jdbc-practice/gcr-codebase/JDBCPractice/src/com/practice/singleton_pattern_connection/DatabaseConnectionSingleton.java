package com.practice.singleton_pattern_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionSingleton {
	private Connection connection;
	private static DatabaseConnectionSingleton instance;
	
	private static final String URL = "jdbc:mysql://localhost:3306/mydbb";
	private static final String user = "root";
	private static final String password = "Avinash269";
	
	// Constructor
	private DatabaseConnectionSingleton() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			this.connection = DriverManager.getConnection(URL, user, password);
			
		} catch(ClassNotFoundException e) {
			throw new SQLException("Database Driver not found!");
		}
	}
	
	// Get Instance
	public static synchronized DatabaseConnectionSingleton getInstance() throws SQLException {
		if(instance == null || instance.connection == null || instance.getConnection().isClosed()) {
			instance = new DatabaseConnectionSingleton();
		}
		return instance;
	}
	
	// Get Connection
	public Connection getConnection() {
		return connection; 
	}
}