package Java_DSA.Problems.Strings;
import java.util.Scanner;

public class TossScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.next();
        int tail = 0,head = 0;
        int last = str.length()-1;
        for(int i = 0;i < str.length()-3;i++){
            if(str.charAt(i)=='H' && str.charAt(i+1)=='H' && str.charAt(i+2)=='H'){
                last = i + 2;
                break;
            }
        }
        for(int i = 0;i <= last;i++){
            if(str.charAt(i)=='T')
                tail++;
            else
                head++;
        }
//        System.out.println(head);
//        System.out.println(tail);
        System.out.println((2*head)+(-1*tail));
    }
}
