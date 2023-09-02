package Java_DSA.Problems.Strings;
import java.util.*;

public class Dic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = sc.nextInt();
        String str[] = new String[n];

        String ans = "";

        System.out.println("ENter your single words  for autocomplete : ");
        String word = sc.next();

        System.out.println("Enter your words list  : ");
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
            ans = ans + str[i];
            ans = ans + "*";
        }

        int count = 0;
        int len = 0;
        int wordLength = word.length();
        int i = 0;

        while (len < ans.length() - 1) {
            if (word.charAt(i) == ans.charAt(len)) {
                i++;
                len++;
            } else {
                len++;
                i = 0;
            }
            char c = ans.charAt(len);
            if (i == wordLength && c == '*') {
                System.out.println("The suggested word is: " + word);
                i = 0;
                len++;
            } else if (i == wordLength) {
                System.out.println("");
                System.out.print("The suggested word is: " + word);
                int p = len + 1;
                while (c != '*') {
                    System.out.print(c);
                    c = ans.charAt(p);
                    p++;
                }
                i = 0;
                len = p + 1;
            }
        }

    }
}