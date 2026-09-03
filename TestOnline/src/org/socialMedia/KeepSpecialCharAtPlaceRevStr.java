// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class KeepSpecialCharAtPlaceRevStr {
    public static void main(String[] args) {
        String str="hello@ workd#";
        char ch[]= str.toCharArray();

        int start= 0;
        int end=ch.length-1;

        while(start<end){
            if(!Character.isLetterOrDigit(ch[start])){
                start++;
            }
            else if(!Character.isLetterOrDigit(ch[end])){
                end--;
            }
            else{
                char tmp= ch[start];
                ch[start]= ch[end];
                ch[end]= tmp;

                start++;
                end--;
            }
        }
       System.out.print(new String(ch));
    }
}
