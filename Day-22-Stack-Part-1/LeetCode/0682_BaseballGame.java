=/*
 * LeetCode: 682
 * Problem: Baseball Game
 * Difficulty: Easy
 *
 * Description:
 * You are given a list of operations representing
 * scores in a baseball game.
 *
 * Operations:
 * - Integer : Record a new score.
 * - "+"     : Record the sum of the previous two scores.
 * - "D"     : Record double the previous score.
 * - "C"     : Remove the previous score.
 *
 * Return the sum of all valid scores.
 *
 * Approach:
 * - Use a stack to store valid scores.
 * - Process each operation based on its type.
 * - Sum all remaining elements in the stack.
 *
 * Pattern:
 * Stack Simulation
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (op.equals("+")) {
                int top = stack.pop();
                int second = stack.peek();

                stack.push(top);
                stack.push(top + second);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}