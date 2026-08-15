/*
 * LeetCode: 14
 * Problem: Longest Common Prefix
 * Difficulty: Easy
 *
 * Pattern:
 * Trie / Prefix Matching
 *
 * Description:
 * Given an array of strings, find the longest common prefix
 * shared by all strings.
 *
 * Approach:
 * - Insert all words into a Trie.
 * - Start from the root and traverse the Trie.
 * - Continue while:
 *      1. The current node has exactly one child.
 *      2. The current node is not the end of a word.
 * - The characters traversed form the longest common prefix.
 *
 * Time Complexity : O(N × L)
 * Space Complexity: O(N × L)
 *
 * where:
 * N = number of strings
 * L = length of the shortest string
 */

class Solution {
    static class Node {
        Node[] children = new Node[26];
        boolean isEnd;
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        Node root = new Node();

        for (String str : strs) {
            Node current = root;

            for (char ch : str.toCharArray()) {
                int index = ch - 'a';

                if (current.children[index] == null) {
                    current.children[index] = new Node();
                }
                current = current.children[index];
            }
            current.isEnd = true;
        }

        StringBuilder prefix = new StringBuilder();
        Node current = root;

        while (true) {

            if (current.isEnd) {
                break;
            }
            int childCount = 0;
            int nextIndex = -1;

            for (int i = 0; i < 26; i++) {

                if (current.children[i] != null) {
                    childCount++;
                    nextIndex = i;
                }
            }

            if (childCount != 1) {
                break;
            }

            prefix.append((char) ('a' + nextIndex));
            current = current.children[nextIndex];
        }
        return prefix.toString();
    }
}