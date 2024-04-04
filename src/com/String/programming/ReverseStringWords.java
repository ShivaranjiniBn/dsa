package com.String.programming;

public class ReverseStringWords {

	    public static void main(String[] args) {
	        String s = "Hello World Java Program";
	        String reversedString = reverseWords(s);
	        System.out.println("Original String: " + s);
	        System.out.println("Reversed String with Reversed Words: " + reversedString);
	    }

	    public static String reverseWords(String s) {
	        // Split the input string into words
	        String[] words = s.split(" ");

	        // Initialize a StringBuilder to store the reversed string
	        StringBuilder reversed = new StringBuilder();

	        // Iterate through the words array in reverse order
	        for (int i = words.length - 1; i >= 0; i--) {
	            // Reverse each word and append it to the StringBuilder
	            StringBuilder reversedWord = new StringBuilder(words[i]);
	            reversed.append(reversedWord.reverse());
	            // Append a space after each word except for the last word
	            if (i != 0) {
	                reversed.append(" ");
	            }
	        }

	        // Convert the StringBuilder to a string and return it
	        return reversed.toString();
	    }
	


}
