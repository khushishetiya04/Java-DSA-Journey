/*
 * LeetCode: 94
 * Problem: Binary Tree Inorder Traversal
 * Difficulty: Easy
 *
 * Approach:
 * - Use a Stack to perform iterative DFS.
 * - Inorder traversal follows:
 *
 *      Left → Root → Right
 *
 * - Keep moving to the leftmost node.
 * - Process the node when there is no more
 *   left child.
 * - Then move to the right subtree.
 *
 * Pattern:
 * DFS + Stack
 *
 * Time Complexity : O(n)
 * Space Complexity: O(h)
 */

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // Go to the leftmost node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Process node
            current = stack.pop();
            result.add(current.val);

            // Move to right subtree
            current = current.right;
        }
        return result;
    }
}