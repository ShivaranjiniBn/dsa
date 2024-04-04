package com.String.programming;

public class NonRepeatingChar {
	
	public static void main(String[] args) {
		String s = "jbvaprvjrambing";
		
		System.out.println(nonRepeatedChar(s));
	}

	public static int nonRepeatedChar(String s) {
		
		for(int i=0;i<s.length();i++) {
			boolean flag=false;
			for(int j=0;j<s.length();j++) {
				if(i!=j && s.charAt(i)==s.charAt(j)) {
					flag = true;
					break;
				}
				
			}
			if(flag==false) {
				return i;
			}
		}
		
		return -1;
	}

}
