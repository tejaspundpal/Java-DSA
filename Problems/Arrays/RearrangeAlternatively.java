package Java_DSA.Problems.Arrays;

import java.util.* ;
import java.io.*;

public class RearrangeAlternatively {

//When order doesnt matter ------->

//    public static int[] rearrange(int[] arr) {
//        // Write you code here
//        int n = arr.length;
//        int i = 0;
//        int j = n-1;
//        while(i < j){
//           if(i <= n-1 && arr[i] > 0)
//               i++;
//           else if(j >= 0 && arr[j] < 0)
//               j--;
//           else{
//               int temp = arr[i];
//               arr[i] = arr[j];
//               arr[j] = temp;
//               i++;
//               j--;
//           }
//        }
//        if(i==0 || i == n)
//            return arr;
//        int k  = 0;
//        while(i < n && k < n){
//            int temp = arr[i];
//            arr[i] = arr[k];
//            arr[k] = temp;
//            i++;
//            k +=2;
//        }
//        return arr;
//    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] rearrange(int[] arr) {
        int n = arr.length;
        int i = -1;
        for (int j = 0; j<n; j++) {
            if (arr[j] < 0) {
                i++;
                swap(arr, i, j);
            }
        }
        int pos = i + 1;
        int neg = 0;
        while (pos<n && neg<pos && arr[neg]<0) {
            swap(arr, pos, neg);
            pos++;
            neg += 2;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4,-9,-2,6,-8};
        //int[] arr ={1, 2, 3, -4, -1, 4};
        //int[] arr = {1,2,3,-5};
        int[] ans;
        ans = rearrange(arr);
        for(int i = 0;i < arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
//19 12 2017