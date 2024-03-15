package com.array.programming;

public class SlidingWindow {
	
	public static void main(String[] args) {
		
		int arr[] = {1,8,30,-5,20,7};
		int n = arr.length;
		int k = 3;
		
		System.out.println(maxSum(arr, n, k));		
	}
	
	public static int maxSum(int arr[], int n, int k) {
		int curr  = 0;
		
		for(int i=0;i<k;i++) {
			curr = curr + arr[i];
		}
		int result = curr;
		for(int i=k;i<n;i++) {
			curr = curr + arr[i] - arr[i-k];
			result = Math.max(result, curr);
		}
		return result;
	}

}
