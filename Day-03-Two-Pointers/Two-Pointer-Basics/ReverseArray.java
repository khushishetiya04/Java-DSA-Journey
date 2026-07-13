/*
 * Problem: Reverse Array
 *
 * Description:
 * Reverse the elements of an array in-place using the
 * Two Pointer technique.
 *
 * Approach:
 * - Initialize two pointers:
 *   - left at the beginning of the array.
 *   - right at the end of the array.
 * - Swap the elements at both pointers.
 * - Move left forward and right backward.
 * - Continue until both pointers meet.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

import java.util.Arrays;
public class ReverseArray {
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverse(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}