// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class LastNonRepeatingChar {
    public static void main(String[] args) {

        String str="mithunsah";
        Map<Character,Integer> hm= new HashMap<>();

        for(char ch:str.toCharArray()){
            int count= hm.getOrDefault(ch,0)+1;
            hm.put(ch,count);
        }

       for(int i=str.length()-1;i>=0;i--){
           char ch= str.charAt(i);
           if(hm.get(ch)==1){
               System.out.print(ch);
               break;
           }
       }
    }
}
