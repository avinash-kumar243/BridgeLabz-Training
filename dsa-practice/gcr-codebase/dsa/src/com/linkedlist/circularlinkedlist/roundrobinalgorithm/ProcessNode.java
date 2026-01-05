package com.linkedlist.circularlinkedlist.roundrobinalgorithm;


public class ProcessNode {

    int pid;
    int burstTime;
    int priority;

    int remainingTime;
    int waitingTime;
    int turnaroundTime;

    ProcessNode next;

    public ProcessNode(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.priority = priority;
        this.remainingTime = burstTime;
        this.next = null;
    }
}
