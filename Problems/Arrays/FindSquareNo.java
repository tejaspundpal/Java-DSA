package Java_DSA.Problems.Arrays;

import java.util.Scanner;

public class FindSquareNo {
    static int count = 0;
    public static int findSquare(int l,int b){
        if(l == 0 || b == 0 || l < 0 || b < 0){
            System.out.println("Invalid");
        }
        if(l == b){
            System.out.println("length : "+l+" breadth :"+b);
            count++;
        }
        if(l > b){
            System.out.println("length : "+b+" breadth :"+b);
            count++;
            int newl = l -b;
            findSquare(newl,b);
        }
        if(b > l){
            System.out.println("length : "+l+" breadth :"+l);
            count++;
            int newb = b - l;
            findSquare(l,newb);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        int l = sc.nextInt();
        System.out.println("Enter breadth : ");
        int b = sc.nextInt();
        int totalSquare = findSquare(l,b);
        System.out.println("Total square = "+ totalSquare);
    }
}
