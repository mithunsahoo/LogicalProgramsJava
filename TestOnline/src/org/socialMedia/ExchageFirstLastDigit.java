// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class ExchageFirstLastDigit {
    public static void main(String[] args) {
        
        int n=1029;
        int last=n%10;
        int tmp= n/10;
        int middle= tmp% 100;//reduce this zeros in 100 as per n.length-1

        int first=n;
        while(first>=10){
            first= first/10;
        }

        int result = last*1000/*put same length zeros here as of n*/ +middle*10+first;
System.out.print(result);
    }
}
