/*
 * LeetCode: 443
 * Problem: String Compression
 * Difficulty: Medium
 *
 * Description:
 * Compress the given character array in-place.
 * For consecutive repeating characters, store
 * the character followed by its count.
 * Return the new length of the compressed array.
 *
 * Approach:
 * - Use two pointers:
 *   1. read  -> traverses the array.
 *   2. write -> writes the compressed result.
 * - Count consecutive occurrences of each character.
 * - Write the character.
 * - If count > 1, write each digit of the count.
 *
 * Pattern:
 * Two Pointers
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int read = 0;

        while (read < chars.length) {
            char current = chars[read];
            int count = 0;

            while (read < chars.length && chars[read] == current) {
                read++;
                count++;
            }
            chars[write++] = current;
            if (count > 1) {
                String str = Integer.toString(count);

                for (char ch : str.toCharArray()) {
                    chars[write++] = ch;
                }
            }
        }
        return write;
    }
}