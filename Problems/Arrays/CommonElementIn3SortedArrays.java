package Java_DSA.Problems.Arrays;

import java.util.* ;
import java.io.*;
public class CommonElementIn3SortedArrays
{
    public static ArrayList<Integer> findCommonElements(ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> c)
    {
        // Write your code here.
        // ArrayList<Integer>ans = new ArrayList<>();
        // ArrayList<Integer>list = new ArrayList<>();
        // TreeSet<Integer>set = new TreeSet<>(b);
        // TreeSet<Integer>set1 = new TreeSet<>(c);
        // for(int i = 0;i < a.size();i++){
        // 	if(!set.add(a.get(i))){
        // 		list.add(a.get(i));
        // 	}
        // }
        // for(int i = 0;i < list.size();i++){
        // 	if(!set1.add(list.get(i))){
        // 		if(!ans.contains(list.get(i)))
        // 		ans.add(list.get(i));
        // 	}
        // }
        // return ans;

        // ArrayList<Integer>list = new ArrayList<>();
        // for(int i = 0;i < a.size();i++){
        // 	if(b.contains(a.get(i))&&c.contains(a.get(i))&&!list.contains(a.get(i)))
        // 	list.add(a.get(i));
        // }
        // return list;

        TreeSet<Integer>set = new TreeSet<>();
        a.retainAll(b);
        a.retainAll(c);
        set.addAll(a);
        a.clear();
        a.addAll(set);

        return a;
    }

    public static void main(String[] args) {
        ArrayList<Integer>a = new ArrayList<Integer>(List.of(4,9,12,15,20,25));
        ArrayList<Integer>b = new ArrayList<Integer>(List.of(2,3,9,12,13,18,20));
        ArrayList<Integer>c = new ArrayList<Integer>(List.of(9,10,12,13,15,20,27));

        ArrayList<Integer>result = new ArrayList<>();

        result = findCommonElements(a,b,c);
        System.out.println(result);
    }
}