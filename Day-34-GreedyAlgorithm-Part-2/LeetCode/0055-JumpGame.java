/*
 * LeetCode: 55. Jump Game
 *
 * Pattern: Greedy Algorithm + Reachability
 *
 * Description:
 * Given an array where nums[i] represents the maximum jump length
 * from index i, determine whether the last index can be reached.
 *
 * Greedy Idea:
 * Keep track of the farthest index that can be reached so far.
 * At every index, extend the reachable range as far as possible.
 *
 * Approach:
 * 1. Maintain the farthest reachable index.
 * 2. Traverse the array from left to right.
 * 3. If the current index is beyond the farthest reachable index,
 *    the last index cannot be reached.
 * 4. Update the farthest reachable index using i + nums[i].
 * 5. If the farthest index reaches the last index, return true.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) {
                return false;
            }

            farthest = Math.max(farthest, i + nums[i]);

            if (farthest >= nums.length - 1) {
                return true;
            }
        }
        return true;
    }
}