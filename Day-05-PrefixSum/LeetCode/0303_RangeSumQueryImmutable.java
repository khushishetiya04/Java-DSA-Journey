/*
 * LeetCode: 303
 * Problem: Range Sum Query - Immutable
 * Difficulty: Easy
 *
 * Description:
 * Design a data structure that efficiently answers
 * multiple range sum queries on an immutable array.
 *
 * Approach:
 * - Build a Prefix Sum array in the constructor.
 * - Store the cumulative sum at each index.
 * - To find the sum from left to right:
 *      If left == 0:
 *          return prefix[right]
 *      Else:
 *          return prefix[right] - prefix[left - 1]
 *
 * Pattern:
 * Prefix Sum
 *
 * Time Complexity:
 * - Constructor: O(n)
 * - sumRange(): O(1)
 *
 * Space Complexity: O(n)
 */

class NumArray {
    int[] prefix;

    public NumArray(int[] nums) {
        prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }
}