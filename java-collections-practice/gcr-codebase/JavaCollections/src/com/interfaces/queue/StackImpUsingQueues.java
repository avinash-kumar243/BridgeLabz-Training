package com.interfaces.queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

// Stack Implementation means "A program that will going to implement stack methods, using queue methods"
class StackUsingQueues {
	private Queue<Integer> q1;
	private Queue<Integer> q2;
	private int size;
	
	public StackUsingQueues() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
		size = 0;
	}
	
	
	// Push at top in stack
	public void push(int data) {
		// Step 1: add new element to empty queue q2
		q2.add(data);
		size++;
		
		// step 2 : shift all elements from q1 to q2
		while(!q1.isEmpty()) {
			q2.add(q1.remove());
		}
		
		// step 3 : Swap q1 and q2 references
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}
	
	
	// Pop from top of stack
	public int pop() {
		// step 1: check for empty stack
		if(q1.isEmpty()) {
			throw new NoSuchElementException("Stack is empty");
		}
		
		// step 2: remove top and return
		size--;
		return q1.remove();
	}
	
	
	// Peek from top of stack
	public int peek() {
		// step 1: validate for empty stack
		if(q1.isEmpty()) {
			throw new NoSuchElementException("Stack is Empty");
		}
		
		// step 2: peek top element
		return q1.peek();
	}
	
	
	// Get size of stack
	public int size() {
		return size;
	}
	
	
	// Check for is stack empty
	public boolean isEmpty() {
		return q1.isEmpty();
	}
}

public class StackImpUsingQueues {
	public static void main(String[] args) {
		StackUsingQueues stack = new StackUsingQueues();
		
		stack.push(10);
		stack.push(20);
		stack.push(15);
		stack.push(12);
				
		System.out.println("Top element is: " + stack.peek());
		System.out.println("Popped element is: " + stack.pop());
		System.out.println("Is Stack empty: " + stack.isEmpty());
		System.out.println("Current Stack size: " + stack.size());
	}
}