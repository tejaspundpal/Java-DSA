package Java_DSA.Problems.Strings;

import java.util.Scanner;

public class MinSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter window size : ");
        int k = sc.nextInt();
        int[] arr = {10, 4, 2, 5, 6, 3, 8, 1};
        int result = minSubArray(arr, arr.length, k);
        System.out.println(result);
    }

    private static int minSubArray(int[] arr, int n, int k) {
        int mini = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int i = 0, j = k;
        while (j < n) {
            mini = Math.min(mini, sum);
            sum = sum - arr[i];
            i++;
            sum = sum + arr[j];
            j++;
        }
        return Math.min(mini, sum);
    }
}
