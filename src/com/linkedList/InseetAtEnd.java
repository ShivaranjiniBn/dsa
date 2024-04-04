package com.linkedList;

	class Node1 {
	    int data;
	    Node1 next;

	    public Node1(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	public class InseetAtEnd {
	    private Node1 head;

	    public InseetAtEnd() {
	        this.head = null;
	    }

	    public void insertAtEnd(int data) {
	        Node1 temp = new Node1(data);
	        if (head == null) {
	            head = temp;
	        } else {
	            Node1 current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = temp;
	        }
	    }

	    public void display() {
	        Node1 current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	InseetAtEnd list = new InseetAtEnd();

	        // Insert elements at the end of the list
	        list.insertAtEnd(3);
	        list.insertAtEnd(6);
	        list.insertAtEnd(9);

	        // Display the updated list
	        System.out.print("Updated List: ");
	        list.display();
	    }
	
 
	    
}
