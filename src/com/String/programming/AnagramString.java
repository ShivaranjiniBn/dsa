package com.String.programming;

import java.util.Arrays;

public class AnagramString {
	
	//containing same charcters in both strings
	
	public static void main(String[] args) {
		String s1 = "accbcs";
		String s2= "sccca";
		
		//System.out.println(isPlaindrome(str));
		System.out.println(anagram(s1,s2));
	}

	public static boolean anagram(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return  false;
		}
		char[] s3= s1.toCharArray();
		Arrays.sort(s3);
		s1 = new String(s3);
		
		char[] s4 = s2.toCharArray();
		Arrays.sort(s4);
		s2= new String(s4);
		
		if(s1.equals(s2))
		return true;
		
		return false;
	}


}
