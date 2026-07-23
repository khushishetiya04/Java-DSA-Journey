/*
 * LeetCode: 217
 * Problem: Contains Duplicate
 * Difficulty: Easy
 *
 * Description:
 * Given an integer array nums,
 * return true if any value appears
 * at least twice in the array.
 *
 * Return false if every element is distinct.
 *
 * Approach:
 * - Traverse the array.
 * - Store each element in a HashSet.
 * - If an element already exists in the set,
 *   a duplicate is found.
 *
 * Pattern:
 * HashSet
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}