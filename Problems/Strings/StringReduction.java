package Java_DSA.Problems.Strings;

import java.util.Scanner;

public class StringReduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                sb.append(input.charAt(i));
                sb.append(count);
                count = 1;
            }
        }

        sb.append(input.charAt(input.length() - 1));
        sb.append(count);

        System.out.println("Reduced string: " + sb.toString());
    }
}
