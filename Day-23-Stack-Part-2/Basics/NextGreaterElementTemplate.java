/*
 * Topic: Next Greater Element Template
 *
 * Description:
 * For every element in the array,
 * find the first greater element on its right.
 * If no greater element exists, return -1.
 *
 * Approach:
 * - Traverse the array from right to left.
 * - Maintain a Monotonic Decreasing Stack.
 * - Remove all elements smaller than or equal
 *   to the current element.
 * - The stack's top (if any) is the Next Greater Element.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

import java.util.Arrays;
import java.util.Stack;
public class NextGreaterElementTemplate {
    public static int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 3, 6, 4};

        System.out.println("Input : " + Arrays.toString(nums));

        int[] ans = nextGreaterElement(nums);

        System.out.println("Output: " + Arrays.toString(ans));
    }
}