package com.linkedlist.circularlinkedlist.taskscheduler;

public class DisplayTasks {

    public static void display(TaskList list) {

        if (list.head == null) {
            System.out.println("No tasks in the scheduler.");
            return;
        }

        Task temp = list.head;

        System.out.println("\nTasks in Scheduler:\n");

        do {
            System.out.println("Task ID   : " + temp.taskId);
            System.out.println("Name      : " + temp.taskName);
            System.out.println("Priority  : " + temp.priority);
            System.out.println("Due Date  : " + temp.dueDate);
            System.out.println("------------------------");

            temp = temp.next;

        } while (temp != list.head);
    }
}
