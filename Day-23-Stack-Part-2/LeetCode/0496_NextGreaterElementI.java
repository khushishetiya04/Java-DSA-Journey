/*
 * LeetCode: 496
 * Problem: Next Greater Element I
 * Difficulty: Easy
 *
 * Description:
 * Given two arrays nums1 and nums2, where nums1
 * is a subset of nums2, find the next greater
 * element for each element in nums1.
 *
 * Approach:
 * - Use a Monotonic Decreasing Stack to process nums2.
 * - Store each element's next greater element in a HashMap.
 * - Build the answer for nums1 using the map.
 *
 * Pattern:
 * Monotonic Stack + HashMap
 *
 * Time Complexity : O(n + m)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], stack.peek());
            }
            stack.push(nums2[i]);
        }
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}