package org.socialMedia;

import java.util.Arrays;

public class SwapAdjacent {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 8, 5, 1, 6, 4};
        
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
