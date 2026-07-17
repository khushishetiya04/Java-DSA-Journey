/*
 * Topic: Descending Binary Search
 *
 * Description:
 * Binary Search on an array sorted in descending order.
 * Since the array is in decreasing order, the comparison
 * conditions are reversed.
 *
 * Time Complexity : O(log n)
 * Space Complexity: O(1)
 */

public class DescendingBinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {90, 75, 60, 45, 30, 20, 10, 5};
        int target = 30;

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}