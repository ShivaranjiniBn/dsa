package com.String.programming;

public class LeftMostRepeatingChar {
	
	public static void main(String[] args) {
		String s = "jbvaprogramming";
		
		System.out.println(repeatedChar(s));
	}

	public static int repeatedChar(String s) {
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i) == s.charAt(j)) {
					return i;
				}
			}
		}
		return -1;
	}
	
	

}
