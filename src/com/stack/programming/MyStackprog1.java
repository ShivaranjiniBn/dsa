package com.stack.programming;

public class MyStackprog1 {
	
	int arr[];
	int cap;
	int top;
	
	public MyStackprog1(int c) {
		this.top=-1;
		this.cap=c;
		this.arr= new int[cap];
	}
	
	void push(int x) {
		top++;
		arr[top]=x;
	}

	int pop() {
		int res =arr[top];
		top--;
		return res;
	}
	
	int size() {
		return top+1;
	}
	
	boolean isEmpty() {
		return (top==-1);
	}
	
	public static void main(String[] args) {
		MyStackprog1 mystack = new MyStackprog1(5);
		mystack.push(4);
		mystack.push(32);
		mystack.push(16);
		mystack.push(65);
		System.out.println(mystack.size());
		System.out.println(mystack.pop());
		System.out.println(mystack.isEmpty());
		
		
	}
}
