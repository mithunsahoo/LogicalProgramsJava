package org.socialMedia;

import java.util.Scanner;

public class ReverseWords
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter any sentence:"); 
		String s=sc.nextLine();
		String[] rev=s.split(" ");
		for(int i=rev.length-1;i>=0;i--) {
			System.out.print(rev[i]);
			if(i>0) {
				System.out.print(" ");
			}
		}
		
	}
	
}
