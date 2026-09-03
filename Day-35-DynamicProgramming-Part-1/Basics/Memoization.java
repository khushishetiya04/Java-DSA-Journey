/*
 * Practice: General Memoization Template
 *
 * Pattern: Dynamic Programming + Recursion + Memoization
 *
 * Description:
 * General template for solving Dynamic Programming problems using
 * the Top-Down approach.
 *
 * Approach:
 * 1. Define the recursive function.
 * 2. Identify the base case.
 * 3. Check if the answer is already stored in dp.
 * 4. If stored, return dp[state].
 * 5. Calculate the answer using recursive calls.
 * 6. Store the answer in dp[state].
 * 7. Return dp[state].
 *
 * Time Complexity: O(number of states × transitions)
 * Space Complexity: O(number of states + recursion stack)
 */

import java.util.*;
public class Memoization {
    public static int solve(int n, int[] dp) {

        if (/* base case */) {
            return /* base value */;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = /* recursive transition */;
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        int result = solve(n, dp);

        System.out.println(result);
    }
}