package com.linkedlist.singlylinkedlist.socialmediamanagement;

import java.util.ArrayList;
import java.util.List;

public class UserNode {

    int userId;
    String name;
    int age;

    List<Integer> friends; // Stores friend user IDs
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.next = null;
    }
}
