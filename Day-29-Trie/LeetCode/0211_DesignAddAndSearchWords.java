/*
 * LeetCode: 211
 * Problem: Design Add and Search Words Data Structure
 * Difficulty: Medium
 *
 * Pattern:
 * Trie + DFS / Backtracking
 *
 * Description:
 * Design a data structure that supports:
 * - Adding words.
 * - Searching words.
 *
 * The search word may contain '.' which represents any
 * single character.
 *
 * Approach:
 * - Store all words in a Trie.
 * - Insert each word character by character.
 * - During search:
 *      - Normal character → follow that specific child.
 *      - '.' → try every existing child using DFS.
 * - Return true when the complete word is reached.
 *
 * Time Complexity:
 * addWord() : O(L)
 * search()  : O(26^L) worst case
 *
 * Space Complexity: O(N × L)
 *
 * where:
 * N = number of words
 * L = length of the word
 */

class WordDictionary {
    static class Node {
        Node[] children = new Node[26];
        boolean isEnd;
    }

    private Node root;

    public WordDictionary() {
        root = new Node();
    }

    public void addWord(String word) {
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
        return search(word, 0, root);
    }

    private boolean search(String word, int index, Node current) {

        if (index == word.length()) {
            return current.isEnd;
        }

        char ch = word.charAt(index);

        if (ch != '.') {
            int childIndex = ch - 'a';

            if (current.children[childIndex] == null) {
                return false;
            }

            return search(
                word,
                index + 1,
                current.children[childIndex]
            );
        }

        for (Node child : current.children) {
            if (child != null) {
                if (search(word, index + 1, child)) {
                    return true;
                }
            }
        }
        return false;
    }
}