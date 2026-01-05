package com.linkedlist.circularlinkedlist.taskscheduler;

public class RemoveTask {
    public static void removeTask(TaskList list, int taskId) {

        if (list.head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        Task curr = list.head;
        Task prev = null;

        // Case 1: deleting head
        if (curr.taskId == taskId) {

            // only one node
            if (curr.next == list.head) {
                list.head = null;
                return;
            }

            // move to last node
            Task last = list.head;
            while (last.next != list.head) last = last.next;

            list.head = curr.next;
            last.next = list.head;
            return;
        }

        // Case 2: delete non-head node
        do {
            prev = curr;
            curr = curr.next;

            if (curr.taskId == taskId) {
                prev.next = curr.next;
                return;
            }

        } while (curr != list.head);

        System.out.println("Task not found.");
    }
}
