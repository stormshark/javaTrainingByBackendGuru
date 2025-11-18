package org.javaturk.ipj.project;

import java.util.Arrays;

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
        // check empty cell and then fill it
        for (int i = 0; i < MAX_QUEUE_SIZE; i++) {
            if (queue[i] == null) {
                queue[i] = newElement;
                return true;
            }
        }
        return false;
    }

    // Remove element from the top
    public String dequeue() {

        for (int i = 0; i < MAX_QUEUE_SIZE; i++) {
            if (queue[i] != null) {
                queue[i] = null;
                return "dequeued";
            }
        }
        return "could not dequeued";
    }

    // Remove all elements from queue
    public void clear() {
        Arrays.fill(queue, null);
    }

// Queue status operations

    // Is queue empty?
    public boolean isEmpty() {
        for (int i = 0; i < MAX_QUEUE_SIZE; i++) {
            if (queue[i] != null) {
                return false;
            }
        }
        return true;
    }

    // Is queue full?
    public boolean isFull() {
        return queue[0] != null && queue[MAX_QUEUE_SIZE] != null;
    }

    // How many elements in queue?
    public int size() {
        int counter = 0;
        for (int i = 0; i < MAX_QUEUE_SIZE; i++) {
            if (queue[i] != null) {
                counter = counter + 1;
            }
        }
        return counter;
    }

    // Capacity of queue?
    public int getCapacity() {
        int counter = 0;
        for (int i = 0; i < MAX_QUEUE_SIZE; i++) {
            if (queue[i] != null) {
                counter = counter + 1;
            }
        }
        return MAX_QUEUE_SIZE - counter;
    }

    // Outputs the elements in the queue.
    public void showElements() {
        for (int i = 0; i < MAX_QUEUE_SIZE; i++) {
            IO.println(i + 1 + ". inci element " + queue[i]);
        }
    }

    void main() {
        Queue tester = new Queue();
        tester.enqueue("araba");
    }

}
