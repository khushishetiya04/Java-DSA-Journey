/*
 * LeetCode: 202
 * Problem: Happy Number
 * Difficulty: Easy
 *
 * Description:
 * Write an algorithm to determine if a number n
 * is a happy number.
 *
 * A happy number is defined by repeatedly replacing
 * the number with the sum of the squares of its digits
 * until it becomes 1.
 *
 * If the process enters a cycle that does not include 1,
 * the number is not happy.
 *
 * Approach:
 * - Use a HashSet to store previously seen numbers.
 * - Repeatedly calculate the sum of the squares
 *   of the digits.
 * - If the number becomes 1, return true.
 * - If the number repeats, a cycle exists,
 *   so return false.
 *
 * Pattern:
 * HashSet (Cycle Detection)
 *
 * Time Complexity : O(log n)
 * Space Complexity: O(log n)
 */

import java.util.HashSet;
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}