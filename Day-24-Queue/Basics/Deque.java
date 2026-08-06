/*
 * Topic: Deque (Double Ended Queue)
 *
 * Description:
 * A Deque (Double Ended Queue) allows insertion
 * and deletion from both the front and rear.
 *
 * Java provides ArrayDeque as the implementation.
 *
 * Operations:
 * - addFirst()
 * - addLast()
 * - removeFirst()
 * - removeLast()
 * - peekFirst()
 * - peekLast()
 * - isEmpty()
 *
 * Time Complexity:
 * addFirst()    : O(1)
 * addLast()     : O(1)
 * removeFirst() : O(1)
 * removeLast()  : O(1)
 * peekFirst()   : O(1)
 * peekLast()    : O(1)
 *
 * Space Complexity: O(n)
 */

import java.util.ArrayDeque;
import java.util.Deque;
public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // Insert at both ends
        deque.addFirst(20);
        deque.addFirst(10);
        deque.addLast(30);
        deque.addLast(40);

        System.out.println("Deque: " + deque);

        // Peek
        System.out.println("Front: " + deque.peekFirst());
        System.out.println("Rear : " + deque.peekLast());

        // Remove from both ends
        System.out.println("Removed Front: " + deque.removeFirst());
        System.out.println("Removed Rear : " + deque.removeLast());

        System.out.println("Deque After Removal: " + deque);

        System.out.println("Is Empty: " + deque.isEmpty());
    }
}