/*
 * LeetCode: 1598
 * Problem: Crawler Log Folder
 * Difficulty: Easy
 *
 * Description:
 * Given a list of folder navigation logs,
 * return the minimum number of operations
 * needed to return to the main folder.
 *
 * Operations:
 * "../" -> Move to parent folder.
 * "./"  -> Stay in the current folder.
 * "x/"  -> Move into child folder.
 *
 * Approach:
 * - Use a stack to simulate folder navigation.
 * - Push folder names when moving into a folder.
 * - Pop when moving to the parent folder.
 * - Ignore current folder operations.
 *
 * Pattern:
 * Stack Simulation
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();

        for (String log : logs) {
            if (log.equals("../")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } 
            else if (log.equals("./")) {
                continue;
            }
            else {
                stack.push(log);
            }
        }
        return stack.size();
    }
}