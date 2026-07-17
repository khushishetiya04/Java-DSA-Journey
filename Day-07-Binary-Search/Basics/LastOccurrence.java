/*
 * Topic: Last Occurrence using Binary Search
 *
 * Description:
 * Find the last occurrence of a target element
 * in a sorted array containing duplicate elements.
 *
 * Time Complexity : O(log n)
 * Space Complexity: O(1)
 */

public class LastOccurrence {
    public static int lastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                left = mid + 1;    // Continue searching on the right
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 6, 7, 8};
        int target = 4;

        int index = lastOccurrence(arr, target);

        if (index != -1) {
            System.out.println("Last Occurrence = " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}