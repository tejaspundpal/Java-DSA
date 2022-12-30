package Java_DSA.Searching;
import java.util.*;

public class LinearSearch
{
    public static int search(int[] a, int n, int searchValue)
    {
        for(int i=0; i<n ; i++)
        {
            if( a[i] == searchValue )
                return i;
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
