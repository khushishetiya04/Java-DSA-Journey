/*
 * Topic: Create Binary Search Tree
 *
 * Description:
 * Creates a Binary Search Tree by inserting
 * values one by one.
 *
 * BST Property:
 * - Left subtree  → smaller values
 * - Right subtree → greater values
 */

public class CreateBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert a value into the BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Inorder traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] values = {8, 5, 3, 6, 10, 11, 14};

        Node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("Inorder Traversal:");
        inorder(root);
    }
}