package com.linkedList;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
       
    }
}
// insert at the beginning of list
public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void insertAtBeginning(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Insert elements at the beginning of the list
        list.insertAtBeginning(3);
        list.insertAtBeginning(6);
        list.insertAtBeginning(9);

        // Display the updated list
        System.out.print("Updated List: ");
        list.display();
    }
}
