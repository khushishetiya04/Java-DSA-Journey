/*
 * Topic: Prefix and Suffix
 *
 * Description:
 * Demonstrates how to find prefixes and suffixes
 * of a string using the substring() method.
 *
 * Time Complexity:
 * O(n²) (printing all prefixes and suffixes)
 *
 * Space Complexity:
 * O(1)
 */

public class PrefixSuffix {
    public static void main(String[] args) {
        String str = "Programming";
        System.out.println("String: " + str);

        // Print all Prefixes
        System.out.println("\nPrefixes:");
        for (int i = 1; i <= str.length(); i++) {
            System.out.println(str.substring(0, i));
        }

        // Print all Suffixes
        System.out.println("\nSuffixes:");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(i));
        }
    }
}