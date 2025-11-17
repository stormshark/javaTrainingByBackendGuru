package org.javaturk.ipj.project;

public class Queue {
    // This is a file that depicts what a queue class should look like in Java.
    // It includes method signatures and comments describing their functionality.

    /// Queue : first in first out which means if I add a object to an array it is going to be first
    /// if I remove an object then it is going to be first one
    /// first


    // Default maximum queue size
    public static int MAX_QUEUE_SIZE = 10;
    String[] queue = new String[MAX_QUEUE_SIZE];

    // Insert element at the bottom
    public boolean enqueue(String newElement) {
        return true;
    }

    // Remove element from the top
    public String dequeue() {
        return "OK";
    }

    // Remove all elements from queue
    public void clear() {
    }

// Queue status operations

    // Is queue empty?
    public boolean isEmpty() {
        return true;
    }

    // Is queue full?
    public boolean isFull() {
        return true;
    }

    // How many elements in queue?
    public int size() {
        return 10;
    }

    // Capacity of queue?
    public int getCapacity() {
        return 10;
    }

    // Outputs the elements in the queue.
    public void showElements() {
    }

    void main() {
        Queue tester = new Queue();
        tester.enqueue("araba");
    }

}
