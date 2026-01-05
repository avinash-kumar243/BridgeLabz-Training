package com.linkedlist.circularlinkedlist.roundrobinalgorithm;

public class RoundRobinScheduler {

    // Add process at end (circular)
    public static ProcessNode addProcess(ProcessNode head, ProcessNode newProcess) {
        if (head == null) {
            newProcess.next = newProcess;
            return newProcess;
        }

        ProcessNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newProcess;
        newProcess.next = head;

        return head;
    }

    // Remove process by PID
    public static ProcessNode removeProcess(int pid, ProcessNode head) {
        if (head == null) return null;

        // Single node case
        if (head.pid == pid && head.next == head)
            return null;

        ProcessNode curr = head;
        ProcessNode prev = null;

        do {
            if (curr.pid == pid) {
                if (prev != null)
                    prev.next = curr.next;
                else {
                    // deleting head -> find last node
                    ProcessNode last = head;
                    while (last.next != head)
                        last = last.next;

                    head = head.next;
                    last.next = head;
                }
                return head;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        return head; // not found
    }

    // Display processes in circular queue
    public static void displayQueue(ProcessNode head) {
        if (head == null) return;

        System.out.println("\nCurrent Ready Queue:");
        ProcessNode temp = head;

        do {
            System.out.println("PID: " + temp.pid +
                    ", BT: " + temp.remainingTime +
                    ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    // Execute Round Robin Scheduling
    public static void roundRobin(ProcessNode head, int timeQuantum) {
        if (head == null) return;

        int time = 0;

        System.out.println("\n--- Round Robin Execution ---");

        ProcessNode curr = head;

        while (head != null) {

            if (curr.remainingTime > 0) {

                if (curr.remainingTime > timeQuantum) {
                    time += timeQuantum;
                    curr.remainingTime -= timeQuantum;
                    System.out.println("\nProcess " + curr.pid + " executed for " + timeQuantum);
                } else {
                    time += curr.remainingTime;
                    curr.remainingTime = 0;

                    curr.turnaroundTime = time;
                    curr.waitingTime = curr.turnaroundTime - curr.burstTime;

                    System.out.println("\nProcess " + curr.pid + " completed.");

                    head = removeProcess(curr.pid, head);
                }

                displayQueue(head);
            }

            if (head == null) break;
            curr = curr.next;
        }

        calculateAverages(head);
    }

    // Compute Average Waiting & Turnaround Times
    public static void calculateAverages(ProcessNode head) {
        if (head == null) return;

        double totalWT = 0, totalTAT = 0;
        int count = 0;

        ProcessNode temp = head;
        do {
            totalWT += temp.waitingTime;
            totalTAT += temp.turnaroundTime;
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("\n--- Scheduling Results ---");
        System.out.println("Average Waiting Time     : " + (totalWT / count));
        System.out.println("Average Turnaround Time  : " + (totalTAT / count));
    }
}
