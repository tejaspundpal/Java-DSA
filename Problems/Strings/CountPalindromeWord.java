package Java_DSA.Problems.Strings;

import java.util.* ;
import java.io.*;
public class CountPalindromeWord
{
    public static int checkPal(String str){
        int left = 0, right = str.length()-1;
        while(left<right)
        {
            char l = str.charAt(left), r = str.charAt(right);
            if(!Character.isLetterOrDigit(l))
                left++;
            else if(!Character.isLetterOrDigit(r))
                right--;
            else if(Character.toLowerCase(l)!=Character.toLowerCase(r))
                return 0;
            else {
                left++;
                right--;
            }
        }
        return 1;
    }
    public static int countNumberOfPalindromeWords(String s)
    {
        // Write your code here!
        String[] arr = s.split(" ");
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            sum += checkPal(arr[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = sc.nextLine();
        System.out.println(countNumberOfPalindromeWords(s));
    }
}