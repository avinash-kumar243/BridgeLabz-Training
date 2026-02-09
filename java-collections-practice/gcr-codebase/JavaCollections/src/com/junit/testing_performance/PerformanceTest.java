package com.junit.testing_performance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class PerformanceTest {
	
	Performance performance;

	@BeforeEach
	void setUp() throws Exception {
		performance = new Performance();
	}
	
	@Test
	@Timeout(4)
	void testPerformance() throws InterruptedException {
		performance.longRunningTask();
	}

	@Test
	@Timeout(2)
	void testPerformance2() throws InterruptedException {
		performance.longRunningTask(); // Test fail due to raking more time to execute than timeout
	}
}