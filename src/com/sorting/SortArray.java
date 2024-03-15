package com.sorting;

import java.util.Arrays;
import java.util.Comparator;

class MyComp implements Comparator<Integer>{

	@Override
	public int compare(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return a%2 - b%2;
	}
	
}

public class SortArray {
	
	public static void main(String[] args) {
		int arr[]= {1,8,6,9,7,3};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Integer a[] = {5,20,10,3,12};
		Arrays.sort(a, new MyComp());
		System.out.println(Arrays.toString(a));
	}
	
	

}
