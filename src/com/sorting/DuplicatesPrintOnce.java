package com.sorting;

public class DuplicatesPrintOnce {

	public static void main(String[] args) {
		int a[] = {1,20,20,40,60};
		int b[] = {2,20,20,20,40};
		duplicates(a,b);
		}
		
		
		public static void duplicates(int a[], int b[]) {
			int al = a.length;
			int bl=b.length;
			
			
			for(int i=0;i<al;i++) {
				if(i>0 && a[i]==a[i-1]) 
					continue;
					for(int j=0;j<bl;j++) {
						if(a[i]==b[j]) {
							System.out.println(a[i]);
							break;
						}
				}
			}
		}
}
