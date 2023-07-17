package Java_DSA.Problems.Arrays;

import java.util.* ;
import java.io.*;
public class FirstAndLastPositionOfElement {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            if(arr.get(i) == k){
                list.add(i);
            }
        }
        int[] ans = new int[2];
        if(list.size()==0){
         ans[0] = -1;
         ans[1] = -1;
         return ans;
        }
        ans[0] = Collections.min(list);//list.get(0);
        ans[1] = Collections.max(list);//list.get(list.size()-1);
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer>l = new ArrayList<>(List.of(0,0,1,1,2,3,2,2,2));
        int[] result = firstAndLastPosition(l,l.size(),2);
        for (int j : result) {
            System.out.print(j + " ");
        }
    }

};
