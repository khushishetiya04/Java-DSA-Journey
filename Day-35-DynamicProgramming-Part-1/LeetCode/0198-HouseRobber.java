/*
 * LeetCode: 198. House Robber
 *
 * Pattern: Dynamic Programming + 1D DP + Space Optimization
 *
 * Description:
 * Given an array of money in different houses, find the maximum
 * amount of money that can be robbed without robbing two adjacent houses.
 *
 * Approach:
 * 1. At every house, we have two choices:
 *      - Rob the current house.
 *      - Skip the current house.
 * 2. If we rob the current house, add its money to dp[i - 2].
 * 3. If we skip it, keep dp[i - 1].
 * 4. Take the maximum of both choices.
 * 5. Store only the previous two values for space optimization.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int rob(int[] nums) {
        int prev2 = 0;
        int prev1 = 0;

        for (int money : nums) {
            int current = Math.max(prev1, prev2 + money);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}