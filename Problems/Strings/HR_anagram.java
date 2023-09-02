package Java_DSA.Problems.Strings;

import java.util.*;

public class HR_anagram {

//    static boolean isAnagramSet(String a,String b){
//
//    }
    static boolean isAnagram(String a, String b) {
        // Complete the function
        String str1 = a;
        String str2 = b;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check if length is same
        if(str1.length() == str2.length()) {

            // convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
            return Arrays.equals(charArray1, charArray2);

        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}