/*
 * LeetCode: 1475
 * Problem: Final Prices With a Special Discount in a Shop
 * Difficulty: Easy
 *
 * Description:
 * Given an array of prices, for each price,
 * find the first price to its right that is
 * less than or equal to it.
 *
 * The final price is:
 * price - discount
 *
 * If no such discount exists, the final price
 * remains unchanged.
 *
 * Approach:
 * - Traverse the array from right to left.
 * - Use a Monotonic Increasing Stack.
 * - Remove all prices greater than the current price.
 * - The top of the stack (if any) is the discount.
 *
 * Pattern:
 * Monotonic Stack
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[prices.length];

        for (int i = prices.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() > prices[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                ans[i] = prices[i];
            } else {
                ans[i] = prices[i] - stack.peek();
            }
            stack.push(prices[i]);
        }
        return ans;
    }
}