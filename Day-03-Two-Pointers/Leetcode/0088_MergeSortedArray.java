/*
 * LeetCode: 88
 * Problem: Merge Sorted Array
 * Difficulty: Easy
 *
 * Description:
 * You are given two sorted integer arrays, nums1 and nums2,
 * and two integers m and n representing the number of valid
 * elements in nums1 and nums2 respectively.
 *
 * Merge nums2 into nums1 as one sorted array.
 *
 * Approach:
 * - Use three pointers:
 *   - i points to the last valid element of nums1.
 *   - j points to the last element of nums2.
 *   - k points to the last position of nums1.
 * - Compare elements from the end of both arrays.
 * - Place the larger element at nums1[k].
 * - Continue until one array is exhausted.
 * - If nums2 still has remaining elements, copy them.
 *
 * Pattern:
 * Opposite Direction Two Pointers (Merge From End)
 *
 * Time Complexity : O(m + n)
 * Space Complexity: O(1)
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}