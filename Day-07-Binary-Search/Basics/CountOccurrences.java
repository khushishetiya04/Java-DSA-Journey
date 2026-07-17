/*
 * Topic: Count Occurrences using Binary Search
 *
 * Description:
 * Count the number of times a target element appears
 * in a sorted array.
 *
 * Formula:
 * Count = Last Occurrence - First Occurrence + 1
 *
 * Time Complexity : O(log n)
 * Space Complexity: O(1)
 */

public class CountOccurrences {
    public static int firstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static int countOccurrences(int[] arr, int target) {
        int first = firstOccurrence(arr, target);
        if (first == -1) {
            return 0;
        }
        int last = lastOccurrence(arr, target);
        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 6, 7, 8};
        int target = 4;

        int count = countOccurrences(arr, target);
        System.out.println("Occurrences = " + count);
    }
}