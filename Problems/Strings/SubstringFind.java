//input :
//str = mango apple cat app kartik apps
//substr = ap
//
//output :
//apple app apps

package Java_DSA.Problems.Strings;
import java.util.*;

public class SubstringFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println("Enter Substring : ");
        String subStr = sc.next();
        int len = 0;
        int i = 0;
        while(len < str.length()){
            if(str.charAt(len)==subStr.charAt(i)){
                i++;
                len++;
            }
            else{
                len++;
                i = 0;
            }
            if (i == subStr.length()){
                i = 0;
                System.out.print(subStr);
                while(str.charAt(len) != ' '){
                    System.out.print(str.charAt(len));
                    if(len < str.length()-1)
                    len++;
                    else
                        break;
                }
                System.out.println();
            }
        }
    }
}

//package Java_DSA.Problems.Strings;
//import java.util.*;
//
//public class SubstringFind {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter String : ");
//        String str = sc.nextLine();
//        System.out.println("Enter Substring : ");
//        String subStr = sc.next();
//
//        String[] words = str.split("\\s+"); // Split the input string into words
//
//        for (String word : words) {
//            if (word.startsWith(subStr)) {
//                System.out.println(word);
//            }
//        }
//    }
//}

//package Java_DSA.Problems.Strings;
//import java.util.*;
//
//public class SubstringFind {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter String : ");
//        String str = sc.nextLine();
//        System.out.println("Enter Substring : ");
//        String subStr = sc.next();
//
//        findWordsWithSubstring(str, subStr);
//    }
//
//    public static void findWordsWithSubstring(String str, String subStr) {
//        int len = str.length();
//        int subLen = subStr.length();
//        int wordStart = 0;
//
//        for (int i = 0; i < len; i++) {
//            char ch = str.charAt(i);
//
//            if (ch == ' ') {
//                if (i - wordStart >= subLen) {
//                    String word = str.substring(wordStart, i);
//                    if (word.substring(0, subLen).equals(subStr)) {
//                        System.out.println(word);
//                    }
//                }
//                wordStart = i + 1;
//            }
//        }
//
//        // Check the last word if it matches the substring
//        if (len - wordStart >= subLen) {
//            String lastWord = str.substring(wordStart);
//            if (lastWord.substring(0, subLen).equals(subStr)) {
//                System.out.println(lastWord);
//            }
//        }
//    }
//}

//
