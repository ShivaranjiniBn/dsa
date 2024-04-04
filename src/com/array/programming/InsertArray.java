package com.array.programming;

public class InsertArray {
    // We can only insert an item if the array has any position left
    // It cannot be done for an array which is fixed

    // Time complexity is O(n)
    // Insert at the end of the array O(1)
    // Insert at the beginning teta(n)

    public static void main(String[] args) {
        int[] arr = {5, 7, 10, 20, 2};
        int position = 3;
        int element = 9;

        // Shift elements to the right starting from the position where we want to insert
        for (int i = arr.length - 1; i >= position - 1; i--) {
            arr[i] = arr[i - 1];
        }
        // Insert the element at the specified position
        arr[position - 1] = element;

        // Print the updated array
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
}
