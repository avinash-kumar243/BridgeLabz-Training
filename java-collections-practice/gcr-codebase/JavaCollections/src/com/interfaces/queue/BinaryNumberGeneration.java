package com.interfaces.queue;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGeneration {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(5);
		queue.offer(10);
		queue.offer(20);
		queue.offer(12);
		queue.offer(30);
		queue.offer(16);
		
		System.out.println("Queue elements are: " + queue);

		Queue<String> result = convertInBinaryString(queue);
		
		System.out.println("\nBinary strings are: " + result);
	}

	private static Queue<String> convertInBinaryString(Queue<Integer> queue) {
		Queue<String> result = new LinkedList<>();
		
		while(!queue.isEmpty()) {
			int num = queue.poll();
			
			String binaryString = Integer.toBinaryString(num);
			result.offer(binaryString);
		}
		return result;
	}
}