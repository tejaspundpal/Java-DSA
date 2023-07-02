package Java_DSA.Problems.Arrays;

import java.util.* ;
import java.io.*;

public class MaximumSubarraySum {

    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here
        long sum=0;
        long maxi=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            sum = arr[i]+sum;
            if (sum>maxi){
                maxi=sum;
            }
            if (sum<0){
                sum=0;
            }
        }
        if (maxi<0){
            maxi=0;
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,7,-4,3,2,-10,9,1};
        long ans = maxSubarraySum(arr, arr.length);
        System.out.println(ans);
    }

}
