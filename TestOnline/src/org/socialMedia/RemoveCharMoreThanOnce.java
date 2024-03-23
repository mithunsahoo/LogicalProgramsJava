package org.socialMedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RemoveCharMoreThanOnce{
public static void main(String[] args) {
	String s = "abcdeff ffa";
    Map<Character, Integer> hm = new TreeMap<>();
    List<Character> uniqueChars = new ArrayList<>();

    for (char ch : s.toCharArray()) {
    	if(ch!=' ') {
        int count = hm.getOrDefault(ch, 0) + 1;
        hm.put(ch, count);
    }
    }
    
    for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
        if (entry.getValue() == 1) {
            uniqueChars.add(entry.getKey());
        }
    }

    System.out.println(uniqueChars);
}
}
