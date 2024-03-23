package org.socialMedia;

class RemoveDuplicates {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 9, 6,6,7, 7 };
        int[] temp = new int[a.length];
        int j = 0;
        
        for (int i = 0; i < a.length; i++) {
            boolean isDuplicate = false;

            // Check if the current element is a duplicate
            for (int k = 0; k < j; k++) {
                if (a[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If it's not a duplicate, add it to temp
            if (!isDuplicate) {
                temp[j] = a[i];
                j++;
            }
        }

        // Print the unique values in temp
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
