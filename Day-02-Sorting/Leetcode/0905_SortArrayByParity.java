/*
 * LeetCode: 905
 * Problem: Sort Array By Parity
 * Difficulty: Easy
 *
 * Description:
 * Given an integer array nums, move all the even integers to the
 * beginning of the array followed by all the odd integers.
 *
 * Return any array that satisfies this condition.
 *
 * Approach:
 * - Maintain a pointer 'place' to track the position where the next
 *   even number should be placed.
 * - Traverse the array.
 * - Whenever an even number is found, swap it with the element at
 *   'place' and increment 'place'.
 * - Return the modified array.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int place = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[place];
                nums[place] = temp;

                place++;
            }
        }
        return nums;
    }
}