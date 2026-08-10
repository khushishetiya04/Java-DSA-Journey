/*
 * LeetCode: 145
 * Problem: Binary Tree Postorder Traversal
 * Difficulty: Easy
 *
 * Approach:
 * - Use a Stack for iterative DFS.
 * - Postorder traversal follows:
 *
 *      Left → Right → Root
 *
 * - Push the root into the stack.
 * - Pop a node and add its value to the result.
 * - Push the left child first.
 * - Push the right child second.
 *
 * This gives:
 *      Root → Right → Left
 *
 * - Reverse the result to get:
 *      Left → Right → Root
 *
 * Pattern:
 * DFS + Stack
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            result.add(current.val);

            // Push left first
            if (current.left != null) {
                stack.push(current.left);
            }

            // Push right second
            if (current.right != null) {
                stack.push(current.right);
            }
        }
        Collections.reverse(result);
        return result;
    }
}