package com.linkedlist.singlylinkedlist.socialmediamanagement;

public class Main {
    public static void main(String[] args) {

        UserNode head = null;

        head = SocialNetworkOperations.addUser(head, new UserNode(1, "Avi", 22));
        head = SocialNetworkOperations.addUser(head, new UserNode(2, "Deepak", 23));
        head = SocialNetworkOperations.addUser(head, new UserNode(3, "Meera", 21));
        head = SocialNetworkOperations.addUser(head, new UserNode(4, "Rohan", 24));

        // Add friend connections
        SocialNetworkOperations.addFriendConnection(1, 2, head);
        SocialNetworkOperations.addFriendConnection(1, 3, head);
        SocialNetworkOperations.addFriendConnection(2, 3, head);
        SocialNetworkOperations.addFriendConnection(3, 4, head);

        SocialNetworkOperations.displayAllUsers(head);

        SocialNetworkOperations.displayFriends(1, head);

        SocialNetworkOperations.mutualFriends(1, 2, head);

        SocialNetworkOperations.removeFriendConnection(1, 3, head);

        System.out.println("\nAfter removing connection (1–3):");
        SocialNetworkOperations.displayFriends(1, head);

        SocialNetworkOperations.countFriends(head);
    }
}
