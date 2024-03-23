package org.socialMedia;

import java.util.Scanner;

public class HackerEarth {
	final int num=10;
	public void display() {
		int num=15;
		Runnable r=new Runnable() {
			final int num=25;
			public void run() {
				int num=25;
				System.out.println(this.num);// TODO Auto-generated method stub
				
			}
		};
		r.run();
	}

	public static void main(String[] args) {
		HackerEarth sv=new HackerEarth();
		sv.display();
	}
	}