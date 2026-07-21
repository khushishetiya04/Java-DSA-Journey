/*
 * Topic: String Matching
 *
 * Description:
 * Finds the first occurrence of a pattern
 * in a given text using the Naive String
 * Matching Algorithm.
 *
 * Example:
 * Text    : "helloworld"
 * Pattern : "world"
 * Output  : Pattern found at index 5
 *
 * Time Complexity : O((n-m+1) * m)
 * Worst Case      : O(n * m)
 * Space Complexity: O(1)
 */

public class StringMatching {
    public static void main(String[] args) {
        String text = "helloworld";
        String pattern = "world";

        int index = search(text, pattern);
        if (index != -1) {
            System.out.println("Pattern found at index " + index);
        } else {
            System.out.println("Pattern not found");
        }
    }

    public static int search(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;

            while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }
}