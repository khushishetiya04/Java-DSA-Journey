/*
 * LeetCode: 111
 * Problem: Minimum Depth of Binary Tree
 * Difficulty: Easy
 *
 * Approach:
 * - Use BFS (Level Order Traversal).
 * - Start from the root and process nodes level by level.
 * - The first node that is a leaf gives the minimum depth.
 *
 * A leaf node has:
 *      left == null
 *      right == null
 *
 * Pattern:
 * BFS + Queue
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();

                if (current.left == null && current.right == null) {
                    return depth;
                }

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            depth++;
        }
        return depth;
    }
}