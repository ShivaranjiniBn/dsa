package com.linkedList;


	// Node class representingn a node in the linked list
	class Node2 {
	    int data;
	    Node2 next;

	    public Node2(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	// LinkedList class to handle operations on the linked list
	public class DeleteAtBegin{
	    private Node2 head;

	    public DeleteAtBegin() {
	        this.head = null;
	    }

	    // Method to insert a node at the beginning of the linked list
	    public void insert(int data) {
	        Node2 newNode = new Node2(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            newNode.next = head;
	            head = newNode;
	        }
	    }

	    // Method to delete the first node of the linked list
	    public void deleteFirstNode() {
	        if (head == null) {
	            System.out.println("Linked list is empty. Nothing to delete.");
	        } else {
	            Node2 temp = head;
	            head = head.next;
	            temp.next = null; // Disconnect the deleted node
	            System.out.println("Deleted node with data: " + temp.data);
	        }
	    }

	    // Method to display the linked list
	    public void display() {
	        Node2 current = head;
	        while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }
	


	    public static void main(String[] args) {
	    	DeleteAtBegin list = new DeleteAtBegin();

	        // Insert some nodes into the linked list
	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.insert(40);

	        System.out.println("Original Linked List:");
	        list.display();

	        // Delete the first node
	        list.deleteFirstNode();

	        System.out.println("Linked List after deleting first node:");
	        list.display();
	    }
	


}
