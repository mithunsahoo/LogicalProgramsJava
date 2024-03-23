package org.socialMedia;

public class AdjacentCharacter {
	
	    public static void main(String[] args) {
	        String input = "abcdefgh";
	        StringBuilder output = new StringBuilder();

	        for (int i = 1; i < input.length(); i += 2) {
	            char currentChar = input.charAt(i);
	            char uppercaseChar = Character.toUpperCase(currentChar);
	            output.append(uppercaseChar);
	        }

	        System.out.println(output.toString());
	    }
	}



	/*
	 * public class PrintAlternateCharacters {
	 *  public static void main(String[] args) { 
	 * String input = "abcdefgh"; 
	 * StringBuilder output = new StringBuilder();
	 * 
	 * for (int i = 1; i < input.length(); i += 2) {
	 * char currentChar = input.charAt(i); 
	 * if (currentChar >= 'a' && currentChar <= 'z') {
	 *  char uppercaseChar = (char)(currentChar - 'a' + 'A');
	 * output.append(uppercaseChar); } }
	 * 
	 * System.out.println(output.toString()); } }
	 */
//Online Java Compiler
//Use this editor to write, compile and run your Java code online



