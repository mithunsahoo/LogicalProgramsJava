package org.socialMedia;
public class FirstPrime
{
   public static void main(String[] args)
   {
      int i, j, temp, count=0;
      
      System.out.println("First 10 Prime Numbers are:");
      for(i=2; count<10; i++)
      {
         temp = 0;
         for(j=2; j<=i; j++)
         {
            if(i%j==0)
            {
               temp++;
              
            }
         }
         if(temp==1)
         {
            System.out.print(i+ " ");
            count++;
         }
      }
   }
}