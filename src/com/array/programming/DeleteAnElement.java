package com.array.programming;

public class DeleteAnElement {
    // delete an element in middle of the array

    public static void main(String[] args) {
        int[] arr = {3, 8, 12, 5, 6};
        int n = arr.length; // initial size of array
        int ele = 12;
        n = deleteElement(arr, n, ele); // update n with new size after deletion
        //n = deleteLastElement(arr,n)
        for (int i = 0; i < n; i++) { // loop up to the new size of the array
            System.out.println(arr[i]);
        }
    }

    static int deleteElement(int arr[], int n, int ele) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == ele) {
                break;
            }
        }
        if (i == n) {
            return n; // element not found, return original size
        }
        for (int j = i; j < n - 1; j++) { //shift the elements accordingly
            arr[j] = arr[j + 1];
        }
        return n - 1; // return new size after deletion
    }
    
    static void deleteLastElement(int arr[], int n) {
        if (n > 0) { // check if array is not empty
            arr[n - 1] = 0; // set the last element to 0 or any default value
        }
    }
}
