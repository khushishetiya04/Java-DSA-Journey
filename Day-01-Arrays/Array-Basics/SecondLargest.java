/*
 * Problem: Second Largest Element in an Array
 *
 * Description:
 * Given an array of integers, find the second largest element present in the array.
 *
 * Approach:
 * - Initialize 'largest' and 'secondLargest' with Integer.MIN_VALUE.
 * - Traverse the array once.
 * - Update 'largest' if a greater element is found.
 * - Otherwise, update 'secondLargest' if the current element is
 *   greater than 'secondLargest' and not equal to 'largest'.
 * - Print the second largest element.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23, 56};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist.");
        } else {
            System.out.println("Second Largest Element = " + secondLargest);
        }
    }
}