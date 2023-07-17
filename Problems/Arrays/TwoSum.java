//Sample Input 1 :
//        2
//        4 9
//        2 7 11 13
//        5 1
//        1 -1 -1 2 2
//Sample Output 1:
//        2 7
//        -1 2
//        -1 2
//Explanation For Sample 1:
//For the first test case, we can see that the sum of  2 and 7 is equal to 9 and it is the only valid pair.
//For the second test case, there are two valid pairs (-1,2) and (-1,2), which add up to 1.
//
//Sample Input 2 :
//        1
//        4 16
//        2 7 11 13
//Sample Output 2 :
//        -1 -1
//
//package Java_DSA.Problems.Arrays;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.*;
//



//public class TwoSum {
//    static ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer> arr, int target, int n) {
//        // Write your code here.
//
//        ArrayList<Pair<Integer,Integer>>list = new ArrayList<>();
//        int i = 0;
//        int j = n-1;
//        Collections.sort(arr);
//
//        while(i < j){
//            if((arr.get(i)+arr.get(j))== target){
//                list.add(new Pair(arr.get(i),arr.get(j)));
//                i++;
//                j--;
//            }
//            else if((arr.get(i)+arr.get(j)) <  target){
//                i++;
//            }
//            else{
//                j--;
//            }
//        }
//        if(list.isEmpty())
//            list.add(new Pair(-1,-1));
//
//        return list;
//    }
//}
