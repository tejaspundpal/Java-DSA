package Java_DSA.Problems.Strings;

import java.util.*;
import java.io.*;

public class Make1stLetterCapital {
    public static String convertString(String str) {
        // Write your code here
        // String s = "";
        // s += Character.toUpperCase(str.charAt(0));
        // for(int i = 1;i < str.length();i++){
        // if(str.charAt(i) == ' '){
        // s += " ";
        // s += Character.toUpperCase(str.charAt(i+1));
        // i++;
        // }
        // else{
        // s += str.charAt(i);
        // }
        // }
        // return s;

        // String[] strarr = str.split(" ");
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < strarr.length; i++) {
        //     strarr[i] = strarr[i].substring(0, 1).toUpperCase() + strarr[i].substring(1);
        //     if (i != strarr.length - 1) {
        //         sb.append(strarr[i] + " ");
        //     } else {
        //         sb.append(strarr[i]);
        //     }
        // }
        // return sb.toString();

        char[] ch = str.toCharArray();
        if (ch[0] > 90) {
            ch[0] = (char) (ch[0] - 32);
        }
        for (int i = 1; i < ch.length-1; i++) {
            if (ch[i] == ' ' && ch[i+1] > 90) {
                ch[i+1] = (char) (ch[i+1] - 32);
            }
        }
        str = new String(ch);
        return str;
    }

    public static void main(String[] args) {
        System.out.println(convertString("i love programming"));
    }

}