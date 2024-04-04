package com.stack.programming;

import java.util.ArrayList;

public class MyStackprog2ArrayList {

    ArrayList<Integer> al = new ArrayList<>();

    // Push operation: Add an element to the top of the stack
    void push(int x) {
        al.add(x);
    }

    // Pop operation: Remove and return the element at the top of the stack
    int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int res = al.get(al.size() - 1);
        al.remove(al.size() - 1);
        return res;
    }

    // Peek operation: Return the element at the top of the stack without removing it
    int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return al.get(al.size() - 1);
    }

    // Check if the stack is empty
    boolean isEmpty() {
        return al.isEmpty();
    }

    public static void main(String[] args) {
        MyStackprog2ArrayList mys = new MyStackprog2ArrayList();

        // Pushing elements onto the stack
        mys.push(10);
        mys.push(20);
        mys.push(30);
        mys.push(40);
        mys.push(50);

        // Print elements in the stack
        System.out.println("Elements in the stack:");
        while (!mys.isEmpty()) {
            System.out.println(mys.pop());
        }
    }
}
