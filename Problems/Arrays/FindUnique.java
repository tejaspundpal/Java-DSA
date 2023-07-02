package Java_DSA.Problems.Arrays;

public class FindUnique {
    public static int findUnique(int[] arr){
        //Your code goes here
        int ans = 0;
        for(int i = 0;i < arr.length;i++){
            ans = ans^arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,4,1,6,2,6};
        int result = findUnique(arr);
        System.out.println(result);
    }
}
