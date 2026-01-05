package com.linkedlist.circularlinkedlist.taskscheduler;

public class AddTask {

    public static void addAtBeginning(TaskList list, Task newTask) {

        if(list.head == null) {
            list.head = newTask;
            newTask.next = newTask; // circular link
            return;
        }

        Task temp = list.head;
        while (temp.next != list.head) {
            temp = temp.next;
        }

        temp.next = newTask;
        newTask.next = list.head;
        list.head = newTask;
    }
    
    public static void addAtEnd(TaskList list, Task newTask) {

        if (list.head == null) {
            list.head = newTask;
            newTask.next = newTask;
            return;
        }

        Task temp = list.head;
        while (temp.next != list.head) {
            temp = temp.next;
        }

        temp.next = newTask;
        newTask.next = list.head;
    }
    
    public static void addAtPosition(TaskList list, Task newTask, int position) {

        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            AddTask.addAtBeginning(list, newTask);
            return;
        }

        Task temp = list.head;
        int index = 1;

        while (temp.next != list.head && index < position - 1) {
            temp = temp.next;
            index++;
        }

        newTask.next = temp.next;
        temp.next = newTask;
    }
}