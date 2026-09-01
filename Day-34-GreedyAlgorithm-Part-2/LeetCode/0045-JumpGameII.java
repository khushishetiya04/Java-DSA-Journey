/*
 * LeetCode: 45. Jump Game II
 *
 * Pattern: Greedy Algorithm + Range Expansion
 *
 * Description:
 * Given an array where nums[i] represents the maximum jump length
 * from index i, find the minimum number of jumps needed to reach
 * the last index.
 *
 * Greedy Idea:
 * For every jump, consider all positions that can be reached with
 * the current jump and choose the position that allows us to reach
 * the farthest in the next jump.
 *
 * Approach:
 * 1. Maintain the current range that can be reached with the current
 *    number of jumps.
 * 2. Track the farthest index that can be reached from this range.
 * 3. When we reach the end of the current range, increase the jump count.
 * 4. Set the new range to the farthest reachable index.
 * 5. Repeat until the last index is reached.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }
}