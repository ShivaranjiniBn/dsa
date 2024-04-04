package com.String.programming;

public class PatternSearching {

    public static void main(String[] args) {
        String text = "Hello, this is a sample string to search for a pattern.";
        String pattern = "sample";

        int index = findPattern(text, pattern);

        if (index != -1) {
            System.out.println("Pattern found at index " + index);
        } else {
            System.out.println("Pattern not found in the given string.");
        }
    }

    public static int findPattern(String text, String pattern) {
        return text.indexOf(pattern);
    }
}
