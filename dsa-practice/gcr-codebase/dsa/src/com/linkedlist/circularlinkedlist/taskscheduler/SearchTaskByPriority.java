package com.linkedlist.circularlinkedlist.taskscheduler;

public class SearchTaskByPriority {

    public static void searchByPriority(TaskList list, int priority) {

        if (list.head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        boolean found = false;
        Task temp = list.head;

        do {
            if (temp.priority == priority) {
                System.out.println("Task Found -> ID: " + temp.taskId +
                                   ", Name: " + temp.taskName);
                found = true;
            }
            temp = temp.next;

        } while (temp != list.head);

        if (!found)
            System.out.println("No task with given priority.");
    }
}
