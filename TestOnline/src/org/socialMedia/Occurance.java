package org.socialMedia;

public class Occurance {
 public static void main(String[] args) {
	 String s="mithunmmithunn";
	 int count=0;
	 char[] ch=s.toCharArray();
	 for(int i=0;i<ch.length;i++) {
		 count=1;
		 for(int j=i+1;j<ch.length;j++) {
			 if(ch[i] == ch[j]) {
				 ch[j]='0';
				 count++;
			 }
		 }
		 if(ch[i]!=' '&& ch[i]!='0') {
			 System.out.println(ch[i]+"-"+count);
		 }
	 }
 }
}
//using hashMap

/* import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        String str = "hello";
        char[] ch = str.toCharArray();
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0') { 
                int count = 1;
                for (int j = i + 1; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        ch[j] = '0';
                        count++;
                    }
                }
                hm.put(ch[i], count);
            }
        }
        System.out.print(hm);
    }
}
*/
