package Java_DSA.Sorting;

import java.util.Scanner;

public class QuickSort
{
    public static void swap(int[] arr,int i,int j){
        int temp;
        temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        do{
            while(arr[i] <= pivot)
                i++;
            while(arr[j] > pivot)
                j--;
            if(i < j){
                swap(arr,i,j);
            }
        }while(i < j);

        swap(arr,low,j);
        return j;
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low < high){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }
    public static void print(int[] arr,int n){
        for (int i = 0;i < n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        print(arr,n);
        quickSort(arr,0,n-1);
        print(arr,n);
    }
}
