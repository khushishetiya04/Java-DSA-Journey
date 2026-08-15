/*
 * Practice: Trie Implementation
 * Pattern: Trie / Prefix Tree
 *
 * Description:
 * Implement a basic Trie data structure that supports
 * inserting words, searching complete words, and checking
 * whether any word starts with a given prefix.
 *
 * Approach:
 * - Each Trie Node contains an array of 26 children.
 * - Each node also stores whether a complete word ends there.
 * - Insert by traversing character by character.
 * - Search by following the characters of the word.
 * - Prefix search checks whether the complete prefix path exists.
 *
 * Time Complexity:
 * Insert      : O(L)
 * Search      : O(L)
 * StartsWith  : O(L)
 *
 * Space Complexity: O(N × L)
 *
 * where:
 * L = length of the word
 * N = number of words
 */

public class Trie {
    static class Node {
        Node[] children = new Node[26];
        boolean isEnd;
    }

    private Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node current = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (current.children[index] == null) {
                current.children[index] = new Node();
            }
            current = current.children[index];
        }
        current.isEnd = true;
    }


    public boolean search(String word) {
        Node current = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return current.isEnd;
    }

    public boolean startsWith(String prefix) {
        Node current = root;

        for (char ch : prefix.toCharArray()) {
            int index = ch - 'a';

            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("app");
        trie.insert("banana");

        System.out.println(trie.search("apple"));      // true
        System.out.println(trie.search("app"));        // true
        System.out.println(trie.search("appl"));       // false

        System.out.println(trie.startsWith("app"));    // true
        System.out.println(trie.startsWith("ban"));    // true
        System.out.println(trie.startsWith("cat"));    // false
    }
}