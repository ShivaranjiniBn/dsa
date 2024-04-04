package com.queue.progs;

import java.util.Queue;

import java.util.LinkedList;


class Main {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public Main() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int value) {
        // Add the new element to queue1
        queue1.add(value);
    }

    public int pop() {
        // Move elements from queue1 to queue2 until only one element is left in queue1
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        // Extract the last element from queue1 (which is the top element in the stack)
        int poppedElement = queue1.poll();

        // Swap queue1 and queue2 to maintain the stack property
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return poppedElement;
    }

    public int top() {
        // Move elements from queue1 to queue2 until only one element is left in queue1
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        // Extract the last element from queue1 (which is the top element in the stack)
        int topElement = queue1.peek();

        // Move the top element to queue2
        queue2.add(queue1.poll());

        // Swap queue1 and queue2 to maintain the stack property
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}

public class StackUsingQueue {
    public static void main(String[] args) {
        Main stack = new Main();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.top()); // Output: 30
        System.out.println("Popped element: " + stack.pop()); // Output: 30
        System.out.println("Top element after pop: " + stack.top()); // Output: 20

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
    }
}

