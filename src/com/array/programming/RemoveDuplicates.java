package com.array.programming;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		int arr[] = {10,20,20,30,40,30,30};
		int n = arr.length;
		int temp[] = new int[n];
		int j=0;
		
		temp[j++]=arr[0];
		  // Iterate through the original array to find unique elements
        for (int i = 1; i < n; i++) {
            // Check if the current element is not equal to the previous element
            if (arr[i] != arr[i - 1]) {
                temp[j++] = arr[i]; // Add the unique element to the temp array
            }
        }
        // Copy the unique elements from temp back to arr
        for(int i=0;i<j;i++) {
        	arr[i]=temp[i];
        }
        
     // Update the length of the array
        n = j;
        
     // Print the array without duplicates
        System.out.println("Array without duplicates:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
	}

}
