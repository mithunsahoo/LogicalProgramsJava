package org.socialMedia;

import java.util.Map;
import java.util.TreeMap;

public class OccuranceInAlphabeticalOrder {
	public static void main(String[] args) {
   String s="stringstr";
   Map<Character, Integer> hm = new TreeMap<>();

   for(char ch: s.toCharArray()) {
	   hm.put(ch,hm.getOrDefault(ch,0)+1);
	   
   }
   for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
//	   if(entry.getValue()<1) {
//		   hm.remove(entry.getKey());
		   System.out.println(entry.getKey() + ": " + entry.getValue());
	 }
}
}
