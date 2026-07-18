/*
 * Topic: ArrayList Operations
 *
 * Description:
 * Demonstrates the most commonly used
 * ArrayList methods in Java.
 *
 * Time Complexity:
 * get()        -> O(1)
 * set()        -> O(1)
 * add()        -> O(1) Amortized
 * remove()     -> O(n)
 * contains()   -> O(n)
 * size()       -> O(1)
 */

import java.util.ArrayList;
public class ArrayListOperations {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("After add(): " + list);

        // Add at a specific index
        list.add(2, 25);
        System.out.println("After add(index, element): " + list);

        // Get an element
        System.out.println("Element at index 3: " + list.get(3));

        // Update an element
        list.set(1, 15);
        System.out.println("After set(): " + list);

        // Remove by index
        list.remove(2);
        System.out.println("After remove(index): " + list);

        // Remove by value
        list.remove(Integer.valueOf(40));
        System.out.println("After remove(Object): " + list);

        // Contains
        System.out.println("Contains 30? " + list.contains(30));

        // Size
        System.out.println("Size: " + list.size());

        // isEmpty
        System.out.println("Is Empty? " + list.isEmpty());

        // Traversal using for loop
        System.out.print("Using for loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        // Traversal using enhanced for loop
        System.out.print("Using enhanced for loop: ");
        for (int num : list) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Clear the ArrayList
        list.clear();
        System.out.println("After clear(): " + list);

        // Check if empty
        System.out.println("Is Empty? " + list.isEmpty());
    }
}