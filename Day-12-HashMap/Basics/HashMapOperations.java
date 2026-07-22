/*
 * Topic: HashMap Operations
 *
 * Description:
 * Demonstrates the commonly used operations
 * of Java HashMap.
 *
 * Operations Covered:
 * - put()
 * - get()
 * - remove()
 * - containsKey()
 * - containsValue()
 * - size()
 * - isEmpty()
 * - replace()
 * - clear()
 *
 * Time Complexity:
 * put()          -> O(1) Average
 * get()          -> O(1) Average
 * remove()       -> O(1) Average
 * containsKey()  -> O(1) Average
 * containsValue()-> O(n)
 */

import java.util.HashMap;
public class HashMapOperations {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Insert
        map.put(101, "Khushi");
        map.put(102, "Rahul");
        map.put(103, "Ankit");

        System.out.println("After put():");
        System.out.println(map);

        // Get
        System.out.println("\nValue of key 102:");
        System.out.println(map.get(102));

        // Update
        map.put(102, "Rohan");

        System.out.println("\nAfter update:");
        System.out.println(map);

        // Replace
        map.replace(103, "Priya");

        System.out.println("\nAfter replace():");
        System.out.println(map);

        // containsKey()
        System.out.println("\nContains key 101?");
        System.out.println(map.containsKey(101));

        // containsValue()
        System.out.println("\nContains value 'Priya'?");
        System.out.println(map.containsValue("Priya"));

        // Remove
        map.remove(101);

        System.out.println("\nAfter remove():");
        System.out.println(map);

        // Size
        System.out.println("\nSize:");
        System.out.println(map.size());

        // isEmpty()
        System.out.println("\nIs Empty?");
        System.out.println(map.isEmpty());

        // Clear
        map.clear();

        System.out.println("\nAfter clear():");
        System.out.println(map);

        System.out.println("\nIs Empty?");
        System.out.println(map.isEmpty());
    }
}