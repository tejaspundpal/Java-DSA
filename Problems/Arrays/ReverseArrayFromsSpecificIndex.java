package Java_DSA.Problems.Arrays;

import java.util.* ;
import java.io.*;
import java.util.ArrayList;

class ReverseArrayFromSpecificIndex
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int start = m+1;
        int end = arr.size()-1;
        while(start < end){
            int temp;
            temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end,temp);
            start++;
            end--;
        }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5,6));
        reverseArray(arr,2);
    }
}
