package com.sorting;

import java.util.Arrays;

public class MergeArrays {
	// 2 sorted arrays merge them
	public static void main(String[] args) {
		int a[] = {5,6,7,8,9};
		int b[] = {1,2,3,4};
		merge(a,b);
		}
		
		//time complexity teta(m+n)
		public static void merge(int a[], int b[]) {
			int al = a.length;
			int bl=b.length;
			int cl = al +bl;
			int[] c=new int[cl];
			for(int i=0;i<al;i++) {
				c[i]= a[i];
			}
			for(int i=0;i<bl;i++) {
				c[al+i] = b[i];
			}
			
			Arrays.sort(c);
			for(int i:c) {
				System.out.print(i + " ");
			}
			
	}

}
