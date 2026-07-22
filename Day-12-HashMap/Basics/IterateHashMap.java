/*
 * Topic: Iterate HashMap
 *
 * Description:
 * Demonstrates different ways to iterate
 * through a HashMap.
 *
 * Methods Covered:
 * - keySet()
 * - values()
 * - entrySet()
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

import java.util.HashMap;
import java.util.Map;
public class IterateHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Khushi");
        map.put(102, "Rahul");
        map.put(103, "Priya");
        map.put(104, "Ankit");

        // Iterate using keySet()
        System.out.println("Using keySet():");

        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // Iterate using values()
        System.out.println("\nUsing values():");

        for (String value : map.values()) {
            System.out.println(value);
        }

        // Iterate using entrySet()
        System.out.println("\nUsing entrySet():");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}