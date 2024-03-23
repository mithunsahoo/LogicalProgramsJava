package org.socialMedia;

public class CapitilizeFirstLetterOfEachWord {
	

	    public static void main(String[] args) {
	        String s = "hope i am good";
	        String[] words = s.split(" ");
	        StringBuilder finalResult = new StringBuilder();
	        for (int i = 0; i < words.length; i++) {
	            if (!words[i].isEmpty()) {
	                finalResult.append(Character.toUpperCase(words[i].charAt(0)))
	                           .append(words[i].substring(1))
	                           .append(" ");
	            }
	        }
	        System.out.println(finalResult.toString().trim());
	    }

	}

