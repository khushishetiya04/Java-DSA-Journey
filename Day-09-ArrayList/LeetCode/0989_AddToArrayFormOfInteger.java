/*
 * LeetCode: 989
 * Problem: Add to Array-Form of Integer
 * Difficulty: Easy
 *
 * Description:
 * The array-form of an integer num is given as
 * an integer array. Add the integer k to it and
 * return the resulting array-form.
 *
 * Approach:
 * - Start from the last digit of the array.
 * - Add k digit by digit while handling carry.
 * - Store digits in reverse order.
 * - Reverse the answer before returning.
 *
 * Pattern:
 * ArrayList + Simulation
 *
 * Time Complexity : O(max(n, log k))
 * Space Complexity: O(max(n, log k))
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }
            ans.add(k % 10);
            k /= 10;
        }
        Collections.reverse(ans);
        return ans;
    }
}