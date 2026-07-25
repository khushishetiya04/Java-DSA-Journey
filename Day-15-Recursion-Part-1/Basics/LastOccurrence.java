/*
 * Topic: Last Occurrence in Array
 *
 * Description:
 * Finds the last occurrence of a key
 * in an array using recursion.
 *
 * Approach:
 * - Recursively search till the end of the array.
 * - While returning, check if the key is found.
 * - Return the last occurrence index.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

public class LastOccurrence {
    public static int lastOccurrence(int[] arr, int key, int index) {
        if (index == arr.length) {
            return -1;
        }

        int foundIndex = lastOccurrence(arr, key, index + 1);
        if (foundIndex != -1) {
            return foundIndex;
        }

        if (arr[index] == key) {
            return index;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 6, 10};
        int key = 6;

        int index = lastOccurrence(arr, key, 0);

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Last Occurrence: " + index);
        }
    }
}