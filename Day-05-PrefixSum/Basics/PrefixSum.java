/*
 * Problem: Prefix Sum
 *
 * Description:
 * Build a Prefix Sum array where each element stores
 * the cumulative sum from index 0 to the current index.
 *
 * Approach:
 * - Create a new array called prefix.
 * - Set prefix[0] = nums[0].
 * - Traverse the array from index 1.
 * - Store the cumulative sum at each index.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

public class PrefixSum {
    public static int[] buildPrefixSum(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        return prefix;
    }

    public static void main(String[] args) {

        int[] nums = {2, 4, 6, 8, 10};
        int[] prefix = buildPrefixSum(nums);

        System.out.print("Original Array: ");

        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.print("Prefix Sum Array: ");

        for (int sum : prefix) {
            System.out.print(sum + " ");
        }
    }
}