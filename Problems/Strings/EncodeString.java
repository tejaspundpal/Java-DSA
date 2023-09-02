package Java_DSA.Problems.Strings;

import java.util.* ;
import java.io.*;

class EncodeString {
    public static char calChar(char c){
        if(c == 'z')
            return 'y';
        else if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            return ++c;
        else
            return --c;
    }
    public static String encodeString(int n, String s) {
        // Write your code here.
        char[] ans = new char[s.length()];
        for(int i = 0;i < n;i++){
            ans[i] = calChar(s.charAt(i));
        }
       // return ans.toString();
        return String.copyValueOf(ans);

    }

    public static void main(String[] args) {
        String s = "Tejas";
        System.out.println(encodeString(5,s));
    }
}