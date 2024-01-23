package Java_DSA.Problems.BitManipulation;

public class MaxInterview {
    static int calculateNumberOfDays(String s) {
        // Write your code here.
        int n = s.length();
        int[] dp = new int[n];

        // Base case: The first day's interview can always be attended
        dp[0] = s.charAt(0) - '0';

        for (int i = 1; i < n; i++) {
            // Calculate the maximum number of interviews that can be attended
            // on the current day by considering two possibilities:
            // 1. Attend the interview on the current day
            // 2. Skip the interview on the current day

            // If we attend the interview on the current day, add 1 to the
            // maximum interviews attended on the previous day (if any)
            int option1 = (i >= 2 ? dp[i - 2] : 0) + (s.charAt(i) - '0');

            // If we skip the interview on the current day, the maximum
            // interviews attended remain the same as on the previous day
            int option2 = dp[i - 1];

            // Choose the maximum of the two options
            dp[i] = Math.max(option1, option2);
        }

        // The result is the maximum interviews that can be attended on the last day
        return dp[n - 1];
    }
}