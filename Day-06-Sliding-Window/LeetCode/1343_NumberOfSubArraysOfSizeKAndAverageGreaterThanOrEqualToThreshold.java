/*
 * LeetCode: 1343
 * Problem: Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
 * Difficulty: Medium
 *
 * Description:
 * Given an integer array arr, an integer k, and a threshold,
 * return the number of subarrays of size k whose average is
 * greater than or equal to the threshold.
 *
 * Approach:
 * - Calculate the sum of the first window of size k.
 * - If the window sum is greater than or equal to
 *   k * threshold, increment the count.
 * - Slide the window by removing the leftmost element
 *   and adding the next element.
 * - Repeat the comparison for every window.
 *
 * Pattern:
 * Fixed Sliding Window
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int windowSum = 0;
        int count = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        if (windowSum >= k * threshold) {
            count++;
        }
        
        for (int right = k; right < arr.length; right++) {
            windowSum = windowSum - arr[right - k] + arr[right];
            if (windowSum >= k * threshold) {
                count++;
            }
        }
        return count;
    }
}