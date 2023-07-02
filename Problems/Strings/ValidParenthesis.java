package Java_DSA.Problems.Strings;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValidParenthesis(String expression) {
        // Write your code here.  
        Stack<Character> st = new Stack<>();
        char[] arr = expression.toCharArray();

        for (char c : arr) {
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else if (c == ')') {
                if (st.isEmpty() || st.peek() != '(')
                    return false;
                st.pop();
            } else if (c == ']') {
                if (st.isEmpty() || st.peek() != '[')
                    return false;
                st.pop();
            } else if (c == '}') {
                if (st.isEmpty() || st.peek() != '{')
                    return false;
                else
                    st.pop();

            }

        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.next();
        if(isValidParenthesis(str))
            System.out.println("Balanced");
        else
            System.out.println("Unbalanced");
    }

}