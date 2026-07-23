/*
 * Topic: HashSet Operations
 *
 * Description:
 * Demonstrates the commonly used operations
 * of Java HashSet.
 *
 * Operations Covered:
 * - add()
 * - remove()
 * - contains()
 * - size()
 * - isEmpty()
 * - clear()
 * - iteration
 *
 * Time Complexity:
 * add()      -> O(1) Average
 * remove()   -> O(1) Average
 * contains() -> O(1) Average
 */

import java.util.HashSet;
public class HashSetOperations {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Add Elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(20);   // Duplicate (Ignored)

        System.out.println("After add():");
        System.out.println(set);

        // Contains
        System.out.println("\nContains 20?");
        System.out.println(set.contains(20));

        // Remove
        set.remove(30);

        System.out.println("\nAfter remove(30):");
        System.out.println(set);

        // Size
        System.out.println("\nSize:");
        System.out.println(set.size());

        // Iterate
        System.out.println("\nIterating HashSet:");

        for (Integer num : set) {
            System.out.println(num);
        }

        // isEmpty
        System.out.println("\nIs Empty?");
        System.out.println(set.isEmpty());

        // Clear
        set.clear();

        System.out.println("\nAfter clear():");
        System.out.println(set);

        // isEmpty
        System.out.println("\nIs Empty?");
        System.out.println(set.isEmpty());
    }
}