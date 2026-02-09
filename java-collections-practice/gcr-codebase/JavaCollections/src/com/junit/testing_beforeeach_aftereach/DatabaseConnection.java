package com.junit.testing_beforeeach_aftereach;

public class DatabaseConnection {
	
	public boolean isConnection;
	
	public void connect() {
		isConnection = true;
	}
	
	public void disconnect() {
		isConnection = false;
	}
	
	public boolean isConnected() {
		return isConnection; 
	}
} 