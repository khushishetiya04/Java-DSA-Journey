/*
 * Practice: Fibonacci
 *
 * Pattern: Dynamic Programming
 *
 * Description:
 * Find the nth Fibonacci number using Recursion, Memoization,
 * Tabulation, and Space Optimization.
 *
 * Approaches:
 * 1. Recursion
 * 2. Memoization
 * 3. Tabulation
 * 4. Space Optimization
 *
 * Time Complexity:
 * Recursion: O(2^n)
 * Memoization: O(n)
 * Tabulation: O(n)
 * Space Optimized: O(n)
 *
 * Space Complexity:
 * Recursion: O(n)
 * Memoization: O(n)
 * Tabulation: O(n)
 * Space Optimized: O(1)
 */

import java.util.*;
public class Fibonacci {
    public static int recursion(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return recursion(n - 1) + recursion(n - 2);
    }

    public static int memoization(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = memoization(n - 1, dp) + memoization(n - 2, dp);
        return dp[n];
    }

    public static int tabulation(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static int spaceOptimized(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int prev2 = 0;
        int prev1 = 1;

        for (int i = 2; i <= n; i++) {

            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println("Recursion: " + recursion(n));
        System.out.println("Memoization: " + memoization(n, dp));
        System.out.println("Tabulation: " + tabulation(n));
        System.out.println("Space Optimized: " + spaceOptimized(n));
    }
}