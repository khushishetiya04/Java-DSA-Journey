/*
 * Practice: 127 - Word Ladder
 *
 * Pattern:
 * BFS + Shortest Path
 *
 * Description:
 * Find the length of the shortest transformation sequence from
 * beginWord to endWord.
 * Each transformation changes exactly one character and every
 * intermediate word must exist in the word list.
 *
 * Approach:
 * - Store all words from wordList in a HashSet for O(1) lookup.
 * - If endWord is not present, return 0.
 * - Use BFS because every transformation has equal cost.
 * - For each word, change every character from 'a' to 'z'.
 * - If the transformed word exists in the set, add it to the queue.
 * - Remove visited words from the set to avoid processing them again.
 * - Return the level when endWord is reached.
 *
 * Time Complexity:
 * O(N × L × 26)
 *
 * Space Complexity:
 * O(N × L)
 *
 * where:
 * N = number of words
 * L = length of each word
 */

public class Solution {
    public int ladderLength(
            String beginWord,
            String endWord,
            List<String> wordList) {

        Set<String> words = new HashSet<>(wordList);

        if (!words.contains(endWord)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        words.remove(beginWord);
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String current = queue.poll();

                if (current.equals(endWord)) {
                    return level;
                }

                char[] characters = current.toCharArray();
                for (int j = 0; j < characters.length; j++) {
                    char original = characters[j];
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        if (ch == original) {
                            continue;
                        }
                        characters[j] = ch;
                        String next = new String(characters);

                        if (words.contains(next)) {
                            words.remove(next);
                            queue.offer(next);
                        }
                    }
                    characters[j] = original;
                }
            }
            level++;
        }
        return 0;
    }
}