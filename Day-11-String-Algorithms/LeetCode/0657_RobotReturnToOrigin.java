/*
 * LeetCode: 657
 * Problem: Robot Return to Origin
 * Difficulty: Easy
 *
 * Description:
 * There is a robot starting at the origin (0, 0).
 * Given a string moves consisting of:
 * 'U', 'D', 'L', and 'R',
 * determine if the robot returns to the origin
 * after performing all the moves.
 *
 * Approach:
 * - Keep track of vertical and horizontal movement.
 * - Increment for 'U' and 'R'.
 * - Decrement for 'D' and 'L'.
 * - If both values become 0, the robot
 *   returns to the origin.
 *
 * Pattern:
 * String Traversal + Simulation
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean judgeCircle(String moves) {
        int up = 0;
        int right = 0;

        for (int i = 0; i < moves.length(); i++) {
            char ch = moves.charAt(i);

            if (ch == 'U') {
                up++;
            } else if (ch == 'D') {
                up--;
            } else if (ch == 'R') {
                right++;
            } else {
                right--;
            }
        }
        return up == 0 && right == 0;
    }
}