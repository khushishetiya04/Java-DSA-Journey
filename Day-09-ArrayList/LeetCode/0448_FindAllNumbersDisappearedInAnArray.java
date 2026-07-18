/*
 * LeetCode: 448
 * Problem: Find All Numbers Disappeared in an Array
 * Difficulty: Easy
 *
 * Description:
 * Given an array nums of size n where
 * 1 ≤ nums[i] ≤ n, return all the numbers
 * in the range [1, n] that do not appear in nums.
 *
 * Approach:
 * - Use the value of each element as an index.
 * - Mark the corresponding index as negative.
 * - Positive indices after marking represent
 *   the missing numbers.
 *
 * Pattern:
 * Array + ArrayList + Index Marking
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 * (Ignoring the output ArrayList)
 */

import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        // Mark visited indices
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        // Collect missing numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1);
            }
        }
        return ans;
    }
}