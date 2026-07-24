/*
 * LeetCode: 268
 * Problem: Missing Number
 * Difficulty: Easy
 *
 * Description:
 * Given an array nums containing n distinct numbers
 * in the range [0, n], return the only number in the
 * range that is missing from the array.
 *
 * Approach:
 * - XOR all indices and array elements.
 * - Equal numbers cancel each other because:
 *      a ^ a = 0
 * - The remaining value is the missing number.
 *
 * Pattern:
 * Bit Manipulation (XOR)
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int missingNumber(int[] nums) {
        int xor = nums.length;

        for (int i = 0; i < nums.length; i++) {
            xor ^= i;
            xor ^= nums[i];
        }
        return xor;
    }
}