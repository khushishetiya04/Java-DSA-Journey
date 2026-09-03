/*
 * LeetCode: 70. Climbing Stairs
 *
 * Pattern: Dynamic Programming + 1D DP
 *
 * Description:
 * You are climbing a staircase with n steps.
 * You can climb either 1 step or 2 steps at a time.
 * Find the number of distinct ways to reach the top.
 *
 * Greedy Idea:
 * Not applicable. This problem is solved using Dynamic Programming.
 *
 * Approach:
 * 1. Define dp[i] as the number of ways to reach step i.
 * 2. Base cases:
 *      dp[0] = 1
 *      dp[1] = 1
 * 3. To reach step i, we can come from:
 *      - step i - 1
 *      - step i - 2
 * 4. Therefore:
 *      dp[i] = dp[i - 1] + dp[i - 2]
 * 5. Return dp[n].
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int climbStairs(int n) {
        int prev2 = 1;
        int prev1 = 1;

        for (int i = 2; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}