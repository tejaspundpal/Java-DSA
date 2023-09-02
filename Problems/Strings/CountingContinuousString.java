package Java_DSA.Problems.Strings;

import java.util.Scanner;

public class CountingContinuousString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println("Enter substring : ");
        String substr = sc.next();
        int len = str.length();
        int len1 = substr.length();
        int l = 0;
        int count = 0;
        int i =0;
       while(l < len){
           if (substr.charAt(i) == str.charAt(l)) {
               i++;
               l++;
           } else {
               l++;
               i = 0;
           }
           if (i == len1) {
               count++;
               i = 0;
           }

       }
        System.out.println("Your ans is :" +count);
    }
}

