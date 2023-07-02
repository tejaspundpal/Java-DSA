package Java_DSA.Problems.Strings;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(reverseString(str));
    }
    public static String reverseString(String str) {
        // Write your code here.
//        ArrayList<Character> str1 = new ArrayList<>();
//        for(int i = str.length()-1;i >= 0;i--){
//            str1.add(str.charAt(i));
//        }
//        String ans = str1.stream()
//                .map(String::valueOf)
//                .collect(Collectors.joining());
//
//        return ans;
        int i=0;
        int j=str.length()-1;
        char[] s=str.toCharArray();
        while(i<=j)
        {
            char t=s[i];
            s[i]=s[j];
            s[j]=t;
            i++;
            j--;
        }

        String ans=new String(s);
        return ans;
    }

}
