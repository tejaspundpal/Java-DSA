import java.util.*;
public class LearnArraysClass {
    public static void main(String[] args) {
        int[] numbers = {1,3,5,7,9,11,13,15};

        int index = Arrays.binarySearch(numbers,5);
        System.out.println(index);
        int index1 = Arrays.binarySearch(numbers,6);
        System.out.println(index1);

        int[] numbers1 = {1,31,55,17,91,14,48,73};
        Arrays.sort(numbers1);
        //System.out.println(numbers1);--------->shows address, no correct o/p
        System.out.println(Arrays.toString(numbers1));
        for(Integer num:numbers1)
        {
            System.out.println(num);
        }
//        Arrays.fill(numbers,25);
//        System.out.println(Arrays.toString(numbers));



    }
}
