package com.array.programming;

public class SubArrayWithGivenSum {
    
    public static void main(String[] args) {
        int arr[] = {1, 4, 20, 3, 10, 5};
        int sum = 5; // The sum we are looking for
        System.out.println(subArrayWithGivenSum(arr, sum));
    }

    public static boolean subArrayWithGivenSum(int arr[], int sum) {
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0; // Reset current sum for each starting point
            for (int j = i; j < arr.length; j++) {
                currSum += arr[j];
                if (currSum == sum) {
                    return true; // Found the subarray with the given sum
                }
            }
        }
        return false; // No subarray found with the given sum
    }
}
