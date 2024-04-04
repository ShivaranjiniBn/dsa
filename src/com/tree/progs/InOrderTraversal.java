package com.tree.progs;

public class InOrderTraversal {
	
	void inorder(Node root) { // left root right
		if(root != null) {
			inorder(root.left);
			System.out.println(root.key+ " ");
			inorder(root.right);
		}
	}
	
	void preorder(Node root) { // root left right 
		if(root != null) {
			System.out.println(root.key);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	void postOrder(Node root) { // left right root
		if(root != null) {
			preorder(root.left);
			preorder(root.right);
			System.out.println(root.key);
		}
	}

}
