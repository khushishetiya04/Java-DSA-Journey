/*
 * LeetCode: 1929
 * Problem: Concatenation of Array
 * Difficulty: Easy
 *
 * Description:
 * Given an integer array 'nums' of length n, create a new array 'ans'
 * of length 2n such that:
 * - ans[i] = nums[i]
 * - ans[i + n] = nums[i]
 * for 0 <= i < n.
 *
 * Approach:
 * - Find the length of the input array.
 * - Create a new array of size 2 * n.
 * - Traverse the input array once.
 * - Copy each element to its original position and again to position i + n.
 * - Return the concatenated array.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
            result[i + n] = nums[i];
        }
        return result;
    }
}