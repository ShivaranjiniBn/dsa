package com.array.programming;

public class MoveZerosToLeft {
	
	public static void moveTo(int arr[]) {
		int n = arr.length;
		int count = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count]=temp;
				count++;
			}
			
		}
	}
	public static void main(String[] args) {
		int arr[] = {10,12,0,5,0,0,8};
		
		moveTo(arr);
		
		for(int i : arr) {
		System.out.println(i);
		}
	}

}
