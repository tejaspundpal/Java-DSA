package Java_DSA.Problems.BitManipulation;
import java.util.* ;
import java.io.*;
public class FlipBits {
    public static int calone(int[] arr){
        int currsum = arr[0];
        int maxsum =  0;
        for(int i = 1;i < arr.length;i++){
            currsum = Math.max(arr[i],currsum+arr[i]);
            maxsum = Math.max(currsum,maxsum);
        }
        return maxsum;
    }
    public static int flipBits(int[] arr,int n) {
        //Write your code here
        int countone = 0;
        for(int i = 0;i < n;i++){
            if(arr[i]==0){
                arr[i] = 1;
            }
            else{
                arr[i] = -1;
                countone++;
            }
        }
        return countone + calone(arr);
    }
}
