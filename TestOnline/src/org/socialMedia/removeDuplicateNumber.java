package org.socialMedia;

class removeduplicateNumber {
 public static void main(String[] args) {
 
     int[] input = {1, 1, 1, 3, 4, 5, 6};

     int n = input.length;
     int newSize = n;

     for (int i = 0; i < newSize; i++) {
         for (int j = i + 1; j < newSize; j++) {
             if (input[i] == input[j]) {
                 for (int k = j; k < newSize - 1; k++) {
                     input[k] = input[k + 1];
                 }
                 newSize--;
                 j--;
             }
         }
     }
     System.out.print("Output: ");
     for (int i = 0; i < newSize; i++) {
         System.out.print(input[i] + " ");
     }
 }
}
