/*
 * Topic: Height of Binary Tree
 *
 * Description:
 * Find the height (maximum depth) of a Binary Tree.
 *
 * Approach:
 * - If the current node is null, return 0.
 * - Recursively find the height of the left subtree.
 * - Recursively find the height of the right subtree.
 * - Take the maximum of both and add 1 for
 *   the current node.
 *
 * Formula:
 * height = 1 + max(leftHeight, rightHeight)
 *
 * Time Complexity : O(n)
 * Space Complexity: O(h)
 */

public class HeightOfTree {
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

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
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

        System.out.println("Height of Tree: " + height(root));
    }
}