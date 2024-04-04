package com.stack.programming;

import java.util.ArrayDeque;

public class MyStackUsingArrayDeque {
	
	public static void main(String[] args) {
		ArrayDeque< Integer> s = new ArrayDeque<Integer>();
					s.push(10);
					s.push(56);
					s.push(23);
					System.out.println(s.size());
					System.out.println(s.isEmpty());
	}
}
