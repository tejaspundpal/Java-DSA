package Java_DSA.Problems.Strings;

import java.util.* ;
import java.io.*;
import java.util.Scanner;

class RemoveCharacter{

    static String removeAllOccurrencesOfChar(String input, char c) {
        // Write your code here
        ArrayList<Character>list = new ArrayList<>();
        int i = 0;
        while(i < input.length()){
            if(input.charAt(i)==c)
                i++;
            else {
                list.add(input.charAt(i));
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Character ch : list){
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char c = sc.next().charAt(0);
        String ans = removeAllOccurrencesOfChar(input, c);
        System.out.println(ans);
    }
}