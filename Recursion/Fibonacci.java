package Java_DSA.Recursion;
import java.util.*;

public class Fibonacci {
   public static void fibonacci(int i,int n,int n1,int n2){
       if(i == n){
         return;
       }
       int n3 = n1 + n2;
       System.out.println(n3);
       n1 = n2;
       n2 = n3;
       fibonacci(i+1,n,n1,n2);

   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.println(0);
        System.out.println(1);
        fibonacci(2,n,n1,n2);

    }
}
