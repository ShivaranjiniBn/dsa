package com.sorting;

public class MergeSort {
	int array[];
	int tempArray[];
	int length;
	public static void main(String[] args) {
		int arr[] = {8,6,47,25,12};
		MergeSort ms = new MergeSort();
		ms.sort(arr);
		
		for(int i : arr) {
			System.out.println(i);
		}
	}
	public void sort(int[] arr) {
		this.array = arr;
		this.length = arr.length;
		this.tempArray = new int[length];
		
		divideArray(0, arr.length-1);
		
	}
	public void divideArray(int lowerIndex, int higherIndex) {

		if(lowerIndex < higherIndex) {
			int middleIndex = lowerIndex + (higherIndex - lowerIndex)/2;
			
			divideArray(lowerIndex, middleIndex);
			
			divideArray(middleIndex+1, higherIndex);
			
			mergeArray(lowerIndex, middleIndex, higherIndex);
			
		}
	}
	public void mergeArray(int lowerIndex, int middleIndex, int higherIndex) {
		for(int i=lowerIndex;i<=higherIndex;i++) {
			tempArray[i]=array[i];
		}
		
		int left = lowerIndex;
		int right = middleIndex+1;
		int current = lowerIndex;
		
		while(left <= middleIndex && right <= higherIndex) {
			if(tempArray[left] <= tempArray[right]) {
				array[current] = tempArray[left];
				left++;
			}else {
				array[current] = tempArray[right];
				right++;
			}
			current++;
		}
		while(left <= middleIndex) {
			array[current] = tempArray[left];
			left++;
			current++;
		}
		
	}

}
