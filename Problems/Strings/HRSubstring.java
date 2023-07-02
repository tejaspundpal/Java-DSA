package Java_DSA.Problems.Strings;

import java.util.Scanner;

public class HRSubstring {

    public static String getSmallestAndLargest(String s, int k) {
        //String smallest = "";
        //String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        //char small_char = s.charAt(0);
        //char large_char = s.charAt(0);
        int length = s.length();
        int ans = length - k;
        String[] arr = new String[ans+1];

        for(int i = 0;i <= ans;i++)
        {
            arr[i] = s.substring(i,i+k);
        }
        String smallest = arr[0];
        String largest = arr[0];
        for(int i = 0;i <= ans;i++)
        {
            if(smallest.charAt(0) > arr[i].charAt(0))
            {
                smallest = arr[i];
            }
            if(largest.charAt(0) < arr[i].charAt(0))
            {
                largest = arr[i];
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}