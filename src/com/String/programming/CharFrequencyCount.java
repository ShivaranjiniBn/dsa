package com.String.programming;

public class CharFrequencyCount {
	
   public static void main(String[] args) {
	String s = "javaprogramming";
	int count[] = new int[26];
	for(int i=0;i<s.length();i++) {
		// take a char and minus by a then u will get index of char nd increment the frequency
		count[s.charAt(i) - 'a']++;
	}
		for(int i=0;i<26;i++) {
			if(count[i]>0) {
				System.out.println((char)(i+'a')+" ---> "+ count[i]);
			}
		}
}
}
