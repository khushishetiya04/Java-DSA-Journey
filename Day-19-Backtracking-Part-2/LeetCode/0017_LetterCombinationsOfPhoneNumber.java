/*
 * LeetCode: 17
 * Problem: Letter Combinations of a Phone Number
 * Difficulty: Medium
 *
 * Description:
 * Given a string containing digits from 2-9,
 * return all possible letter combinations
 * that the number could represent.
 *
 * Mapping:
 * 2 -> abc
 * 3 -> def
 * 4 -> ghi
 * 5 -> jkl
 * 6 -> mno
 * 7 -> pqrs
 * 8 -> tuv
 * 9 -> wxyz
 *
 * Approach:
 * - Use backtracking.
 * - For each digit, try every possible letter.
 * - Add the letter to the current string.
 * - Recur for the next digit.
 * - Backtrack by removing the last letter.
 *
 * Pattern:
 * Backtracking
 *
 * Time Complexity : O(4^n × n)
 * Space Complexity: O(n)
 */

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        String[] map = {
                "", "", "abc", "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(digits, 0, new StringBuilder(), result, map);
        return result;
    }

    private void backtrack(String digits, int index,
                           StringBuilder current,
                           List<String> result,
                           String[] map) {

        // Base Case
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        String letters = map[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {

            // Choose
            current.append(letters.charAt(i));

            // Explore
            backtrack(digits, index + 1, current, result, map);

            // Backtrack
            current.deleteCharAt(current.length() - 1);
        }
    }
}