/*
 * LeetCode: 144
 * Problem: Binary Tree Preorder Traversal
 * Difficulty: Easy
 *
 * Approach:
 * - Use a Stack to perform iterative DFS.
 * - Preorder traversal follows:
 *
 *      Root → Left → Right
 *
 * - Push the root into the stack.
 * - Pop a node and add its value to the result.
 * - Push the right child first.
 * - Push the left child second.
 *
 * Since Stack is LIFO, the left child is processed first.
 *
 * Pattern:
 * DFS + Stack
 *
 * Time Complexity : O(n)
 * Space Complexity: O(h)
 */

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            result.add(current.val);

            // Push right first
            if (current.right != null) {
                stack.push(current.right);
            }

            // Push left second
            if (current.left != null) {
                stack.push(current.left);
            }
        }
        return result;
    }
}