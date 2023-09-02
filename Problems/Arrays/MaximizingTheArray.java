package Java_DSA.Problems.Arrays;
import java.util.*;

public class MaximizingTheArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter second array size : ");
        int m = sc.nextInt();
        int[] rep = new int[m];
        System.out.println("Enter first array : ");
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter second array : ");
        for(int i = 0;i < m;i++){
            rep[i] = sc.nextInt();
        }
        Arrays.sort(rep);
        int i = 0;
        int j = m-1;
        while(i < j){
            int temp = rep[i];
            rep[i] = rep[j];
            rep[j] = temp;
            i++;
            j--;
        }
        int start1 = 0;
        int start2 = 0;
        while(start1 < arr.length){
            if(arr[start1] < rep[start2]){
                int temp = arr[start1];
                arr[start1] = rep[start2];
                rep[start2] = temp;
                start1++;
                start2++;
            }
            else{
                start1++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
