package com.junit.testing_list_operations;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListManagerTest {
	
	ListManager manager;
	List<Integer> list;

	@BeforeEach
	void setUp() throws Exception {
		manager = new ListManager();
		list = new ArrayList<>();
		list.add(10);
		list.add(20);
	}

	@Test
	void testAddElement() {
		assertEquals(16, manager.addElement(list, 16)); 
	}
	
	@Test
	void testRemoveElement() {
		assertEquals(true, manager.removeElement(list, 10));
	}
	
	@Test
	void testGetSize() {
		assertEquals(2, manager.getSize(list));
	}
}