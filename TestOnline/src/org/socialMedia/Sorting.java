package org.socialMedia;

public class Sorting {

	public static void main(String[] args) {
		
	
	//int array3[]={7,3,1,2,9,0,6,4,5};
	int[] array3= {7,3,1,2,9,0,6,4,5};
	for(int i=0;i<array3.length;i++) {
		for(int j=i+1;j<array3.length;j++) 
				if(array3[i]>array3[j]) {
			int temp=array3[i];
			array3[i]=array3[j];
			array3[j]=temp;
		}
	
	System.out.print(array3[i]+" , ");
}
}
}



