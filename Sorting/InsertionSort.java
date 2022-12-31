package Java_DSA.Sorting;

import java.util.Scanner;

public class InsertionSort
{
    public static void insertionSort(int[] arr,int n){
        int iteration = 0;
        for(int i = 1;i < n;i++){
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
            iteration++;
        }
        System.out.println("Total iteration : "+ iteration);
    }
    public static void print(int[] arr,int n){
        for (int i = 0;i < n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //BubbleSort b = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        print(arr,n);
        insertionSort(arr,n);
        print(arr,n);
    }
}
