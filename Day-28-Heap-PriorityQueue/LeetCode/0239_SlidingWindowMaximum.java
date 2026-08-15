/*
 * LeetCode: 239
 * Problem: Sliding Window Maximum
 * Difficulty: Hard
 *
 * Approach:
 * - Use a Monotonic Decreasing Deque.
 * - Store indices, not values.
 * - The deque always keeps indices whose values
 *   are in decreasing order.
 * - The front always contains the maximum element
 *   of the current window.
 *
 * Pattern:
 * Sliding Window + Monotonic Decreasing Deque
 *
 * Time Complexity : O(n)
 * Space Complexity: O(k)
 */

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();
        int index = 0;

        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty()
                    && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            if (i >= k - 1) {
                ans[index++] = nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}