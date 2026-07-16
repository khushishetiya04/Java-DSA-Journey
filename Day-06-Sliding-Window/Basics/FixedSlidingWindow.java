/*
 * Topic: Fixed Sliding Window
 *
 * Description:
 * A Fixed Sliding Window maintains a window of constant size (k)
 * while traversing the array.
 *
 * Approach:
 * 1. Build the first window of size k.
 * 2. Store its result.
 * 3. Slide the window:
 *      - Remove the leftmost element.
 *      - Add the next right element.
 * 4. Update the answer.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class FixedSlidingWindow {
    public static int maxSumSubarray(int[] nums, int k) {
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        int maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i];
            windowSum -= nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int answer = maxSumSubarray(nums, k);
        System.out.println("Maximum Sum = " + answer);
    }
}