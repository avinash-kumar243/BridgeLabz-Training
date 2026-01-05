package com.linkedlist.circularlinkedlist.roundrobinalgorithm;

public class Main {

    public static void main(String[] args) {

        ProcessNode head = null;

        head = RoundRobinScheduler.addProcess(head, new ProcessNode(1, 10, 2));
        head = RoundRobinScheduler.addProcess(head, new ProcessNode(2, 5, 1));
        head = RoundRobinScheduler.addProcess(head, new ProcessNode(3, 8, 3));

        RoundRobinScheduler.displayQueue(head);

        int timeQuantum = 3;
        RoundRobinScheduler.roundRobin(head, timeQuantum);
    }
}
