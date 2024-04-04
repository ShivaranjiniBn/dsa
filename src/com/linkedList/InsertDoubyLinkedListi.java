package com.linkedList;

//Node class representing a node in the doubly linked list
class Node5 {
 int data;
 Node5 prev;
 Node5 next;

 public Node5(int data) {
     this.data = data;
     this.prev = null;
     this.next = null;
 }
}

//DoublyLinkedList class to handle operations on the doubly linked list
class InsertDoubyLinkedListi {
 private Node5 head;
 private Node5 tail;

 public InsertDoubyLinkedListi() {
     this.head = null;
     this.tail = null;
 }

 // Method to insert a node at the beginning of the doubly linked list
 public void insertAtBeginning(int data) {
	 Node5 newNode = new Node5(data);
     if (head == null) {
         head = newNode;
         tail = newNode;
     } else {
         newNode.next = head;
         head.prev = newNode;
         head = newNode;
     }
 }
 
 // Method to insert a node at the beginning of the doubly linked list
 public void insertAtEnd(int data) {
	 Node5 temp = new Node5(data);
     if (head == null) {
         head =  temp;
     } 
    	 Node5 current = head;
        while(current != null) {
        	current=current.next;
        	current.next=temp;
        	temp.prev = current;
     }
 }

 // Method to display the doubly linked list from head to tail
 public void displayFromHead() {
	 Node5 current = head;
     while (current != null) {
         System.out.print(current.data + " <-> ");
         current = current.next;
     }
     System.out.println("null");
 }

 // Method to display the doubly linked list from tail to head
 public void displayFromTail() {
	 Node5 current = tail;
     while (current != null) {
         System.out.print(current.data + " <-> ");
         current = current.prev;
     }
     System.out.println("null");
 }

 //cicular linkedlist traversing
 void printList(Node5 head) {
	 if(head == null) return;
	 Node5 r = head;
	 do {
		 System.out.println(r.data+" ");
		 r=r.next;
	 }while(r!=head);
 }


 public static void main(String[] args) {
	 InsertDoubyLinkedListi list = new InsertDoubyLinkedListi();

     // Insert some nodes at the beginning of the doubly linked list
     list.insertAtBeginning(30);
     list.insertAtBeginning(20);
     list.insertAtBeginning(10);

     System.out.println("Doubly Linked List from head to tail:");
     list.displayFromHead();

     System.out.println("Doubly Linked List from tail to head:");
     list.displayFromTail();
 
}
 }


