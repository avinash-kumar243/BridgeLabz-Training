package com.linkedlist.singlylinkedlist.inventorymanagement;


public class Main {
    public static void main(String[] args) {

        Item head = new Item("Keyboard", 101, 10, 1500);

        head = InventoryOperations.addAtEnd(new Item("Mouse", 102, 20, 700), head);
        head = InventoryOperations.addAtBeginning(new Item("Monitor", 103, 5, 12000), head);
        head = InventoryOperations.addAtPosition(new Item("CPU", 104, 3, 35000), 2, head);

        System.out.println("\n--- Inventory List ---");
        InventoryOperations.display(head);

        // Update quantity
        InventoryOperations.updateQuantity(102, 50, head);

        // Remove item
        head = InventoryOperations.removeById(101, head);

        System.out.println("\n--- After Update & Deletion ---");
        InventoryOperations.display(head);

        // Search
        System.out.println("\nSearch Result: " + 
            InventoryOperations.searchByName("CPU", head).itemName);

        // Total value
        System.out.println("\nTotal Inventory Value = " +
            InventoryOperations.totalInventoryValue(head));

        // Sorting examples
        head = InventoryOperations.sortByName(head, true);   // ascending
        System.out.println("\n--- Sorted By Name (ASC) ---");
        InventoryOperations.display(head);

        head = InventoryOperations.sortByPrice(head, false); // descending
        System.out.println("\n--- Sorted By Price (DESC) ---");
        InventoryOperations.display(head);
    }
}
