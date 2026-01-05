package com.linkedlist.circularlinkedlist.taskscheduler;

public class Main {
    public static void main(String[] args) {

        TaskList list = new TaskList();

        AddTask.addAtBeginning(list,new Task(1,"Email Review",2,"10-Jan"));
        AddTask.addAtEnd(list,new Task(2,"Code Update",1,"12-Jan"));
        AddTask.addAtPosition(list,new Task(3,"Backup Data",3,"15-Jan"),2);
 
        DisplayTasks.display(list);

        System.out.println("\nCurrent Task:");
        Task t = TaskNavigator.viewCurrent(list);
        System.out.println(t.taskName);

        System.out.println("\nNext Task:");
        t = TaskNavigator.moveToNext(list);
        System.out.println(t.taskName);

        System.out.println("\nDeleting Task ID 2...");
        RemoveTask.removeTask(list,2);

        DisplayTasks.display(list);

        System.out.println("\nSearch Priority 3:");
        SearchTaskByPriority.searchByPriority(list,3);
    }
}
