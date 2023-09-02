package Java_DSA.Problems.Arrays;

public class RearrangeAlternativelyMaxAndMinElement {
    public static int[] rearrangeAlternatively(int[] arr){
        int n = arr.length;
        int max_index = n-1;
        int min_index = 0;
        int max = arr[n-1]+1;
        for(int i = 0;i < n;i++){
            if(i%2==0){
                arr[i] = (arr[max_index] % max) * max + arr[i];
                max_index--;
            }
            else{
                arr[i] = (arr[min_index] % max) * max + arr[i];
                min_index++;
            }
        }
        for(int i = 0;i < arr.length;i++){
            arr[i] /= max;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] ans;
        //int[] arr = {1,2,3,4,5,6};
        int[] arr = {11,18,24,25,35,43,56};
        ans = rearrangeAlternatively(arr);
        for(int i = 0;i < arr.length;i++){
            System.out.print(ans[i] + " ");
        }

    }
}
