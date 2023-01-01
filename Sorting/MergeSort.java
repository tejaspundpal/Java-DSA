package Java_DSA.Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int[] arr,int l,int h,int n){
        if (l < h)
        {
            int mid = (l + h) / 2;
            mergeSort(arr, l, mid, n);
            mergeSort(arr, mid + 1, h, n);

            merge(arr, l, mid, h, n);
        }
    }
    public static void merge(int[] arr, int l, int m, int h, int n) {
        int n1 = m - l + 1, n2 = h - m;
        int[] a = new int[n1];
        int[] b = new int[n2];

        for (int i = 0; i < n1; i++)
            a[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            b[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        
        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                arr[k] = a[i];
                k++;
                i++;
            } else {
                arr[k] = b[j];
                k++;
                j++;
            }
        }
        while (i < n1) {
            arr[k] = a[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = b[j];
            j++;
            k++;
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
        mergeSort(arr,0,n-1,n);
        print(arr,n);
    }
}
