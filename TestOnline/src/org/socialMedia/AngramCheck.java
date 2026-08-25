import java.util.*;

class AngramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}

/* 
Manual Sorting

    class Main {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    char temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

                if (b[i] > b[j]) {
                    char temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }

        if (new String(a).equals(new String(b)))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}  */
