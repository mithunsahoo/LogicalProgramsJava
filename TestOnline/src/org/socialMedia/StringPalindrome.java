package org.socialMedia;

public class StringPalindrome {

	public static void main(String[] args) {
		        String s = "abccba";
		        
		        StringBuilder rev = new StringBuilder(s).reverse();
		        
		        if (s.equals(rev.toString())) {
		            System.out.print("true");
		        } else {
		            System.out.print("false");
		        }

	}
	
}
//using logic
/*class HelloWorld {
	public static void main(String[] args) {
		        String s = "abccba";
		        String rev="";
		        for(int i=s.length()-1;i>0;i--){
		            rev=rev+s.charAt(i);
		        }
		        if (s.equals(rev)) {
		            System.out.print("true");
		        } else {
		            System.out.print("false");
		        }

	}
	
} */
