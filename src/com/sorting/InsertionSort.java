package com.sorting;

public class InsertionSort {
	
	public static void main(String[] args) {
		int arr[] = {8,16,5,24,3};
		insertionSort(arr);
		}
		
		//time complexity O(n2)
		public static void insertionSort(int arr[]) {
			int n = arr.length;
			int temp, j;
			
			for(int i=1;i<n;i++) {
				temp = arr[i];
				j=i;
				while(j>0 && arr[j-1]>temp) {
					arr[j]=arr[j-1];
					j=j-1;
				}
				arr[j]=temp;
				
			}
			for(int i:arr) {
				System.out.print(i + " ");
			}
			
	}

}
