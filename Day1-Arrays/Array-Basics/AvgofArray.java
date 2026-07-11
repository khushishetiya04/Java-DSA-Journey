/*
 * Problem: Average of Array Elements
 *
 * Description:
 * Given an array of integers, find the average of all the elements
 * present in the array.
 *
 * Approach:
 * - Initialize a variable 'sum' to 0.
 * - Traverse the array and add each element to the sum.
 * - Divide the sum by the total number of elements.
 * - Print the average.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;
        System.out.println("Average of Array Elements = " + average);
    }
}