/*
 * LeetCode: 208
 * Problem: Implement Trie (Prefix Tree)
 * Difficulty: Medium
 *
 * Pattern:
 * Trie / Prefix Tree
 *
 * Description:
 * Implement a Trie data structure that supports:
 * - Inserting a word.
 * - Searching for a complete word.
 * - Checking whether any word starts with a given prefix.
 *
 * Approach:
 * - Each Trie node contains an array of 26 children.
 * - `isEnd` marks whether a complete word ends at the node.
 * - During insertion, create missing nodes for each character.
 * - During search, traverse the Trie character by character.
 * - `search()` returns true only if the final node is marked
 *   as the end of a complete word.
 * - `startsWith()` only checks whether the prefix path exists.
 *
 * Time Complexity:
 * Insert     : O(L)
 * Search     : O(L)
 * StartsWith : O(L)
 *
 * Space Complexity: O(N × L)
 *
 * where:
 * N = number of words
 * L = length of the word or prefix
 */

class Trie {
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
}