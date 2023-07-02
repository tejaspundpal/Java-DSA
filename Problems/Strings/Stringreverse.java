package Java_DSA.Problems.Strings;

import java.util.*;
public class Stringreverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        StringBuffer s1 = new StringBuffer();
        //char str ;

        System.out.println("Enter any string : ");
        s = sc.nextLine();
        for(int i = s.length()-1;i >= 0;i-- )
        {
            //str = s.charAt(i);
            s1.append(s.charAt(i));
        }
        System.out.println(s1);
    }
}
