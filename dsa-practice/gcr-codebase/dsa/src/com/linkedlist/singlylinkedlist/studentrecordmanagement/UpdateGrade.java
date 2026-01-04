package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class UpdateGrade {
    public static boolean updateGrade(int roll, String newGrade, Student head) {
        Student temp = head;

        while(temp != null) {
            if(temp.roll == roll) {
                temp.grade = newGrade;
                return true;   // update successful
            }
            temp = temp.next;
        }
        return false; // student not found
    }
}