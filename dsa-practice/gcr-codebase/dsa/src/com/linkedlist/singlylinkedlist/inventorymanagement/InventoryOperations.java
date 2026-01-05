package com.linkedlist.singlylinkedlist.inventorymanagement;

public class InventoryOperations {

    // Add item at beginning
    public static Item addAtBeginning(Item newItem, Item head) {
        newItem.next = head;
        return newItem;
    }

    // Add item at end
    public static Item addAtEnd(Item newItem, Item head) {
        if (head == null) return newItem;

        Item temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newItem;
        return head;
    }

    // Add item at specific position (1-based index)
    public static Item addAtPosition(Item newItem, int position, Item head) {
        if (position == 1) return addAtBeginning(newItem, head);

        Item temp = head;
        for (int i = 1; temp != null && i < position - 1; i++)
            temp = temp.next;

        if (temp == null) return head; // invalid position

        newItem.next = temp.next;
        temp.next = newItem;
        return head;
    }

    // Remove item by Item ID
    public static Item removeById(int id, Item head) {
        if (head == null) return null;

        if (head.itemId == id) return head.next;

        Item temp = head;
        while (temp.next != null && temp.next.itemId != id)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;

        return head;
    }

    // Update quantity by Item ID
    public static void updateQuantity(int id, int newQty, Item head) {
        Item item = searchById(id, head);
        if (item != null) item.quantity = newQty;
    }

    // Search by Item ID
    public static Item searchById(int id, Item head) {
        while (head != null) {
            if (head.itemId == id) return head;
            head = head.next;
        }
        return null;
    }

    // Search by Item Name
    public static Item searchByName(String name, Item head) {
        while (head != null) {
            if (head.itemName.equalsIgnoreCase(name)) return head;
            head = head.next;
        }
        return null;
    }

    // Calculate total inventory value
    public static double totalInventoryValue(Item head) {
        double total = 0;
        while (head != null) {
            total += head.quantity * head.price;
            head = head.next;
        }
        return total;
    }

    // ---------- Sorting (Merge Sort on Linked List) ----------

    public static Item sortByName(Item head, boolean ascending) {
        return mergeSort(head, ascending, true);
    }

    public static Item sortByPrice(Item head, boolean ascending) {
        return mergeSort(head, ascending, false);
    }

    private static Item mergeSort(Item head, boolean asc, boolean sortByName) {
        if (head == null || head.next == null) return head;

        Item mid = getMiddle(head);
        Item next = mid.next;
        mid.next = null;

        Item left = mergeSort(head, asc, sortByName);
        Item right = mergeSort(next, asc, sortByName);

        return merge(left, right, asc, sortByName);
    }

    private static Item merge(Item a, Item b, boolean asc, boolean sortByName) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;

        if (sortByName)
            condition = asc ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
                            : a.itemName.compareToIgnoreCase(b.itemName) >= 0;
        else
            condition = asc ? a.price <= b.price : a.price >= b.price;

        if (condition) {
            a.next = merge(a.next, b, asc, sortByName);
            return a;
        } else {
            b.next = merge(a, b.next, asc, sortByName);
            return b;
        }
    }

    private static Item getMiddle(Item head) {
        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Display inventory
    public static void display(Item head) {
        while (head != null) {
            System.out.println(
                "Name: " + head.itemName +
                ", ID: " + head.itemId +
                ", Qty: " + head.quantity +
                ", Price: " + head.price
            );
            head = head.next;
        }
    }
}