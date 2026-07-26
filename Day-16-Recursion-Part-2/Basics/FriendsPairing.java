/*
 * Topic: Friends Pairing Problem
 *
 * Description:
 * Given n friends, each friend can remain single
 * or be paired up with one of the remaining friends.
 * Find the total number of possible ways.
 *
 * Recurrence Relation:
 * f(n) = f(n - 1) + (n - 1) * f(n - 2)
 *
 * Explanation:
 * 1. One friend stays single:
 *      f(n - 1)
 *
 * 2. One friend pairs with any of the remaining
 *    (n - 1) friends:
 *      (n - 1) * f(n - 2)
 *
 * Base Cases:
 * f(1) = 1
 * f(2) = 2
 *
 * Time Complexity : O(2^n)
 * Space Complexity: O(n)
 */

public class FriendsPairing {
    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // One friend stays single
        int single = friendsPairing(n - 1);

        // One friend pairs with remaining friends
        int pair = (n - 1) * friendsPairing(n - 2);
        return single + pair;
    }

    public static void main(String[] args) {
        int n = 4;

        System.out.println("Total Ways: " + friendsPairing(n));
    }
}