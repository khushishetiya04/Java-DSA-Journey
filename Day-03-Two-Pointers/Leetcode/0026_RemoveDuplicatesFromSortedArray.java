/*
 * LeetCode: 26
 * Problem: Remove Duplicates from Sorted Array
 * Difficulty: Easy
 *
 * Description:
 * Given a sorted integer array nums, remove the duplicates
 * in-place such that each unique element appears only once.
 *
 * Return the number of unique elements.
 *
 * Approach:
 * - Use two pointers:
 *   - slow points to the last unique element.
 *   - fast scans the array.
 * - If nums[fast] is different from nums[slow],
 *   move slow forward and copy nums[fast].
 * - Return slow + 1 as the count of unique elements.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int slow = 1;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}