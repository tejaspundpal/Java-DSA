//Given an array which only contains 0,1 and 2 and we have to sort it.
//Sample Input 1 :
//        2
//        6
//        0 1 2 2 1 0
//        7
//        0 1 2 1 2 1 2
// Sample Output 1 :
//        0 0 1 1 2 2
//        0 1 1 1 2 2 2
// Sample Input 2 :
//        2
//        7
//        2 2 2 1 1 1 0
//        6
//        2 1 2 0 1 0
// Sample Output 2 :
//        0 1 1 1 2 2 2
//        0 0 1 1 2 2

package Java_DSA.Problems.Arrays;
import java.util.* ;
import java.io.*;
public class Sort012
{
    public static void sort012(int[] arr)
    {
        int count0=0;
        int count1=0;
        int count2=0;

        for(int num:arr){
            if(num==0)
                count0++;
            else if(num==1)
                count1++;
            else
                count2++;
        }
        for(int i=0;i<arr.length;i++){
            if(i<count0)
                arr[i]=0;
            else if(i<count0+count1)
                arr[i]=1;
            else
                arr[i]=2;
        }
    }
}