package org.socialMedia;

public class ReverseWordsString {

	public static void main(String[] args) {
		String s="i am a king";
		String[] words=s.split(" ");
		String rev="";
		for(int i=words.length-1;i>=0;i--) {
			rev=rev+ " "+words[i];
			
		}
		System.out.println(rev);
	}
	
}
/* class HelloWorld {
public static void main(String[] args) {
String str = "mithun sahoo";
String words[] = str.split("");
String res = "";
for (String word : words) {
    for (int i = word.length() - 1; i >= 0; i--) {
        res += word.charAt(i);
        if (res.length() % 2 == 0) {
            System.out.print(word.charAt(i));
        }
    }
}
}
}
*/