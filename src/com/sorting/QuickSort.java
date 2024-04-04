package com.sorting;

public class QuickSort {
	
	public static void main(String[] args) {
		int arr[] = {11,2,15,6,8,26,4};
		int length = arr.length;
		QuickSort qs = new QuickSort();
		
		qs.quickSortRecursion(arr, 0,length-1 );
		
		for(int i : arr) {
			System.out.print(i+ " ");
		}
		
	}

	public void quickSortRecursion(int[] arr, int low, int high) {
		int pi = partition(arr,low,high);
		if(low<pi-1) {
			quickSortRecursion(arr,low,pi-1);
		}if(pi<high) {
			quickSortRecursion(arr,pi,high);
		}
		
	}
	
	int partition(int[] arr, int low, int high) {
		int pivot = arr[(low+high)/2];
		while(low<=high) {
			while(arr[low]<pivot) {
				low++;
			}while(arr[high]>pivot) {
				high--;
			}
			if(low<=high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high]= temp;
				low++;
				high--;
			}
			
		}
		return low;
	}

}
