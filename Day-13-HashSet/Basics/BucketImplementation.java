/*
 * Topic: Bucket Implementation of HashSet
 *
 * Description:
 * Demonstrates how a HashSet works internally
 * using buckets (Separate Chaining).
 *
 * Operations Covered:
 * - add()
 * - remove()
 * - contains()
 * - display()
 *
 * Time Complexity:
 * add()      -> O(1) Average
 * remove()   -> O(1) Average
 * contains() -> O(1) Average
 */

import java.util.LinkedList;
public class BucketImplementation {
    private static final int SIZE = 10;
    
    @SuppressWarnings("unchecked")
    LinkedList<Integer>[] buckets = new LinkedList[SIZE];

    public BucketImplementation() {
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // Hash Function
    private int hash(int key) {
        return key % SIZE;
    }

    // Add Element
    public void add(int key) {
        int index = hash(key);

        if (!buckets[index].contains(key)) {
            buckets[index].add(key);
        }
    }

    // Remove Element
    public void remove(int key) {
        int index = hash(key);
        buckets[index].remove(Integer.valueOf(key));
    }

    // Search Element
    public boolean contains(int key) {
        int index = hash(key);
        return buckets[index].contains(key);
    }

    // Display Buckets
    public void display() {
        System.out.println("Bucket Contents:");

        for (int i = 0; i < SIZE; i++) {
            System.out.println(i + " -> " + buckets[i]);
        }
    }

    public static void main(String[] args) {

        BucketImplementation set = new BucketImplementation();

        set.add(10);
        set.add(20);
        set.add(15);
        set.add(25);
        set.add(35);
        set.add(12);

        set.display();

        System.out.println("\nContains 25? " + set.contains(25));

        set.remove(25);

        System.out.println("\nAfter Removing 25:");
        set.display();
    }
}