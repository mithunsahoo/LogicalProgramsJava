package org.socialMedia;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int[] n= {1,2,4,5,55};
       int temp=0;
        for(int i=0;i<n.length;i++) {
        	for(int j=i+1;j<n.length;j++) {
        		if(n[i]> n[j]) {
        			temp=n[i];
        			n[i]=n[j];
        			n[j]=temp;
        		}
        	}
        }
        System.out.println("the second largest no is:"+ n[n.length-2]);
	}

}
