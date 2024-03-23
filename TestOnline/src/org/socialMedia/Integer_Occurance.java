package org.socialMedia;
import java.util.*;

public class Integer_Occurance {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = 1233344444;
	System.out.print("Enter the specific integer to count its occurrence: ");
	        int target = scanner.nextInt();
	        String numStr = String.valueOf(n);
	        int count = 0;
	        for (int i = 0; i < numStr.length(); i++) {
	            // Convert character to integer
	            int digit = numStr.charAt(i) - '0';
	            if (digit == target) {
	                count++;
	            }
	        }
	System.out.println("Occurrences of " + target + " in " + n + ": " + count);
	    }
	}

