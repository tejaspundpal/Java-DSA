package Java_DSA.Problems.Arrays;

import java.util.* ;
import java.io.*;

public class MinimizeTheDifference {

    public static int minimizeIt(int[] arr, int k) {
        // Write your code here.
        // int n=arr.length;
        // Arrays.sort(arr);
        // int ans = arr[n-1] - arr[0];
        // int smallest = arr[0] + k, largest = arr[n-1]-k;
        // for(int i = 0; i < n-1; i++){
        //     int min = Math.min(smallest, arr[i+1]-k);
        //     int max = Math.max(largest, arr[i]+k);
        //     if (min < 0)
        //         continue;
        //     ans = Math.min(ans, max-min);
        // }
        // return ans;

        int n=arr.length;
        Arrays.sort(arr);
        int ans = arr[n-1] - arr[0];
        for(int i = 1; i < n-1; i++){
            if(arr[i]-k < 0)
                continue;
            int max = Math.max(arr[i-1]+k,arr[n-1]-k);
            int min = Math.min(arr[0]+k,arr[i]-k);
            ans = Math.min(ans, max-min);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int result = minimizeIt(arr,2);
        System.out.println(result);
    }
}