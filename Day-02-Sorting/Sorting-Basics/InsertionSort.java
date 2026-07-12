/*
 * Problem: Insertion Sort
 *
 * Description:
 * Sort an array in ascending order using the Insertion Sort algorithm.
 *
 * Approach:
 * - Consider the first element as sorted.
 * - Pick the next element as the key.
 * - Shift larger elements to the right.
 * - Insert the key into its correct position.
 *
 * Time Complexity:
 * Best Case    : O(n)
 * Average Case : O(n²)
 * Worst Case   : O(n²)
 *
 * Space Complexity: O(1)
 */

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}