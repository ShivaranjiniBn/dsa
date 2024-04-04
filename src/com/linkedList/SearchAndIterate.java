package com.linkedList;
//Node class representing a node in the linked list
class Node4 {
 int data;
 Node4 next;

 public Node4(int data) {
     this.data = data;
     this.next = null;
 }
}

//LinkedList class to handle operations on the linked list
class SearchAndIterate {
 private Node4 head;

 public SearchAndIterate() {
     this.head = null;
 }

 // Method to insert a node at the beginning of the linked list
 public void insert(int data) {
     Node4 newNode = new Node4(data);
     if (head == null) {
         head = newNode;
     } else {
         newNode.next = head;
         head = newNode;
     }
 }

 // Method to search for an element in the linked list
 public boolean search(int key) {
     Node4 current = head;
     while (current != null) {
         if (current.data == key) {
             return true; // Element found
         }
         current = current.next;
     }
     return false; // Element not found
 }

 // Method to display the linked list
 public void display() {
     Node4 current = head;
     while (current != null) {
         System.out.print(current.data + " -> ");
         current = current.next;
     }
     System.out.println("null");
 }



 public static void main(String[] args) {
	 SearchAndIterate list = new SearchAndIterate();

     // Insert some nodes into the linked list
     list.insert(10);
     list.insert(20);
     list.insert(30);
     list.insert(40);

     System.out.println("Original Linked List:");
     list.display();

     // Search for elements in the linked list
     int searchKey1 = 20;
     int searchKey2 = 50;

     if (list.search(searchKey1)) {
         System.out.println(searchKey1 + " found in the linked list.");
     } else {
         System.out.println(searchKey1 + " not found in the linked list.");
     }

     if (list.search(searchKey2)) {
         System.out.println(searchKey2 + " found in the linked list.");
     } else {
         System.out.println(searchKey2 + " not found in the linked list.");
     }
 }
}


