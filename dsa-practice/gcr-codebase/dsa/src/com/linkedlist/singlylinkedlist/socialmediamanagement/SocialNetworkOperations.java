package com.linkedlist.singlylinkedlist.socialmediamanagement;

import java.util.*;

public class SocialNetworkOperations {

    // Add new user to list (end insertion)
    public static UserNode addUser(UserNode head, UserNode newUser) {
        if (head == null) return newUser;

        UserNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newUser;
        return head;
    }

    // Helper: Find user by ID
    public static UserNode searchById(int id, UserNode head) {
        while (head != null) {
            if (head.userId == id) return head;
            head = head.next;
        }
        return null;
    }

    // Helper: Find user by Name
    public static UserNode searchByName(String name, UserNode head) {
        while (head != null) {
            if (head.name.equalsIgnoreCase(name)) return head;
            head = head.next;
        }
        return null;
    }

    // Add friend connection (bidirectional)
    public static void addFriendConnection(int u1, int u2, UserNode head) {
        UserNode userA = searchById(u1, head);
        UserNode userB = searchById(u2, head);

        if (userA == null || userB == null) return;

        if (!userA.friends.contains(u2)) userA.friends.add(u2);
        if (!userB.friends.contains(u1)) userB.friends.add(u1);
    }

    // Remove friend connection (bidirectional)
    public static void removeFriendConnection(int u1, int u2, UserNode head) {
        UserNode userA = searchById(u1, head);
        UserNode userB = searchById(u2, head);

        if (userA == null || userB == null) return;

        userA.friends.remove(Integer.valueOf(u2));
        userB.friends.remove(Integer.valueOf(u1));
    }

    // Display all friends of a given user
    public static void displayFriends(int userId, UserNode head) {
        UserNode user = searchById(userId, head);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("\nFriends of " + user.name + " (" + user.userId + "):");
        if (user.friends.isEmpty()) {
            System.out.println("No friends.");
            return;
        }

        for (Integer id : user.friends)
            System.out.println("Friend ID: " + id);
    }

    // Count number of friends for each user
    public static void countFriends(UserNode head) {
        System.out.println("\n--- Friend Count per User ---");
        while (head != null) {
            System.out.println(head.name + " (" + head.userId + ") -> " + head.friends.size() + " friends");
            head = head.next;
        }
    }

    // Find mutual friends between two users
    public static void mutualFriends(int u1, int u2, UserNode head) {

        UserNode userA = searchById(u1, head);
        UserNode userB = searchById(u2, head);

        if (userA == null || userB == null) return;

        System.out.println("\nMutual Friends of " + userA.name + " and " + userB.name + ":");

        Set<Integer> set = new HashSet<>(userA.friends);
        boolean found = false;

        for (Integer id : userB.friends) {
            if (set.contains(id)) {
                System.out.println("Friend ID: " + id);
                found = true;
            }
        }

        if (!found)
            System.out.println("No mutual friends.");
    }

    // Display all users
    public static void displayAllUsers(UserNode head) {
        System.out.println("\n--- User List ---");
        while (head != null) {
            System.out.println("ID: " + head.userId +
                    ", Name: " + head.name +
                    ", Age: " + head.age +
                    ", Friends: " + head.friends);
            head = head.next;
        }
    }
}
