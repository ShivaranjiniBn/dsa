package com.String.programming;

public class PlaindromeString {
	
	public static void main(String[] args) {
		String str = "ghdfbhbg";
		
		//System.out.println(isPlaindrome(str));
		System.out.println(palindrome(str));
	}

	public static boolean isPlaindrome(String str) {
		StringBuilder sb = new StringBuilder(str).reverse();
		
		return str.equals(sb.toString());
	}
	
	//efficient method
	
	static boolean palindrome(String str) {
		int begin = 0;
		int end = str.length()-1;
		while(begin<end) {
			if(str.charAt(begin)!=str.charAt(end)) {
				return false;
			}
			begin++;
			end--;
		}
		return true;
	}
}
