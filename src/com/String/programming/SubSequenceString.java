package com.String.programming;

public class SubSequenceString {
	
	// All subsequences of ABC are 2^n  i.e A,B,C,AB,AC,BC,ABC
	
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2= "A";
		
		//System.out.println(isPlaindrome(str));
		System.out.println(subSequence(s1,s2));
	}

	public static boolean subSequence(String s1, String s2) {
        int s1Len = s1.length();
        int s2Len = s2.length();

        for (int i = 0; i <= s1Len - s2Len; i++) {
            int j;
            for (j = 0; j < s2Len; j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }
            if (j == s2Len) {
                return true;
            }
        }

        return false;
    }

}
