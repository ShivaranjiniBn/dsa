package com.linkedList;

class Node6{
	int data;
	Node6 next;
	
	public Node6(int x) {
		this.data=x;
	}
}

public class SimpleLinkedList {
	
	public static void main(String[] args) {
		Node6 head = new Node6(7);
		Node6 n1 = new Node6(32);
		Node6 n2 = new Node6(24);
		head.next=n1;
		n1.next=n2;
		ptintList(head);
		
	}
	//traversing the linked list
	public static void ptintList(Node6 head) {
		//begin the current initialization from head
		Node6 current = head;
		while(current != null) {
			System.out.println(current.data+ " ");
			current = current.next;
		}
	}
	
	//recursive calling the method to print data
	public static void printl(Node6 head) {
		if(head == null) {
			return;
		}
		System.out.println(head.data+" ");
		printl(head.next);
	}

}
