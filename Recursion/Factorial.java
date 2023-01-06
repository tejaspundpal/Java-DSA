package Java_DSA.Recursion;
import java.util.*;

public class Factorial
{
    public static int calcFactorial(int n){
        if(n == 1){
            return 1;
        }
        int fact = calcFactorial(n-1);
        int ans = n * fact;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int result = calcFactorial(n);
        System.out.println(result);
    }
}
