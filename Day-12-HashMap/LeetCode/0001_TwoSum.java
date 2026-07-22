/*
 * LeetCode: 1
 * Problem: Two Sum
 * Difficulty: Easy
 *
 * Description:
 * Given an array of integers nums and an integer target,
 * return the indices of the two numbers such that they
 * add up to the target.
 *
 * You may assume that each input has exactly one solution,
 * and you may not use the same element twice.
 *
 * Approach:
 * - Traverse the array once.
 * - For each element, calculate its complement
 *   (target - current element).
 * - If the complement already exists in the HashMap,
 *   return both indices.
 * - Otherwise, store the current number and its index.
 *
 * Pattern:
 * HashMap Lookup
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}