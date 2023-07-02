package Java_DSA.Problems.Strings;

import java.io.*;
import java.util.*;

public class StringReverseCheck {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuffer A1 = new StringBuffer(A);
        StringBuffer ans = new StringBuffer();
        /* Enter your code here. Print output to STDOUT. */
        for(int i = A.length()-1; i >= 0;i--)
        {
            ans.append(A.charAt(i));
        }
//        System.out.println(A);
//        System.out.println(A1);
//        System.out.println(ans);
        if(A1.compareTo(ans) == 0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
//another sol--->
//System.out.println( A.equals( new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );

//another 1-->
//       Scanner sc=new Scanner(System.in);
//    String A=sc.next();
//    boolean valid = true;
//
//        for(int i = 0; i < (A.length() / 2); i++) {
//        if(A.charAt(i) != A.charAt((A.length() - 1) - i)) {
//        valid = false;
//        break;
//        } // end if
//        } // end for(i)
//
//        if(valid) System.out.println("Yes");
//        else System.out.println("No");

