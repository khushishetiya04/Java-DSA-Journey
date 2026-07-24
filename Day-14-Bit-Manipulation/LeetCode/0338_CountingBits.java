/*
 * LeetCode: 338
 * Problem: Counting Bits
 * Difficulty: Easy
 *
 * Description:
 * Given an integer n, return an array ans
 * where ans[i] is the number of 1's in the
 * binary representation of i for
 * 0 <= i <= n.
 *
 * Approach:
 * - Use Dynamic Programming.
 * - Observation:
 *      i >> 1 removes the last bit.
 *      (i & 1) checks if the last bit is 1.
 *
 * Formula:
 *      ans[i] = ans[i >> 1] + (i & 1)
 *
 * Pattern:
 * Bit Manipulation + Dynamic Programming
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}