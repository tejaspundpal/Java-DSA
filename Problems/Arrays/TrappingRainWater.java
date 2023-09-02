package Java_DSA.Problems.Arrays;
import java.util.*;

public class TrappingRainWater {
    public static long getTrappedWater(long []arr, int n) {
        // Write your code here.
        long[] left = new long[n];
        long[] right = new long[n];
        left[0] = arr[0];
        right[n-1] = arr[n-1];
        for(int i = 1;i < n;i++){
            left[i] = Math.max(left[i-1], arr[i]);
        }
        for(int i = n-2;i >= 0;i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }
        long sum = 0;
        for(int i = 0;i < n;i++){
            sum+=Math.min(left[i],right[i])-arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        long[] arr = {8,1,8,2,4};
        System.out.println(getTrappedWater(arr,arr.length));
    }
}