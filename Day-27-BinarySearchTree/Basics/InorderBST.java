/*
 * Topic: Inorder Traversal of Binary Search Tree
 *
 * Inorder Traversal:
 * Left → Root → Right
 *
 * Important BST Property:
 * Inorder traversal of a valid BST
 * gives values in sorted order.
 */

public class InorderBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);

        System.out.print(root.data + " ");

        inorder(root.right);
    }

    public static void main(String[] args) {

        /*
         *          8
         *        /   \
         *       5     10
         *      / \      \
         *     3   6      11
         */

        Node root = new Node(8);

        root.left = new Node(5);
        root.right = new Node(10);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right.right = new Node(11);

        System.out.println("Inorder Traversal:");

        inorder(root);
    }
}