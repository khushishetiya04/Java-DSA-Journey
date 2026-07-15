/*
 * LeetCode: 2389
 * Problem: Longest Subsequence With Limited Sum
 * Difficulty: Easy
 *
 * Description:
 * Given an integer array nums and an array of queries,
 * return an array where answer[i] is the maximum size
 * of a subsequence whose sum is less than or equal to queries[i].
 *
 * Approach:
 * - Sort the array.
 * - Convert the array into a Prefix Sum array.
 * - For each query, use Binary Search to find the largest
 *   prefix sum less than or equal to the query.
 * - The index found + 1 gives the maximum subsequence length.
 *
 * Pattern:
 * Sorting + Prefix Sum + Binary Search
 *
 * Time Complexity:
 * O(n log n + m log n)
 *
 * Space Complexity:
 * O(1) (excluding output array)
 */

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length;
        int m = queries.length;
        Arrays.sort(nums);

        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {

            int left = 0;
            int right = n - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == queries[i]) {
                    ans[i] = mid + 1;
                    break;
                }
                else if (nums[mid] < queries[i]) {
                    ans[i] = mid + 1;
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }
        return ans;
    }
}