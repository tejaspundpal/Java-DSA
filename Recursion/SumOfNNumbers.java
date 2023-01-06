package Java_DSA.Recursion;
import java.util.Scanner;

public class SumOfNNumbers
{
    public static void calculateSum(int i ,int n,int sum){
        if(i == n){
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        calculateSum(i+1,n,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        calculateSum(1,n,0);
    }
}
