/*
 * Practice: Count Words in Trie
 * Pattern: Trie + Word Frequency
 *
 * Description:
 * Store words in a Trie and count how many times
 * a complete word has been inserted.
 *
 * Approach:
 * - Create a Trie Node containing children and wordCount.
 * - Traverse the Trie character by character while inserting.
 * - At the end of the word, increment wordCount.
 * - To count a word, traverse the Trie again.
 * - Return the wordCount stored at the final node.
 *
 * Time Complexity:
 * Insert  : O(L)
 * Count   : O(L)
 *
 * Space Complexity: O(N × L)
 *
 * where:
 * L = length of the word
 * N = number of words
 */

public class CountWordsInTrie {
    static class Node {
        Node[] children = new Node[26];
        int wordCount;
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
        }
        current.wordCount++;
    }
    
    public static int countWords(String word) {
        Node current = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (current.children[index] == null) {
                return 0;
            }
            current = current.children[index];
        }
        return current.wordCount;
    }

    public static void main(String[] args) {
        insert("apple");
        insert("apple");
        insert("app");
        insert("banana");

        System.out.println(countWords("apple"));   // 2
        System.out.println(countWords("app"));     // 1
        System.out.println(countWords("banana"));  // 1
        System.out.println(countWords("bat"));     // 0
    }
}