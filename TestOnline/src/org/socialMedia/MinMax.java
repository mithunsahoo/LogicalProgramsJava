package org.socialMedia;

public class MinMax {

	
		    static int input[] = { 100, 11, 44, 1, 33, 300 };

		    public static void main(String[] args) {
		        findMax();
		        findMin();
		    }

		    public static void findMax() {
		        int max = input[0];
		        for (int i = 1; i < input.length; i++) {
		            if (input[i] > max) {
		                max = input[i];
		            }
		        }
		        System.out.println("Maximum value: " + max);
		    }

		    public static void findMin() {
		        int min = input[0];
		        for (int i = 1; i < input.length; i++) {
		            if (input[i] < min) {
		                min = input[i];
		            }
		        }
		        System.out.println("Minimum value: " + min);
		    }
		

	}

