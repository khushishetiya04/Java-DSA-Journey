/*
 * Problem: Sum of Array Elements
 *
 * Description:
 * Given an array of integers, find the sum of all the elements present in the array.
 *
 * Approach:
 * - Initialize a variable 'sum' to 0.
 * - Traverse the array using a loop.
 * - Add each element to the sum.
 * - Print the final sum.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        System.out.println("Sum of Array Elements = " + sum);
    }
}