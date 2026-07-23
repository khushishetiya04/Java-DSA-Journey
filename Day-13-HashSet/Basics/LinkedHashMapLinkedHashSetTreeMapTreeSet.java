/*
 * Topic: LinkedHashMap, LinkedHashSet, TreeMap & TreeSet
 *
 * Definitions:
 *
 * LinkedHashMap:
 * - Stores key-value pairs.
 * - Maintains insertion order.
 * - Allows one null key and multiple null values.
 *
 * LinkedHashSet:
 * - Stores unique elements.
 * - Maintains insertion order.
 * - Allows one null element.
 *
 * TreeMap:
 * - Stores key-value pairs in sorted order of keys.
 * - Does not allow null keys.
 * - Implemented using Red-Black Tree.
 *
 * TreeSet:
 * - Stores unique elements in sorted order.
 * - Does not allow null elements.
 * - Implemented using Red-Black Tree.
 */

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
public class LinkedHashMapLinkedHashSetTreeMapTreeSet {
    public static void main(String[] args) {

        // LinkedHashMap
        System.out.println("LinkedHashMap:");

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(3, "C");
        linkedHashMap.put(1, "A");
        linkedHashMap.put(2, "B");

        System.out.println(linkedHashMap);

        // LinkedHashSet
        System.out.println("\nLinkedHashSet:");

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(30);
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(10);

        System.out.println(linkedHashSet);

        // TreeMap
        System.out.println("\nTreeMap:");

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "C");
        treeMap.put(1, "A");
        treeMap.put(2, "B");

        System.out.println(treeMap);

        // TreeSet
        System.out.println("\nTreeSet:");

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(10);

        System.out.println(treeSet);
    }
}