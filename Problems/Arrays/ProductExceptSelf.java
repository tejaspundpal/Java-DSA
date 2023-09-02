package Java_DSA.Problems.Arrays;

import java.util.Arrays;

public class ProductExceptSelf {

    public static int[] getProductArrayExceptSelf(int[] nums) {
        //Your code goes here
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n];
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];

        int mod = 1000000007; // modulus
        leftProduct[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProduct[i] = (int)(((long)leftProduct[i - 1] * nums[i - 1]) % mod);
        }
        rightProduct[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProduct[i] = (int)(((long)rightProduct[i + 1] * nums[i + 1]) % mod);
        }

        for (int i = 0; i < n; i++) {
            result[i] = (int)(((long)leftProduct[i] * rightProduct[i]) % mod);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,4,8,5,10};
        int[] arr1 = {1,4,8,2};
        int[] ans = getProductArrayExceptSelf(arr1);
        System.out.println(Arrays.toString(ans));
    }

}