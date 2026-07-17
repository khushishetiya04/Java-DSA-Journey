/*
 * Topic: Upper Bound using Binary Search
 *
 * Description:
 * Find the first index where the element is
 * greater than the target.
 *
 * If no such element exists, return arr.length.
 *
 * Time Complexity : O(log n)
 * Space Complexity: O(1)
 */

public class UpperBound {
    public static int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = arr.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 5, 7};
        int target = 2;

        int index = upperBound(arr, target);

        if (index != arr.length) {
            System.out.println("Upper Bound Index = " + index);
            System.out.println("Element = " + arr[index]);
        } else {
            System.out.println("Upper Bound does not exist.");
        }
    }
}