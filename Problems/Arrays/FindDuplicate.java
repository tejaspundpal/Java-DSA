package Java_DSA.Problems.Arrays;

import java.util.*;

public class FindDuplicate {
    public static int findDuplicate(ArrayList<Integer> arr) {

//
//         HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
//         for(int i=0;i<arr.size();i++)
//         {
//         	if(map.containsKey(arr.get(i)))
//         	{
//         		return arr.get(i);
//         	}
//         	else
//         		map.put(arr.get(i), 1);
//         }
//         	return 0;


//         Collections.sort(arr);
//         for(int i = 1;i < arr.size();i++){
//             if(arr.get(i)==arr.get(i-1))
//             return arr.get(i);
//         }
//         return 0;

//        HashSet<Integer> set = new HashSet<>();
//        for(int i = 0;i < arr.size();i++){
//            if(!set.add(arr.get(i))){
//                return arr.get(i);
//            }
//        }
//        return 0;

//        int freq[] = new int[10000];
//        for(int i = 0;i < arr.size();i++){
//            if(freq[arr.get(i)]==0)
//                freq[arr.get(i)]++;
//            else
//                return arr.get(i);
//        }
//        return 0;

        for(int i = 0; i < arr.size()-1; i++){ // O(N)
            for(int j = i+1; j < arr.size(); j++){ //O(n)
                if(arr.get(i).equals(arr.get(j))){ // same as (arr[i] == arr[j])
                    return arr.get(i); // Finally, the duplicate number is returned as the output.
                }
            }
        }
        return -1; // if no duplicates then return -1
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5,3,6));
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }
}
