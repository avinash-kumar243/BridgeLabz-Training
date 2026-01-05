package com.linkedlist.circularlinkedlist.taskscheduler;

public class TaskNavigator {

    private static Task current = null;

    public static Task viewCurrent(TaskList list) {
        if (list.head == null) {
            System.out.println("No tasks available.");
            return null;
        }

        if (current == null)
            current = list.head;

        return current;
    }

    public static Task moveToNext(TaskList list) {
        if (list.head == null) return null;

        if (current == null)
            current = list.head;
        else
            current = current.next;

        return current;
    }
}
