package org.socialMedia;

public class Pattern1 {

	    public static void main(String[] args) {
	    	int i,j,n,k;
	 		//Scanner sc = new Scanner(System.in);
	    		System.out.println("Enter the no of lines");
	 		n=5;
	    		for(i=1;i<=n;i++)
	    		{
				k=i;
	        		for(j=1;j<=i;j++,k++)
	        		{
	            			System.out.print(k);
	        		}
	 
	        		System.out.println("");
	    		}
	    }
}