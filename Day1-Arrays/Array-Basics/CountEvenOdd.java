/*
 * Problem: Count Even and Odd Numbers in an Array
 *
 * Description:
 * Given an array of integers, count the number of even and odd elements
 * present in the array.
 *
 * Approach:
 * - Initialize two variables: evenCount and oddCount.
 * - Traverse the array using a loop.
 * - Check each element using the modulo (%) operator.
 * - If the element is divisible by 2, increment evenCount.
 * - Otherwise, increment oddCount.
 * - Print both counts.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 20, 56, 13, 8};
        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even Count = " + evenCount);
        System.out.println("Odd Count = " + oddCount);
    }
}