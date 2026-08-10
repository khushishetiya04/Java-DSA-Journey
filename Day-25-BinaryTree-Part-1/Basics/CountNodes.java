/*
 * Topic: Count Nodes in Binary Tree
 *
 * Description:
 * Count the total number of nodes present
 * in a Binary Tree.
 *
 * Approach:
 * - Use recursive DFS.
 * - If the current node is null, return 0.
 * - Count the current node as 1.
 * - Recursively count nodes in the left and
 *   right subtrees.
 *
 * Formula:
 * count = 1 + count(left) + count(right)
 *
 * Time Complexity : O(n)
 * Space Complexity: O(h)
 */

public class CountNodes {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public static void main(String[] args) {

        /*
         *          1
         *        /   \
         *       2     3
         *      / \
         *     4   5
         */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Number of Nodes: " + countNodes(root));
    }
}