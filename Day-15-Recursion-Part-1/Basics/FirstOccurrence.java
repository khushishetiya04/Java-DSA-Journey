/*
 * Topic: First Occurrence in Array
 *
 * Description:
 * Finds the first occurrence of a key
 * in an array using recursion.
 *
 * Approach:
 * - Check the current index.
 * - If the key is found, return the index.
 * - Otherwise, recursively search the
 *   remaining array.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

public class FirstOccurrence {
    public static int firstOccurrence(int[] arr, int key, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == key) {
            return index;
        }
        return firstOccurrence(arr, key, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 6, 10};
        int key = 6;

        int index = firstOccurrence(arr, key, 0);

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("First Occurrence: " + index);
        }
    }
}