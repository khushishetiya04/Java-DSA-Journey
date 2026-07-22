/*
 * Topic: Frequency Count using HashMap
 *
 * Description:
 * Counts the frequency of integers and
 * characters using a HashMap.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

import java.util.HashMap;
public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 2, 5, 1};

        HashMap<Integer, Integer> intMap = new HashMap<>();

        for (int num : arr) {
            intMap.put(num, intMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Integer Frequency:");
        System.out.println(intMap);

        // Character Frequency
        String str = "programming";

        HashMap<Character, Integer> charMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }
        
        System.out.println("\nCharacter Frequency:");
        System.out.println(charMap);
    }
}