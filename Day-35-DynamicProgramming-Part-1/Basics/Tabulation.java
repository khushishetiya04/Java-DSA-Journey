/*
 * Practice: General Tabulation Template
 *
 * Pattern: Dynamic Programming + Tabulation
 *
 * Description:
 * General template for solving Dynamic Programming problems using
 * the Bottom-Up approach.
 *
 * Approach:
 * 1. Create a DP array.
 * 2. Identify and initialize the base cases.
 * 3. Start from the smallest state.
 * 4. Build the answer iteratively using previous states.
 * 5. Return the final DP state.
 *
 * Time Complexity: O(number of states × transitions)
 * Space Complexity: O(number of states)
 */

public class Tabulation {
    public static int solve(int n) {
        int[] dp = new int[n + 1];
        dp[0] = /* base case */;

        for (int i = 1; i <= n; i++) {
            dp[i] = /* transition using previous states */;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;
        int result = solve(n);

        System.out.println(result);
    }
}