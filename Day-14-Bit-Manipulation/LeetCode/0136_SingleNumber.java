/*
 * LeetCode: 136
 * Problem: Single Number
 * Difficulty: Easy
 *
 * Description:
 * Given a non-empty array of integers nums,
 * every element appears twice except for one.
 * Find that single element.
 *
 * You must implement a solution with
 * linear runtime complexity and use
 * only constant extra space.
 *
 * Approach:
 * - XOR all the elements.
 * - Same numbers cancel each other because:
 *      a ^ a = 0
 * - Also:
 *      a ^ 0 = a
 * - The remaining value is the single number.
 *
 * Pattern:
 * Bit Manipulation (XOR)
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}