package org.socialMedia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JustTest {
	
	public static void main(String[] args) {

	Map<Integer,Character> hm= new HashMap<>();
	
	hm.put(1,'a');
	hm.put(2,'b');
	hm.put(3,'c');
	hm.put(4,'d');
	hm.put(5,'a');
	//Arrays.sort(hm);
	//List<> li= new ArrayList<>();
	//li.add(hm);
	//Collections.sort(li);
	for(Map.Entry<Integer,Character> entry: hm.entrySet()) {
		
	 
		System.out.println(entry.getKey()+"-"+entry.getValue());
	}
  }
}
