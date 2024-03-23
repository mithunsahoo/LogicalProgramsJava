package org.socialMedia;
import java.util.*;

public class PrintUniqueHashSet {
    public static void main(String[] args) {
        String s="mkmkmmithun";
        char[] ch=s.toCharArray();
        Set<Character> hs= new HashSet<Character>();
        for(int i=0;i<ch.length;i++){
               hs.add(ch[i]);
                
               }
              for(char s1:hs){
              System.out.print(s1);
             }
        }
}
       