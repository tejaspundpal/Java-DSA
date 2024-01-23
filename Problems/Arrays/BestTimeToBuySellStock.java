package Java_DSA.Problems.Arrays;

import java.util.* ;
import java.io.*;
import java.util.ArrayList;

public class BestTimeToBuySellStock{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int min = prices.get(0);
        int maxProfit = 0;
        for(int i = 0;i < prices.size();i++){
            min = Math.min(min,prices.get(i));
            int profit = prices.get(i)-min;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(17, 20, 11, 9, 12, 6));
        int ans =  maximumProfit(list);
        System.out.println(ans);
    }
}