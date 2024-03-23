package org.socialMedia;
class Palindrome {
    public static void main(String[] args) {
       int n=100,sum=0,rem;
      int temp=n;
      while(n>0){
          rem=n%10;
          sum=(sum*10)+rem;
          n=n/10;
      }
      if(temp==sum){
          System.out.print("is palindrome");
      }
      else{
          System.out.print(" not palindrome");
      }
       
    }
}

/* String Palindrome 
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Read input string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        // Check if the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    private static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        String cleanStr = str.replaceAll("\\s", "").toLowerCase();

        int length = cleanStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanStr.charAt(i) != cleanStr.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
*/