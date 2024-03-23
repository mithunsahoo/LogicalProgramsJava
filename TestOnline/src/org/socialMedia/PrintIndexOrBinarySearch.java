package org.socialMedia;

public class PrintIndexOrBinarySearch {
	
	    public static void main(String[] args) {
	        int[] array = {10, 20, 30, 40, 50};
	        int target = 30;

	        int index=0;
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == target) {
	                index = i;
	                break;
	            }
	        }
	        
	       // if (index != -1) {
	            System.out.println("The index of " + target + " in the array is: " + index);
	       
	    }
	}
