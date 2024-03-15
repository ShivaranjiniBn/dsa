package com.array.programming;

public class FrequenciesInSortedArray {

    public static void main(String[] args) {
        int arr[] = {10, 10, 20, 20, 20, 30, 30, 40};
        
        // Find and print frequencies of elements
        findFrequencies(arr);
    }

    public static void findFrequencies(int arr[]) {
        int n = arr.length;
        
        // Initialize variables to store the current element and its frequency
        int currentElement = arr[0];
        int frequency = 1;

        // Iterate through the array starting from the second element
        for (int i = 1; i < n; i++) {
            // If the current element is equal to the previous element, increment the frequency
            if (arr[i] == currentElement) {
                frequency++;
            } else { // If the current element is different, print the frequency of the previous element
                System.out.println(currentElement + " occurs " + frequency + " times");
                
                // Update the current element and reset the frequency counter
                currentElement = arr[i];
                frequency = 1;
            }
        }

        // Print the frequency of the last element
        System.out.println(currentElement + " occurs " + frequency + " times");
    }
}
