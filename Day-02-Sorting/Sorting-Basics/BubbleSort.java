/*
 * Problem: Bubble Sort
 *
 * Description:
 * Sort an array in ascending order using the Bubble Sort algorithm.
 *
 * Approach:
 * - Compare adjacent elements.
 * - Swap them if they are in the wrong order.
 * - Repeat the process until the array becomes sorted.
 *
 * Time Complexity:
 * Best Case    : O(n)
 * Average Case : O(n²)
 * Worst Case   : O(n²)
 *
 * Space Complexity: O(1)
 */

import java.util.Arrays;
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        bubbleSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}