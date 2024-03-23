package org.socialMedia;

public class CheckPrime {
	public static void main(String[] args) {
		boolean isPrime=true;
		int n=12;
		for(int i=2;i<n/2;i++) {
			
			if(n%i==0) {
				isPrime=false;
			}
		}
			if(isPrime) {
				System.out.println("is a prime no");
			}
			else {
				System.out.println("not prime");
			}
		}
	

}
