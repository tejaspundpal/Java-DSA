package Java_DSA.Recursion;
import java.util.Scanner;

public class DisplayNNumbers
{
    public static void printDescending(int n)
    {
        if(n==0)
            return;
        System.out.print(n + " ");
        printDescending(n-1);
    }

    public static void printAscending(int n)
    {
        if(n==0)
            return;
        printAscending(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter value of n : ");
        n = scan.nextInt();

        printDescending(n);
        System.out.println();

        printAscending(n);
        System.out.println();

    }
}