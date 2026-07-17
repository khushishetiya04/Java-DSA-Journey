/*
 * Topic: Find Floor using Binary Search
 *
 * Description:
 * The Floor of a target is the greatest element
 * less than or equal to the target.
 *
 * If the target is smaller than every element,
 * return -1.
 *
 * Time Complexity : O(log n)
 * Space Complexity: O(1)
 */

public class Floor {
    public static int findFloor(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int floor = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }
            if (arr[mid] < target) {
                floor = arr[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return floor;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int target = 7;

        int answer = findFloor(arr, target);

        if (answer != -1) {
            System.out.println("Floor = " + answer);
        } else {
            System.out.println("Floor does not exist.");
        }
    }
}