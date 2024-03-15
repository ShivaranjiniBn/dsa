package com.array.programming;

public class LongestSubArray {
	
	public static void main(String[] args) {
		int arr[] = {5,10,20,6,3,8};
		
		System.out.println(maxEvenOdd(arr));
		
	}
	
	public static int maxEvenOdd(int arr[]) {
		int n = arr.length;
		int result = 1;
		int current = 1;
		for(int i=1;i<n;i++) {
			if((arr[i]%2==0 && arr[i-1]%2 !=0) || (arr[i]%2 !=0 && arr[i-1]%2 ==0)) {
				current++;
				result = Math.max(current, result);
			}else {
				current = 1;
			}
		}
		return result;
	}

}
