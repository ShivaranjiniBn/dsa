package com.queue.progs;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class MyDeque1 {
	
	public static void main(String[] args) {
		
		Deque<Integer> dq = new LinkedList<Integer>();
		dq.offerFirst(10);
		dq.offerLast(20);
		dq.offerFirst(5);
		dq.offerLast(15);
		// 5 10 20 15
		
		System.out.println(dq.peekFirst()); //5
		System.out.println(dq.peekLast()); //15
		dq.pollFirst(); //5
		dq.pollLast(); //15
		System.out.println(dq.peekFirst());  //10
		System.out.println(dq.peekLast());  //20
				
		
		
		Deque<Integer> dq1 = new LinkedList<Integer>();
		
		dq1.addFirst(10);
		dq1.addFirst(20);
		dq1.addFirst(15);
		dq1.addFirst(10);
		dq1.addFirst(05);
		dq1.addFirst(42);
		
		Iterator<Integer> it = dq1.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next()+ " ");
		}
	}

}
