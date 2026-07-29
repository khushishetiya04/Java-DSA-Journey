/*
 * LeetCode: 131
 * Problem: Palindrome Partitioning
 * Difficulty: Medium
 *
 * Description:
 * Given a string s, partition s such that every
 * substring of the partition is a palindrome.
 *
 * Return all possible palindrome partitions.
 *
 * Approach:
 * - Start from index 0.
 * - Generate every possible substring.
 * - If the substring is a palindrome:
 *      1. Choose it.
 *      2. Recur for the remaining string.
 *      3. Backtrack.
 *
 * Pattern:
 * Backtracking
 *
 * Time Complexity : O(n × 2^n)
 * Space Complexity: O(n)
 */

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();

        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start,
                           List<String> current,
                           List<List<String>> result) {

        // Base Case
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int end = start; end < s.length(); end++) {

            // Skip if not palindrome
            if (!isPalindrome(s, start, end)) {
                continue;
            }

            // Choose
            current.add(s.substring(start, end + 1));

            // Explore
            backtrack(s, end + 1, current, result);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}