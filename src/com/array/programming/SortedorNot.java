package com.array.programming;

public class SortedorNot {
	
	//O(n) time complexity
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,7,7};
		
		boolean result = sortedorNot(arr);
		System.out.println(result);
	}

	public static boolean sortedorNot(int[] arr) {
		for(int i=1;i<arr.length;i++) {
				if(arr[i]<arr[i-1]) 
					return false;
				
		}
		return true;
	}

}
