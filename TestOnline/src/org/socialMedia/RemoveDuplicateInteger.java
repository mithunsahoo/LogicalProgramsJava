package org.socialMedia;

import java.util.*;

public class RemoveDuplicateInteger {
    public static void main(String[] args) {
        int n[] = {10, 20, 10, 30, 40, 20, 50};

        // Convert array to Set to remove duplicates
        Set<Integer> set = new LinkedHashSet<>();
        for (int i : n) {
            set.add(i);
        }
        
        System.out.println(set.toString());
    }
}
