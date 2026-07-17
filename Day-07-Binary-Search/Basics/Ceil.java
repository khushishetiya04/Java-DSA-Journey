/*
 * Topic: Find Ceil using Binary Search
 *
 * Description:
 * The Ceil of a target is the smallest element
 * greater than or equal to the target.
 *
 * If the target is larger than every element,
 * return -1.
 *
 * Time Complexity : O(log n)
 * Space Complexity: O(1)
 */

public class Ceil {
    public static int findCeil(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ceil = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                ceil = arr[mid];
                right = mid - 1;
            }
        }
        return ceil;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int target = 7;

        int answer = findCeil(arr, target);

        if (answer != -1) {
            System.out.println("Ceil = " + answer);
        } else {
            System.out.println("Ceil does not exist.");
        }
    }
}