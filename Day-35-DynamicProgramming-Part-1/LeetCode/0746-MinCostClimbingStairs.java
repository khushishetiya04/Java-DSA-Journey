/*
 * LeetCode: 746. Min Cost Climbing Stairs
 *
 * Pattern: Dynamic Programming + 1D DP + Space Optimization
 *
 * Description:
 * Given an array where cost[i] is the cost of stepping on the ith stair,
 * find the minimum cost to reach the top of the floor.
 *
 * You can start from step 0 or step 1.
 * From each step, you can climb either 1 or 2 steps.
 *
 * Approach:
 * 1. At every step, we can reach it from the previous step or
 *    the step before it.
 * 2. Choose the minimum cost between the two possibilities.
 * 3. Store only the previous two DP values.
 * 4. The answer is the minimum cost of reaching the last two steps.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prev2 = 0;
        int prev1 = 0;

        for (int i = 2; i <= cost.length; i++) {
            int current = Math.min(
                    prev1 + cost[i - 1],
                    prev2 + cost[i - 2]
            );

            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}