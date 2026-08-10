/*
 * LeetCode: 102
 * Problem: Binary Tree Level Order Traversal
 * Difficulty: Medium
 *
 * Approach:
 * - Use BFS (Breadth First Search).
 * - Store nodes in a Queue.
 * - Process one complete level at a time.
 * - For each level, store the number of nodes
 *   currently in the queue.
 * - Process those nodes and add their children.
 *
 * Pattern:
 * BFS + Queue
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                level.add(current.val);

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}