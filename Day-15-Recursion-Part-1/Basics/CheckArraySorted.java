/*
 * Topic: Check if Array is Sorted
 *
 * Description:
 * Checks whether an array is sorted in
 * ascending order using recursion.
 *
 * Approach:
 * - Compare current element with the next element.
 * - If any element is greater than the next,
 *   the array is not sorted.
 * - Otherwise, recursively check the remaining array.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

public class CheckArraySorted {
    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        if (isSorted(arr, 0)) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is Not Sorted");
        }
    }
}