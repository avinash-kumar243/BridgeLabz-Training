package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class SearchStudent {
    public static Student searchByRoll(int roll, Student head) {
        Student temp = head;

        while(temp != null) {
            if(temp.roll == roll) {
                return temp;
            }
            temp = temp.next;
        }
        return null; // not found
    }
}