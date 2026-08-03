/*
 * Topic: Monotonic Increasing Stack
 *
 * Description:
 * A Monotonic Increasing Stack stores elements
 * in increasing order from bottom to top.
 *
 * Applications:
 * - Next Smaller Element
 * - Previous Smaller Element
 * - Largest Rectangle in Histogram
 * - Trapping Rain Water
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

import java.util.Stack;
public class MonotonicIncreasingStack {
    public static void buildStack(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() > num) {
                stack.pop();
            }
            stack.push(num);
        }
        System.out.println("Monotonic Increasing Stack (Top -> Bottom):");

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