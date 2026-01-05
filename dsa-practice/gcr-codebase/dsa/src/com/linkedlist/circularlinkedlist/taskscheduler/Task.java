package com.linkedlist.circularlinkedlist.taskscheduler;

class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskList {
    Task head;
}