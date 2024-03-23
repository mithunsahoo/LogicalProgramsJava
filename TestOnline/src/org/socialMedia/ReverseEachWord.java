package org.socialMedia;

import java.util.Scanner;

public class ReverseEachWord {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();
	        String[] words = input.split(" ");
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            StringBuilder reversedWord = new StringBuilder(word).reverse();
	            for (int i = 0; i < reversedWord.length(); i++) {
	                if (i % 2 != 0) {
	                    result.append(reversedWord.charAt(i));
	                }
	            }
	            result.append(" ");
	        }

	        System.out.println(result.toString().trim());
	    }
	}


