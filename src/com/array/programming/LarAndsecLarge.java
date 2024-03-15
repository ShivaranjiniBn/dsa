package com.array.programming;

public class LarAndsecLarge {
	
	public static int largeElement(int arr[], int large) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>large)
			large = arr[i];
		}
		return large;
	}
	
	public static void main(String[] args) {
		int arr[] = {8,6,14,27,16};
		int large = arr[0];
		int secondLarge = arr[0];
		/*
		large = largeElement(arr,large);
		System.out.println(large);*/
		
		System.out.println("****************************");
		
		secondLarge = secondLargeElement(arr,large,secondLarge);
		System.out.println(secondLarge);
	}
	
	public static int secondLargeElement(int arr[], int large,int secondLarge) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>large) {
				secondLarge = large;
				large = arr[i];
			}
			else if(arr[i] != large && arr[i]>secondLarge)
				secondLarge = arr[i];
		}
		return  secondLarge;
	}

}
