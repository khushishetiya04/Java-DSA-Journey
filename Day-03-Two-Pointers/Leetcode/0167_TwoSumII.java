/*
 * LeetCode: 167
 * Problem: Two Sum II - Input Array Is Sorted
 * Difficulty: Medium
 *
 * Description:
 * Given a 1-indexed sorted array of integers, find two numbers
 * such that they add up to the target.
 *
 * Return the indices of the two numbers (1-based indexing).
 *
 * Approach:
 * - Use two pointers:
 *   - start at the beginning of the array.
 *   - end at the end of the array.
 * - Calculate the sum of the two elements.
 * - If the sum is greater than the target, move end backward.
 * - If the sum is smaller than the target, move start forward.
 * - If the sum equals the target, return the 1-based indices.
 *
 * Pattern:
 * Opposite Direction Two Pointers
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum > target) {
                end--;
            } else if (sum < target) {
                start++;
            } else {
                return new int[]{start + 1, end + 1};
            }
        }
        return new int[]{};
    }
}