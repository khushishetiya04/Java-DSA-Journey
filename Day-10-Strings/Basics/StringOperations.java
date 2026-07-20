/*
 * Topic: String Operations
 *
 * Description:
 * Demonstrates the most commonly used
 * String methods in Java.
 *
 * Time Complexity:
 * length()      -> O(1)
 * charAt()      -> O(1)
 * equals()      -> O(n)
 * substring()   -> O(n)
 * contains()    -> O(n)
 * toLowerCase() -> O(n)
 * toUpperCase() -> O(n)
 * trim()        -> O(n)
 */

public class StringOperations {
    public static void main(String[] args) {

        // Creating Strings
        String str = "Hello World";

        System.out.println("Original String: " + str);

        // Length
        System.out.println("Length: " + str.length());

        // Character at Index
        System.out.println("Character at index 4: " + str.charAt(4));

        // Substring
        System.out.println("Substring(6): " + str.substring(6));
        System.out.println("Substring(0,5): " + str.substring(0, 5));

        // String Comparison
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));

        // Contains
        System.out.println("Contains \"World\": " + str.contains("World"));

        // Index Of
        System.out.println("Index of 'o': " + str.indexOf('o'));

        // Last Index Of
        System.out.println("Last Index of 'o': " + str.lastIndexOf('o'));

        // Lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // Uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Trim
        String text = "   Java Programming   ";
        System.out.println("Before Trim: \"" + text + "\"");
        System.out.println("After Trim: \"" + text.trim() + "\"");

        // isEmpty
        String empty = "";
        System.out.println("Is Empty? " + empty.isEmpty());

        // Convert to Character Array
        char[] arr = str.toCharArray();

        System.out.print("Characters: ");
        for (char ch : arr) {
            System.out.print(ch + " ");
        }

        System.out.println();

        // Traversing String
        System.out.print("Traversal: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}