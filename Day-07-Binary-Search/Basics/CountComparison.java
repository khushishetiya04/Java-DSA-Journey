/*
 * Topic: Count Comparisons in Binary Search
 *
 * Description:
 * Perform Binary Search and count how many comparisons
 * are made before the target is found (or the search ends).
 *
 * Time Complexity : O(log n)
 * Space Complexity: O(1)
 */

public class CountComparisons {
    public static int countComparisons(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int comparisons = 0;

        while (left <= right) {
            comparisons++;

            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                return comparisons;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Element not found.");
        return comparisons;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72};
        int target = 23;

        int comparisons = countComparisons(arr, target);
        System.out.println("Comparisons: " + comparisons);
    }
}