package Java_DSA.Problems.Strings;

import java.util.Scanner;

public class CheckPalindrome
{
    public static void main(String[] args) {
        System.out.println("Enter string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.equals(new StringBuilder(str).reverse().toString()) ? "YES" : "NO");
    }
}
