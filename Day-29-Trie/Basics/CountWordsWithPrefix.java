/*
 * Practice: Count Words With Prefix
 * Pattern: Trie + Prefix Frequency
 *
 * Description:
 * Store words in a Trie and count how many inserted words
 * start with a given prefix.
 *
 * Approach:
 * - Create a Trie Node containing children and prefixCount.
 * - While inserting a word, increase prefixCount at every
 *   node representing a character of the word.
 * - To count words with a prefix, traverse the Trie using
 *   the given prefix.
 * - The prefixCount at the final node gives the answer.
 *
 * Time Complexity:
 * Insert        : O(L)
 * Count Prefix  : O(P)
 *
 * Space Complexity: O(N × L)
 *
 * where:
 * L = length of the word
 * P = length of the prefix
 * N = number of words
 */

public class CountWordsWithPrefix {
    static class Node {
        Node[] children = new Node[26];
        int prefixCount;
    }
    static Node root = new Node();

    public static void insert(String word) {
        Node current = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (current.children[index] == null) {
                current.children[index] = new Node();
            }
            current = current.children[index];
            current.prefixCount++;
        }
    }

    public static int countWordsWithPrefix(String prefix) {
        Node current = root;

        for (char ch : prefix.toCharArray()) {
            int index = ch - 'a';

            if (current.children[index] == null) {
                return 0;
            }
            current = current.children[index];
        }
        return current.prefixCount;
    }

    public static void main(String[] args) {
        insert("apple");
        insert("app");
        insert("application");
        insert("apply");
        insert("banana");

        System.out.println(countWordsWithPrefix("app")); // 4
        System.out.println(countWordsWithPrefix("ap"));  // 4
        System.out.println(countWordsWithPrefix("ban")); // 1
        System.out.println(countWordsWithPrefix("cat")); // 0
    }
}