package com.tree.progs;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBianryTree {

	// all the nodes of the tree

	int height(Node root) {
		if (root == null) {
			return 0;

		} else {
			return Math.max(height(root.left), height(root.right)) + 1;
		}
	}

	// print nodes at distance k
	void printKDist(Node root, int k) {
		if (root == null) {
			return;
		}
		if (k == 0) {
			System.out.println(root.key + " ");
		} else {
			printKDist(root.left, k - 1);
			printKDist(root.right, k - 1);
		}
	}
	
	//level order traversal
	void printLevel(Node root) {
		if(root ==null) {
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(q.isEmpty() == false) {
			Node curr = q.poll();
			System.out.println(curr.key);
					if(curr.left != null) {
						q.add(curr.left);
					}
					if(curr.right!= null) {
						q.add(curr.right);
					}
		}
		
	}

}
