package org.socialMedia;

public class FindSubstrings {
	    public static void main(String[] args) {
	        String s = "abcabcabc";
	        int length = s.length();

	        System.out.println("All substrings of \"" + s + "\":");

	        for (int start = 0; start < length; start++) {
	            for (int end = start + 1; end <= length; end++) {
	                StringBuilder substring = new StringBuilder();
	                for (int i = start; i < end; i++) {
	                    substring.append(s.charAt(i));
	                }
	                System.out.println(substring.toString());
	            }
	        }
	    }
	}

