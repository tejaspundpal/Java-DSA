package Java_DSA.Problems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSum {
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        // List<int[]>result = new ArrayList<>();
        // for(int i = 0;i < arr.length-1;i++){
        //     int diff  = s - arr[i];
        //     for(int j = i+1;j <arr.length;j++){
        //         if(arr[j]==diff){
        //             int ans[] = {arr[i],arr[j]};
        //             result.add(ans);
        //         }
        //     }
        // }
        // return result;
        List<int[]> list = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == s){
                    list.add(new int[]{arr[i], arr[j]});
                }
            }
        }

        return list;
    }
}
