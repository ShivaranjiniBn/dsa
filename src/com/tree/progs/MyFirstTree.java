package com.tree.progs;

class Node{
	int key;
	Node left;
	Node right;
	
	Node(int key){
		this.key=key;
	}
}

public class MyFirstTree {
	//non linear data structure it stores the data in hirarchial form nodes
	
	public static void main(String[] args) {
		 Node root = new Node(10);
		  root.left = new Node(10);
		 root.right  = new Node(10);
		 root.left.left = new Node(10);
		
		 
	}
	
	

}
