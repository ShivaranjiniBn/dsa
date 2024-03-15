package com.array.programming;

public class LinearSearch {
	// O(n) time complexity
	public static void main(String[] args) {
		int[] arr = { 1, 5, 8, 9 };
		int key = 7;
		boolean flag = false;
		int i;
		for( i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println(arr[i] + " is at the index position: " +i );
		}else {
			System.out.println("emelemt not found");
		}
		
	}
}
