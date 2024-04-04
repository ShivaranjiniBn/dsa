package com.queue.progs;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
	
	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		Queue<Integer> q1 = new ArrayDeque<Integer>();
		
		q.offer(10);
		q.offer(23);
		q.offer(47); //10 23 47
		
		System.out.println(q.peek());
		System.out.println(q.poll());
	    System.out.println(q.peek());
	}
	

}
