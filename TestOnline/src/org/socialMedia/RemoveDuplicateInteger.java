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
/*  for(int i=0;i<ch.length;i++){
            if(ch[i]=='0') continue;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    ch[j]='0';
                }
            }
            System.out.println(ch[i]);
        } */
