
package org.socialMedia;
import java.util.HashSet;
import java.util.Set;

public class PrintUniqueChar {
    public static void main(String[] args) {
    	String s="mimimiimimabcabcimi";
    	//char[] ch=s.toCharArray();
    	Set<Character> hs=new HashSet<Character>();
    	for(int i=0;i< s.length()-1;i++) {
    		hs.add(s.charAt(i));
    	}
    	
    	for(Character str:hs) {
    		System.out.println(str);
    	}
    }
}
