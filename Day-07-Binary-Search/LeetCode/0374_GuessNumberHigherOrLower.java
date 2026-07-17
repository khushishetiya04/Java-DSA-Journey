/*
 * LeetCode: 374
 * Problem: Guess Number Higher or Lower
 * Difficulty: Easy
 *
 * Description:
 * Guess a number between 1 and n using the provided
 * guess() API.
 *
 * API:
 * guess(num)
 *  0  -> Correct guess
 * -1  -> Your guess is higher than the picked number
 *  1  -> Your guess is lower than the picked number
 *
 * Approach:
 * - Apply Binary Search on the range [1, n].
 * - Use the guess() API to determine whether to
 *   search the left half or the right half.
 *
 * Pattern:
 * Binary Search
 *
 * Time Complexity : O(log n)
 * Space Complexity: O(1)
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = guess(mid);

            if (result == 0) {
                return mid;
            }
            if (result == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}