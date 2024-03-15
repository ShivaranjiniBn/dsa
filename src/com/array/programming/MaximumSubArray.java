package com.array.programming;

public class MaximumSubArray {
	public static void main(String[] args) {
		int arr[] = {-3,8,-2,4,-5,6};
		System.out.println(maxSum(arr));
		
	}

	public static int maxSum(int arr[]) {
		
		int result = arr[0];
		int maxEnding = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			maxEnding = Math.max(maxEnding+arr[i], arr[i]);
			result = Math.max(maxEnding, result);
		}
		return result;
	}
}
