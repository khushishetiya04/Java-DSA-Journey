/*
 * LeetCode: 31. Next Permutation
 *
 * Pattern: Greedy Algorithm + Array
 *
 * Description:
 * Given an array of integers, rearrange it into the next greater
 * lexicographical permutation.
 *
 * If the next greater permutation does not exist, rearrange the
 * array into the lowest possible order.
 *
 * Greedy Idea:
 * Find the rightmost position where the sequence can be increased.
 * Then swap it with the smallest greater element and reverse the
 * remaining suffix to make the result as small as possible.
 *
 * Approach:
 * 1. Start from the second-last element.
 * 2. Find the first index i from the right where nums[i] < nums[i + 1].
 * 3. Find the rightmost element greater than nums[i].
 * 4. Swap nums[i] and nums[j].
 * 5. Reverse the suffix from i + 1 to n - 1.
 * 6. If no such i exists, reverse the entire array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        int left = i + 1;
        int right = n - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}