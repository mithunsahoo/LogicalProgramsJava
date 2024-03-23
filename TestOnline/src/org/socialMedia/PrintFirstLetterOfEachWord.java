package org.socialMedia;

public class PrintFirstLetterOfEachWord {

	public static void main(String[] args) {
		String s="Hope I am good";
		String[] words= s.split(" ");
		String finalResult="";
		for(int i=0;i<words.length;i++) {
			finalResult = finalResult+words[i].charAt(0);
		}
		System.out.println(finalResult.toUpperCase());
		
	}
	
}
