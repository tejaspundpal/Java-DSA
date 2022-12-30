package Java_DSA.Sorting;
import java.util.*;

public class BubbleSort
{
    public static void bubbleSort(int[] arr,int n){
        int temp;
        int swap = 0;
        for(int i = 0;i < n-1;i++){
            for(int j = i+1;j < n;j++){
                if(arr[j] < arr[i]){

                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    swap++;
                }
            }
        }
        System.out.println("Swaps : "+swap);
    }
    public static void print(int[] arr,int n){
        for (int i = 0;i < n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        print(arr,n);
        bubbleSort(arr,n);
        print(arr,n);
    }
}
