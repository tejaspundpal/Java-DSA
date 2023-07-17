//Sample Input 1:
//        8
//        7 5 2 11 2 43 1 1
//        2
//Sample Output 1:
//        2 11 2 43 1 1 7 5
//Explanation Of Sample Input 1:
//Rotate 1 steps to the left: 5 2 11 2 43 1 1 7
//Rotate 2 steps to the left: 2 11 2 43 1 1 7 5
//

package Java_DSA.Problems.Arrays;

import java.util.* ;
import java.io.*;
class RotateArray {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=in.nextInt();
        }
        int r=in.nextInt();
        for(int i=0 ; i<r ; i++){
            int temp=arr[0];
            for(int j=1 ; j<n ; j++){
                arr[j-1]=arr[j];
            }
            arr[n-1]=temp;
        }
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

