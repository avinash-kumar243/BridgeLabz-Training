package com.stackqueue;

import java.util.Stack;

public class QueueImplementationUsingStacks {

    private Stack<Integer> stackEnq = new Stack<>();
    private Stack<Integer> stackDeq = new Stack<>();

    // Enqueue operation (add element to queue)
    public void enqueue(int value) {
        stackEnq.push(value);
    }

    // Dequeue operation (remove element from queue)
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty. Cannot dequeue.");
        }

        // If dequeue stack is empty, transfer elements
        if (stackDeq.isEmpty()) {
            while (!stackEnq.isEmpty()) {
                stackDeq.push(stackEnq.pop());
            }
        }
        return stackDeq.pop();
    }

    // Peek operation (view front element)
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty. Cannot peek.");
        }

        if (stackDeq.isEmpty()) {
            while (!stackEnq.isEmpty()) {
                stackDeq.push(stackEnq.pop());
            }
        }
        return stackDeq.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stackEnq.isEmpty() && stackDeq.isEmpty();
    }

    // Demo
    public static void main(String[] args) {

    	QueueImplementationUsingStacks queue = new QueueImplementationUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front Element: " + queue.peek());   // 10
        System.out.println("Dequeued: " + queue.dequeue());     // 10

        queue.enqueue(40);

        System.out.println("Dequeued: " + queue.dequeue());     // 20
        System.out.println("Dequeued: " + queue.dequeue());     // 30
        System.out.println("Front Element: " + queue.peek());   // 40
    }
}
