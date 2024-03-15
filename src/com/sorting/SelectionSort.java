package com.sorting;

public class SelectionSort {
	
	public static void main(String[] args) {
		int arr[] = {8,16,5,24,3};
		selectionSort(arr);
		}
		
		//time complexity O(n2)
		public static void selectionSort(int arr[]) {
			int n = arr.length;
			int min;
			
			for(int i=0;i<n-1;i++) {
				min = i;
				for(int j=i+1;j<n;j++) {
					if(arr[j]<arr[min]) {
						min = j;
					}
				}
				int temp =arr[i];
				arr[i]= arr[min];
				arr[min]= temp;
			}
			for(int i:arr) {
				System.out.print(i + " ");
			}
			
	}

}
