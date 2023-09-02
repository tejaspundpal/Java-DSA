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
        //         if(arr[j]==diff){
        //      for(int j = i+1;j <arr.length;j++){
        //        //            int ans[] = {arr[i],arr[j]};
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

        //        Arrays.sort(arr);
//        int i=0;
//        int j=n-1;
//        int count=0;
//        while (i<j) {
//            int currsum = arr[i]+arr[j];
//            if (currsum < target) {
//                i++;
//            } else if (currsum > target) {
//                j--;
//            } else {
//                count++;
//                i++;
//                j--;
//            }
//        }
//        if(count == 0)
//            count = -1;
//        return count;
    }

}

