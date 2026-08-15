/*
 * LeetCode: 692
 * Problem: Top K Frequent Words
 * Difficulty: Medium
 *
 * Approach:
 * 1. Count frequency of every word using HashMap.
 * 2. Use a Min Heap of size k.
 * 3. Compare words by:
 *      - Lower frequency comes first.
 *      - If frequencies are equal, lexicographically larger
 *        word comes first so it gets removed first.
 * 4. Keep only K most important words.
 * 5. Extract from heap in reverse order.
 *
 * Pattern:
 * HashMap + Min Heap + Top K + Custom Comparator
 *
 * Time Complexity : O(n log k)
 * Space Complexity: O(n)
 */

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>(
            (a, b) -> {
                if (!map.get(a).equals(map.get(b))) {
                    return map.get(a) - map.get(b);
                }

                return b.compareTo(a);
            }
        );

        for (String word : map.keySet()) {
            pq.offer(word);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<String> result = new ArrayList<>();

        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }

        Collections.reverse(result);
        return result;
    }
}