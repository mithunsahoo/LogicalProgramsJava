package org.socialMedia;

public class PrimeNumber {
    public static void main(String[] args) {
    	int i,j,count;
    	// Printing the result...
        System.out.println("Prime numbers between 1 to 20 are ");
    	for(i=2;i<=20;i++)
    	{
    	count=0;
    	for(j=1;j<=i;j++)
    	{
    	   if(i%j==0)
    	   {
    	        count++;        
    	   }
    	}
    	if(count==2)
    	       System.out.print(i+"  ");     
    	}
    	
    }
}
