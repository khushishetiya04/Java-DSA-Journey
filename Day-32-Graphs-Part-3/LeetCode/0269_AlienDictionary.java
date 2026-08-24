/*
 * Practice: LeetCode 269 - Alien Dictionary
 *
 * Pattern: Graph + Topological Sort + Kahn's Algorithm
 *
 * Description:
 * Given a sorted list of words from an alien language, determine the
 * ordering of characters in the alien alphabet.
 *
 * Approach:
 * 1. Create a graph containing all characters.
 * 2. Compare every pair of adjacent words.
 * 3. The first different character gives a directed edge:
 *      word1[i] -> word2[i]
 * 4. Calculate indegree of every character.
 * 5. Apply Kahn's Algorithm.
 * 6. If all characters are processed, return the ordering.
 * 7. Detect invalid prefix cases and cycles.
 *
 * Important:
 * If:
 *      "abc"
 *      "ab"
 *
 * the order is invalid because a longer word appears before its prefix.
 *
 * Time Complexity: O(C)
 * Space Complexity: O(1)
 *
 * C = total number of characters in all words.
 */

class Solution {
    public String alienOrder(String[] words) {
        Map<Character, List<Character>> graph =
                new HashMap<>();

        Map<Character, Integer> indegree =
                new HashMap<>();

        // Add every character
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                graph.putIfAbsent(ch, new ArrayList<>());
                indegree.putIfAbsent(ch, 0);
            }
        }

        // Compare adjacent words
        for (int i = 0; i < words.length - 1; i++) {
            String first = words[i];
            String second = words[i + 1];

            int minLength =
                    Math.min(first.length(), second.length());

            boolean foundDifference = false;

            for (int j = 0; j < minLength; j++) {
                char ch1 = first.charAt(j);
                char ch2 = second.charAt(j);

                if (ch1 != ch2) {
                    graph.get(ch1).add(ch2);
                    indegree.put(
                        ch2,
                        indegree.get(ch2) + 1
                    );

                    foundDifference = true;
                    break;
                }
            }

            // Invalid prefix case
            if (!foundDifference &&
                first.length() > second.length()) {
                return "";
            }
        }

        Queue<Character> queue =
                new LinkedList<>();

        // Characters with indegree 0
        for (char ch : indegree.keySet()) {

            if (indegree.get(ch) == 0) {
                queue.offer(ch);
            }
        }

        StringBuilder result =
                new StringBuilder();

        // Kahn's Algorithm
        while (!queue.isEmpty()) {
            char current = queue.poll();
            result.append(current);

            for (char neighbor : graph.get(current)) {

                indegree.put(
                    neighbor,
                    indegree.get(neighbor) - 1
                );

                if (indegree.get(neighbor) == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        // Cycle detected
        if (result.length() != indegree.size()) {
            return "";
        }
        return result.toString();
    }
}