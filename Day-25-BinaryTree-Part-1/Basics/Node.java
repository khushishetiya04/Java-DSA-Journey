/*
 * Topic: Binary Tree Node
 *
 * Description:
 * A Node represents a single element of a
 * Binary Tree.
 *
 * Each node contains:
 * - data
 * - reference to left child
 * - reference to right child
 */

public class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}