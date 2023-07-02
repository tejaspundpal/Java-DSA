package Java_DSA.Problems.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeSortedArrays {
    public static void main(String[] args) {

    }
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        // Write your code here.
        for(int i = 0;i < n;i++){
            arr1[m+i] = arr2[i];
        }
        Arrays.sort(arr1);
        return arr1;

//        ******** cpp sol --> *********
//        vector<int> ans;
//        int i=0,j=0;
//        while(i<m && j<n){
//            if(arr1.at(i)<arr2.at(j)){
//                ans.push_back(arr1[i]);
//                i++;
//            }else{
//                ans.push_back(arr2[j]);
//                j++;
//            }
//        }
//        while(i<m){
//            ans.push_back(arr1[i]);
//            i++;
//        }
//        while(j<n){
//            ans.push_back(arr2[j]);
//            j++;
//        }
//        return ans;


    }
}
