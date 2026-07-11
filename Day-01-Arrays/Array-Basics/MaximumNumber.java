/*
 * Problem: Maximum Number in an Array
 *
 * Description:
 * Given an array of integers, find the maximum element present in the array.
 *
 * Approach:
 * - Initialize the first element as the maximum.
 * - Traverse the array from the second element.
 * - If the current element is greater than the maximum,
 *   update the maximum.
 * - Print the maximum element.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class MaximumNumber {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23, 56};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum Element = " + max);
    }
}