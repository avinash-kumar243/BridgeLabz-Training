package com.junit.testing_beforeeach_aftereach;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DatabaseConnectionTest {
	
	DatabaseConnection dbconnection;

	@BeforeEach
	void setUp() throws Exception {
		dbconnection = new DatabaseConnection(); 
		dbconnection.connect(); // runs before each test case
	}
	
	@AfterEach
	void tearDown() throws Exception {
		dbconnection.disconnect(); // runs after each test case
	}
	

	@Test
	void testConnectionEstablished() {
		assertTrue(dbconnection.isConnected());
	}
	
	@Test
	void testConnectionClosed() {
		dbconnection.disconnect();
		assertFalse(dbconnection.isConnection);
	}
}