/*
 * Topic: Variable Sliding Window
 *
 * Description:
 * A Variable Sliding Window does not have a fixed size.
 * The window expands by moving the right pointer and
 * shrinks by moving the left pointer whenever a condition
 * is satisfied or violated.
 *
 * Example:
 * Find the minimum length subarray whose sum is
 * greater than or equal to a target.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class VariableSlidingWindow {
    public static int minSubarrayLength(int[] nums, int target) {
        int left = 0;
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            windowSum += nums[right];

            while (windowSum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                windowSum -= nums[left];
                left++;
            }
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int answer = minSubarrayLength(nums, target);
        System.out.println("Minimum Length = " + answer);
    }
}