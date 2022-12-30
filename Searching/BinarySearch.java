package Java_DSA.Searching;
import java.util.*;

public class BinarySearch
{
    public static int search(int[] arr, int n, int element){
        int first = 0;
        int last = n-1;

        while(first <= last) {
            int mid = (first + last)/2;

            if (element < arr[mid]) {
                last = mid - 1;
                            }
            else if(element > arr[mid]){
                first = mid + 1;
            }
            else {
                return  mid;
            }
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

        int result = search(arr,n,searchvalue);
        if(result == -1){
            System.out.println("Element is not present.");
        }
        else{
            System.out.println("Element is present at index " + result);
        }
    }
}
