/*
 * LeetCode: 1493
 * Problem: Longest Subarray of 1's After Deleting One Element
 * Difficulty: Medium
 *
 * Description:
 * Given a binary array nums, return the length of the
 * longest subarray containing only 1's after deleting
 * exactly one element.
 *
 * Approach:
 * - Use a variable sliding window.
 * - Allow at most one zero inside the window.
 * - Expand the window by moving the right pointer.
 * - If more than one zero exists, shrink the window.
 * - Since one element must be deleted, the answer is
 *   (window size - 1), which is (right - left).
 *
 * Pattern:
 * Variable Sliding Window
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left);
        }
        return maxLength;
    }
}