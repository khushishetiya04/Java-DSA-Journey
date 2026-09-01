/*
 * Practice: Huffman Coding
 *
 * Pattern: Greedy Algorithm + Min Heap
 *
 * Description:
 * Given frequencies of characters, calculate the minimum total cost
 * of constructing a Huffman tree.
 *
 * Greedy Idea:
 * Always remove the two smallest frequencies, combine them, and
 * push their sum back into the Min Heap.
 *
 * Approach:
 * 1. Insert all frequencies into a Min Heap.
 * 2. Remove the two smallest frequencies.
 * 3. Add them together.
 * 4. Add the combined frequency to the total cost.
 * 5. Push the combined frequency back into the Min Heap.
 * 6. Repeat until only one frequency remains.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

import java.util.*;
public class HuffmanCoding {
    public static int huffmanCoding(int[] frequencies) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int frequency : frequencies) {
            pq.add(frequency);
        }

        int totalCost = 0;

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int combined = first + second;
            totalCost += combined;
            pq.add(combined);
        }
        return totalCost;
    }

    public static void main(String[] args) {
        int[] frequencies = {5, 9, 12, 13, 16, 45};
        int result = huffmanCoding(frequencies);

        System.out.println("Minimum Cost: " + result);
    }
}