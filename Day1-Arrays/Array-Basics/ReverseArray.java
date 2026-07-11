/*
 * Problem: Reverse an Array
 *
 * Description:
 * Given an array of integers, reverse the elements of the array in-place.
 *
 * Approach:
 * - Use two pointers: one at the beginning and one at the end.
 * - Swap the elements at both pointers.
 * - Move the left pointer forward and the right pointer backward.
 * - Continue until both pointers meet.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}