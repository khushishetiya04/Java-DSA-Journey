/*
 * LeetCode: 763. Partition Labels
 *
 * Pattern: Greedy Algorithm + Last Occurrence
 *
 * Description:
 * Given a string, partition it into as many parts as possible so that
 * each letter appears in at most one part.
 *
 * Greedy Idea:
 * For every character in the current partition, extend the partition
 * up to its last occurrence. Once the current index reaches this
 * boundary, the partition can safely end.
 *
 * Approach:
 * 1. Store the last occurrence of every character.
 * 2. Traverse the string from left to right.
 * 3. For the current character, update the end of the partition
 *    using its last occurrence.
 * 4. When the current index reaches the partition end:
 *      - Add the partition length to the result.
 *      - Start a new partition.
 * 5. Return all partition sizes.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];

        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        List<Integer> result = new ArrayList<>();
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);

            if (i == end) {
                result.add(end - start + 1);
                start = i + 1;
            }
        }
        return result;
    }
}