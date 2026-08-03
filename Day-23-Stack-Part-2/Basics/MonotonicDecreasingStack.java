/*
 * Topic: Monotonic Decreasing Stack
 *
 * Description:
 * A Monotonic Decreasing Stack stores elements
 * in decreasing order from bottom to top.
 *
 * Applications:
 * - Next Greater Element
 * - Previous Greater Element
 * - Stock Span Problem
 * - Daily Temperatures
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

import java.util.Stack;
public class MonotonicDecreasingStack {
    public static void buildStack(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num) {
                stack.pop();
            }
            stack.push(num);
        }
        System.out.println("Monotonic Decreasing Stack (Top -> Bottom):");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 8, 6, 3, 7};
        buildStack(nums);
    }
}