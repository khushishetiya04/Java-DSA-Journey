/*
 * LeetCode: 283
 * Problem: Move Zeroes
 * Difficulty: Easy
 *
 * Description:
 * Given an integer array nums, move all the zeroes to the end
 * while maintaining the relative order of the non-zero elements.
 *
 * The operation must be performed in-place.
 *
 * Approach:
 * - Use two pointers:
 *   - slow points to the position where the next non-zero element
 *     should be placed.
 *   - fast scans the entire array.
 * - Whenever a non-zero element is found:
 *   - Swap nums[slow] and nums[fast].
 *   - Move slow forward.
 * - By the end, all non-zero elements are shifted to the front
 *   and all zeroes automatically move to the end.
 *
 * Pattern:
 * Same Direction Two Pointers
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;

                slow++;
            }
        }
    }
}