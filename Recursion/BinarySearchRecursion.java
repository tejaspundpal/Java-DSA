package Java_DSA.Searching;

import java.util.*;

public class BinarySearchRecursion
{
    public static int search(int[] arr,int start,int n, int element){
        int first = start;
        int last = n-1;
        if(first == last){
            if (arr[first]==element)
            {
                return first;
            }
        }
        else if(first < last){
            int mid = (first + last)/2;
            if (element < arr[mid]) {
                last = mid - 1;
                return search(arr,first,mid-1,element);
            }
            else if(element > arr[mid]){
                first = mid + 1;
                return search(arr,mid + 1,last,element);
            }
            else {
                return  mid;
            }
        }
         else{
             return -1;
        }
         return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the searching element : ");
        int searchvalue = sc.nextInt();

        int result = search(arr,0,n,searchvalue);
        if(result == -1){
            System.out.println("Element is not present.");
        }
        else{
            System.out.println("Element is present at index " + result);
        }
    }
}
