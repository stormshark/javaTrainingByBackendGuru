package org.javaturk.ipj.project;

import java.util.Arrays;

public class Stack {

    // Default maximum stack size
    public static int MAX_STACK_SIZE = 10;
    int lastElement = MAX_STACK_SIZE - 1;

    String[] ourInitialStack = new String[MAX_STACK_SIZE];

    // Put element on the top
    public boolean push(String newElement) {
        if (ourInitialStack[0] != null) {
            return false;
        } else
            for (int lastElement = MAX_STACK_SIZE - 1; lastElement >= 0; lastElement--) {
                if (ourInitialStack[lastElement] == null) {
                    ourInitialStack[lastElement] = newElement;
                    break;
                }
            }
        return true;
    }

    // Pop element from the top
    public String pop() {

        if (ourInitialStack[lastElement] == null) {
            return "false";
        } else
            for (int i = 0; i <= lastElement; i++) {
                if (ourInitialStack[i] != null) {
                    ourInitialStack[i] = null;
                    break;
                }
            }
        return "true";
    }

    // Remove all elements from stack
    public void clear() {
        Arrays.fill(ourInitialStack, null);
    }

// Stack status operations

    // Is stack empty?
    public boolean isEmpty() {
        if (ourInitialStack[lastElement] == null) {
            return true;
        } else {
            return false;
        }
    }

    // Is stack full?
    public boolean isFull() {
        if (ourInitialStack[0] == null) {
            return true;
        } else {
            return false;
        }
    }

    // How many elements in stack?
    public int size() {

        for (int i = 0; i <= lastElement; i++) {
            if (ourInitialStack[i] != null) {
                return i;
            }
        }
        return MAX_STACK_SIZE;
    }

    // Capacity of stack?
    public int getCapacity() {
        return MAX_STACK_SIZE;

    }

    // Outputs the elements in the stack
    public void showElements() {
        for (int i = 0; i <= lastElement; i++) {
            IO.println(i + 1 + ". inci element " + ourInitialStack[i]);
        }
    }

    void main() {

        Stack stacker = new Stack();
        stacker.size();
        stacker.push("Ali");
        stacker.push("Veli");
        stacker.push("Mehmet");
        stacker.size();
        stacker.showElements();
        stacker.push("Ali");
        stacker.push("Veli");
        stacker.push("Mehmet");
        stacker.push("Ali");
        stacker.size();
        stacker.push("Veli");
        stacker.push("Mehmet");
        stacker.push("Ali");
        stacker.push("Veli");
        stacker.push("Mehmet");
        stacker.showElements();
        stacker.pop();
        stacker.pop();
        stacker.pop();
        stacker.showElements();
        stacker.pop();
        stacker.pop();
        stacker.showElements();
        stacker.clear();
        stacker.showElements();
        stacker.size();

    }
}
