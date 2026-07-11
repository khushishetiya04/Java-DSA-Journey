/*
 * LeetCode: 1920
 * Problem: Build Array from Permutation
 * Difficulty: Easy
 *
 * Description:
 * Given a zero-based permutation array 'nums', build a new array 'ans'
 * such that ans[i] = nums[nums[i]] for every index i.
 *
 * Approach:
 * - Create a new array 'result' of the same size as the input array.
 * - Traverse the input array.
 * - For each index i, assign result[i] = nums[nums[i]].
 * - Return the newly constructed array.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
}