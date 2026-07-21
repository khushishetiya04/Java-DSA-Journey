/*
 * Topic: String Compression
 *
 * Description:
 * Compresses a string by replacing consecutive
 * repeated characters with the character followed
 * by its count.
 *
 * Example:
 * Input  : aaabbccccd
 * Output : a3b2c4d1
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbccccd";

        String compressed = compress(str);

        System.out.println("Original String   : " + str);
        System.out.println("Compressed String : " + compressed);
    }

    public static String compress(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1));
                sb.append(count);
                count = 1;
            }
        }

        // Add the last character and its count
        sb.append(str.charAt(str.length() - 1));
        sb.append(count);

        return sb.toString();
    }
}