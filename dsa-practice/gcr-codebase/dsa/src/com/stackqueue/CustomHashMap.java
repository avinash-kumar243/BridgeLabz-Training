package com.stackqueue;

import java.util.Objects;

public class CustomHashMap<K, V> {

    // Node for separate chaining
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node<K, V>[] buckets;
    private int capacity;
    private int size;

    @SuppressWarnings("unchecked")
    public CustomHashMap(int capacity) {
        this.capacity = capacity;
        this.buckets = new Node[capacity];
        this.size = 0;
    }

    private int getBucketIndex(K key) {
        return Math.abs(Objects.hashCode(key)) % capacity;
    }

    // Insert or Update
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        Node<K, V> head = buckets[index];

        // Check if key exists -> update
        Node<K, V> current = head;
        while (current != null) {
            if (Objects.equals(current.key, key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        // Insert new node at beginning
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = head;
        buckets[index] = newNode;
        size++;
    }

    // Retrieve
    public V get(K key) {
        int index = getBucketIndex(key);
        Node<K, V> current = buckets[index];

        while (current != null) {
            if (Objects.equals(current.key, key)) {
                return current.value;
            }
            current = current.next;
        }
        return null; // not found
    }

    // Delete
    public boolean remove(K key) {
        int index = getBucketIndex(key);
        Node<K, V> current = buckets[index];
        Node<K, V> prev = null;

        while (current != null) {
            if (Objects.equals(current.key, key)) {

                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false; // not found
    }

    public int size() {
        return size;
    }

    // Demo
    public static void main(String[] args) {

        CustomHashMap<String, Integer> map = new CustomHashMap<>(10);

        map.put("Apple", 50);
        map.put("Banana", 30);
        map.put("Orange", 40);

        System.out.println("Value of Banana: " + map.get("Banana"));

        map.put("Banana", 60); // update
        System.out.println("Updated Banana: " + map.get("Banana"));

        map.remove("Apple");
        System.out.println("Size after deletion: " + map.size());
    }
}
