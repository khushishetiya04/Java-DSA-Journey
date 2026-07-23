/*
 * LeetCode: 128
 * Problem: Longest Consecutive Sequence
 * Difficulty: Medium
 *
 * Description:
 * Given an unsorted array of integers nums,
 * return the length of the longest consecutive
 * elements sequence.
 *
 * You must write an algorithm that runs in O(n) time.
 *
 * Approach:
 * - Store all elements in a HashSet.
 * - A number is the start of a sequence if
 *   (num - 1) is not present in the set.
 * - Count the length of the sequence by checking
 *   consecutive numbers.
 * - Keep track of the maximum length.
 *
 * Pattern:
 * HashSet
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

import java.util.HashSet;
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }
                longest = Math.max(longest, currentLength);
            }
        }
        return longest;
    }
}