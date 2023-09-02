package Java_DSA.Problems.Arrays;
import java.util.*;
class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        TreeSet<Integer>set = new TreeSet<>(Comparator.reverseOrder());
        for (int num : nums) {
            set.add(num);
        }
        ArrayList<Integer>list = new ArrayList<>(set);
        return list.get(2);
    }

    public static void main(String[] args) {
        int[] arr = {3,4,3,2};
        int ans = thirdMax(arr);
        System.out.println(ans);
    }
}