package com.interfaces.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(5);
		queue.offer(10);
		queue.offer(20);
		queue.offer(12);
		queue.offer(30);
		queue.offer(16);
		
		System.out.println("Queue elements are: " + queue);

		reverseQueue(queue);
		
		System.out.println("\nAfter reverse, queue elements are: " + queue);
	} 

	// Reverse queue
	private static void reverseQueue(Queue<Integer> queue) {
		if(queue.isEmpty()) return;
		
		int top = queue.remove();
		reverseQueue(queue);
		queue.add(top);
	}
}