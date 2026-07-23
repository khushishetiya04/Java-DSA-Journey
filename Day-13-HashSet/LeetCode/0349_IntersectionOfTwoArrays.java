/*
 * LeetCode: 349
 * Problem: Intersection of Two Arrays
 * Difficulty: Easy
 *
 * Description:
 * Given two integer arrays nums1 and nums2,
 * return an array of their intersection.
 *
 * Each element in the result must be unique,
 * and the result can be returned in any order.
 *
 * Approach:
 * - Store all elements of nums1 in a HashSet.
 * - Traverse nums2.
 * - If an element exists in the set,
 *   add it to another HashSet (result).
 * - Convert the result HashSet into an array.
 *
 * Pattern:
 * HashSet
 *
 * Time Complexity : O(n + m)
 * Space Complexity: O(n)
 */

import java.util.HashSet;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }

        int[] ans = new int[result.size()];
        int index = 0;

        for (int num : result) {
            ans[index++] = num;
        }
        return ans;
    }
}