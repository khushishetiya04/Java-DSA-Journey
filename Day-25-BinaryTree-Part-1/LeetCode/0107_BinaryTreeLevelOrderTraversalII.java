/*
 * LeetCode: 107
 * Problem: Binary Tree Level Order Traversal II
 * Difficulty: Medium
 *
 * Approach:
 * - Use BFS with a Queue.
 * - Traverse the tree level by level.
 * - Store each level in the result.
 * - Reverse the result at the end to get
 *   bottom-up level order.
 *
 * Pattern:
 * BFS + Queue
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
        Collections.reverse(result);
        return result;
    }
}