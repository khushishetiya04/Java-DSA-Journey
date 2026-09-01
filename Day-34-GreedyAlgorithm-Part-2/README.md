# 📅 Day 34 - Greedy Algorithms Part 2

## 📌 Topics Covered

- Greedy Reachability
- Jump Game Pattern
- Range Expansion
- Greedy Feasibility
- Sorting + Greedy
- Two-Pass Greedy
- Interval Partitioning
- Interval Events
- Priority Queue + Greedy
- Min Heap Greedy
- Range Covering
- Array Greedy
- Lexicographical Greedy

---

# 📖 Concepts Covered

- Farthest Reachable Position
- Greedy Range Expansion
- Minimum Jumps
- Gas Station Feasibility
- Sorting + Matching
- Two-Pass Greedy
- Last Occurrence Tracking
- Interval Partitioning
- Event-Based Greedy
- Minimum Heap Selection
- Huffman Coding
- Minimum Cost Merging
- Range Coverage
- Next Lexicographical Permutation

---

# 💻 Basics

## 1. Huffman Coding

### Problem

Given characters with different frequencies, construct an optimal prefix code that minimizes the total encoded length.

### Approach

- Insert all character frequencies into a min heap.
- Remove the two smallest frequencies.
- Combine them into a new node.
- Add the combined frequency back to the heap.
- Repeat until one node remains.
- The resulting tree is used to generate Huffman codes.

### Pattern

**Greedy + Min Heap**

### Time Complexity

`O(n log n)`

### Space Complexity

`O(n)`

---

## 2. Minimum Cost to Connect Ropes

### Problem

Given ropes of different lengths, connect all ropes with minimum total cost. The cost of connecting two ropes is their combined length.

### Approach

- Insert all rope lengths into a min heap.
- Remove the two smallest ropes.
- Connect them and add their combined length to the total cost.
- Insert the combined rope back into the heap.
- Repeat until only one rope remains.

### Pattern

**Greedy + Min Heap**

### Time Complexity

`O(n log n)`

### Space Complexity

`O(n)`

---

# 🧩 LeetCode Problems

| Problem No. | Problem Name             | Pattern                  | Difficulty 
|-------------|--------------------------|--------------------------|------------
| 0055        | Jump Game                | Greedy + Reachability    | Medium 
| 0045        | Jump Game II             | Greedy + Range Expansion | Medium 
| 0134        | Gas Station              | Greedy + Feasibility     | Medium 
| 0455        | Assign Cookies           | Sorting + Greedy         | Easy 
| 0135        | Candy                    | Two-Pass Greedy          | Hard 
| 0763        | Partition Labels         | Greedy + Intervals       | Medium 
| 1710        | Maximum Units on a Truck | Sorting + Greedy         | Easy 
| 0253        | Meeting Rooms II         | Intervals + Min Heap     | Medium 
| 1094        | Car Pooling              | Intervals + Events       | Medium 
| 1326        | Minimum Number of Taps to Open to Water a Garden    | Greedy + Range Covering | Hard
| 0031        | Next Permutation         | Greedy + Array            | Medium 

---

# 🔹 Time Complexity

| Algorithm / Problem           | Time Complexity 
|-------------------------------|-----------------
| Huffman Coding                | O(n log n) 
| Minimum Cost to Connect Ropes | O(n log n) 
| Jump Game                     | O(n) 
| Jump Game II                  | O(n) 
| Gas Station                   | O(n) 
| Assign Cookies                | O(n log n + m log m) 
| Candy                         | O(n) 
| Partition Labels              | O(n) 
| Maximum Units on a Truck      | O(n log n) 
| Meeting Rooms II              | O(n log n) 
| Car Pooling                   | O(n log n) 
| Minimum Number of Taps        | O(n) 
| Next Permutation              | O(n) 

---

# 🎯 Key Learnings

- Learned greedy reachability using the farthest reachable position.
- Learned the Jump Game pattern.
- Learned how to find the minimum number of jumps using range expansion.
- Learned greedy feasibility using the Gas Station problem.
- Learned sorting + greedy matching.
- Learned the two-pass greedy technique.
- Learned how to partition a string using last-occurrence boundaries.
- Learned sorting + greedy for maximizing units.
- Learned interval partitioning using a min heap.
- Learned event-based processing using Car Pooling.
- Learned range covering using greedy expansion.
- Learned Min Heap based greedy algorithms.
- Learned Huffman Coding.
- Learned minimum-cost merging using the Connect Ropes problem.
- Learned greedy array manipulation using Next Permutation.
- Learned how different greedy patterns can be combined with sorting, heaps, intervals, and arrays.

---

# 📈 Progress

## Basics (2)

- Huffman Coding
- Minimum Cost to Connect Ropes

## LeetCode Problems (11)

- 55. Jump Game
- 45. Jump Game II
- 134. Gas Station
- 455. Assign Cookies
- 135. Candy
- 763. Partition Labels
- 1710. Maximum Units on a Truck
- 253. Meeting Rooms II
- 1094. Car Pooling
- 1326. Minimum Number of Taps to Open to Water a Garden
- 31. Next Permutation

### ✅ Total Concepts & Problems Covered: **13**

---

# 🎉 Day 34 Summary

- Expanded greedy knowledge beyond basic selection problems.
- Learned the greedy reachability pattern.
- Practiced Jump Game and minimum-jump range expansion.
- Learned greedy feasibility with Gas Station.
- Practiced sorting + greedy matching.
- Learned the two-pass greedy technique.
- Practiced interval partitioning and event-based processing.
- Learned Min Heap + Greedy patterns.
- Practiced Huffman Coding and minimum-cost rope connection.
- Learned greedy range covering.
- Practiced greedy array manipulation with Next Permutation.
- Strengthened the ability to identify greedy patterns in different problem types.
- Solved important greedy problems involving reachability, sorting, intervals, heaps, feasibility, and range coverage.