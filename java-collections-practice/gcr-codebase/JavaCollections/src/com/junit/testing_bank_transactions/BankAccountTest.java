package com.junit.testing_bank_transactions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	
	BankAccount account;

	@BeforeEach
	void setUp() throws Exception {
		account = new BankAccount(10000);
	}

	@Test
	void testDeposit() {
		account.deposit(2000);
		assertEquals(12000, account.getBalance());
	} 
	
	@Test
	void testWithdraw() throws IllegalArgumentException {
		account.withdraw(5000);
		assertEquals(5000, account.getBalance());
	}
	
	@Test
	void testGetBalance() {
		assertEquals(10000, account.getBalance());
	}
	
	@Test
	void testInvalidDeposit() {
		assertThrows(IllegalArgumentException.class, () -> account.deposit(-500));
	}
	
	@Test
	void testInvalidWithdraw() {
		assertThrows(IllegalArgumentException.class, () -> account.withdraw(-4000));
	}
	
	@Test
	void testWithdrawInsufficientBalance() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(30000));
		
		assertEquals("Insufficient balance", exception.getMessage());
	}
}