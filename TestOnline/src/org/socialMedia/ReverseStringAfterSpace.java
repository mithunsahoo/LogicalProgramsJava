package org.socialMedia;

public class ReverseStringAfterSpace {

	    public static void main(String[] args) {

	        String s = "hello world";

	        // Split the string into words
	        String[] words = s.split(" ");
	        String reversedString = "";

	        // Reverse each word except the first one
	        for (int i = 0; i < words.length; i++) {
	            if (i == 0) {
	                // If it's the first word, append it as is
	                reversedString += words[i];
	            } else {
	                // For other words, reverse the characters
	                for (int j = words[i].length() - 1; j >= 0; j--) {
	                    reversedString += words[i].charAt(j);
	                }
	            }

	            // Add a space after each word
	            reversedString += " ";
	        }

	        // Remove the trailing space and print the reversed string
	        reversedString = reversedString.trim();
	        System.out.println(reversedString);
	    }
	}
