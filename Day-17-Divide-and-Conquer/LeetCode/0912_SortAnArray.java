/*
 * LeetCode: 912
 * Problem: Sort an Array
 * Difficulty: Medium
 *
 * Description:
 * Given an array of integers, sort the array
 * in ascending order.
 *
 * Approach:
 * - Use Merge Sort (Divide and Conquer).
 * - Divide the array into two halves.
 * - Recursively sort both halves.
 * - Merge the sorted halves.
 *
 * Pattern:
 * Divide & Conquer
 *
 * Time Complexity : O(n log n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    private void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = start; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
}