package Java_DSA.Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr,int n){
        for(int i = 0;i < n-1;i++){
            int min = i;
            int temp;
            for(int j = i+1;j < n;j++){
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            if(i!=min){
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
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
        selectionSort(arr,n);
        print(arr,n);
    }
}
