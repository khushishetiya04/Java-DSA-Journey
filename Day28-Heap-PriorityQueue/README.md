# 📅 Day 28 - Heap & Priority Queue

## 📌 Topics Covered

- Heap
- Min Heap
- Max Heap
- Priority Queue
- Heap Operations
- Heapify
- Kth Element Pattern
- Top K Pattern
- Two Heaps
- Heap + Greedy
- Heap + Sliding Window
- Merge K Sorted Lists
- Smallest Range using Heap

---

# 📖 Concepts Covered

- Understanding Min Heap and Max Heap.
- Implementing Min Heap from scratch.
- Implementing Max Heap from scratch.
- Understanding Priority Queue.
- Insertion and deletion in a Heap.
- `offer()`, `poll()`, and `peek()` operations.
- Using Heap for Kth largest/smallest problems.
- Using Heap for Top K frequency problems.
- Using two heaps to maintain a dynamic median.
- Using Heap with Greedy algorithms.
- Using Heap for merging multiple sorted lists.
- Using Heap for sliding window problems.
- Using Heap to find the smallest range across multiple sorted lists.

---

# 💻 Basics

- Min Heap Implementation
- Max Heap Implementation

---

# 🧩 LeetCode / Interview Problems

| Problem No. | Problem Name                                  | Pattern            | Difficulty 
| ----------- | ----------------------------------------------|------------------- | ---------
| 1046        | Last Stone Weight                             | Max Heap           | Easy 
| 0703        | Kth Largest Element in a Stream               | Min Heap           | Easy 
| 0215        | Kth Largest Element in an Array               | Heap / Quickselect | Medium 
| 0347        | Top K Frequent Elements                       | HashMap + Heap     | Medium 
| 0023        | Merge k Sorted Lists                          | Min Heap           | Hard 
| 0373        | Find K Pairs with Smallest Sums               | Min Heap           | Medium 
| 0692        | Top K Frequent Words                          | HashMap + Heap     | Medium 
| —           | Minimum Cost to Connect Ropes                 | Min Heap + Greedy  | Medium 
| 0295        | Find Median from Data Stream                  | Two Heaps          | Hard 
| 0621        | Task Scheduler                                | Heap + Greedy      | Medium 
| 0239        | Sliding Window Maximum                        | Monotonic Deque    | Hard 
| 0480        | Sliding Window Median                         | Two Heaps          | Hard 
| 0632        | Smallest Range Covering Elements from K Lists | Min Heap           | Hard 

---

# 🔹 Heap Operations

| Operation | Time Complexity |
| --------- | --------------- |
| Insert / Offer | O(log n) |
| Delete / Poll | O(log n) |
| Peek | O(1) |
| Heapify | O(log n) |
| Build Heap | O(n) |

---

# 🔹 Problem Complexity

| Problem                                       | Time       | Space 
| ----------------------------------------------| -----------| -------- 
| Last Stone Weight                             | O(n log n) | O(n) 
| Kth Largest Element in a Stream               | O(log k) per insertion | O(k) 
| Kth Largest Element in an Array               | O(n log k) | O(k) 
| Top K Frequent Elements                       | O(n log k) | O(n) 
| Merge k Sorted Lists                          | O(n log k) | O(k) 
| Find K Pairs with Smallest Sums               | O(k log k) | O(k) 
| Top K Frequent Words                          | O(n log k) | O(n) 
| Minimum Cost to Connect Ropes                 | O(n log n) | O(n) 
| Find Median from Data Stream                  | O(log n) per insertion | O(n) 
| Task Scheduler                                | O(n log n) | O(n) 
| Sliding Window Maximum                        | O(n)       | O(k) 
| Sliding Window Median                         | O(n log k) | O(k) 
| Smallest Range Covering Elements from K Lists | O(n log k) | O(k) 

> `n` = number of elements, `k` = heap/window/list parameter.

---

# 🎯 Key Learnings

- Learned how Min Heap and Max Heap work internally.
- Implemented both types of heaps from scratch.
- Understood Java Priority Queue.
- Learned when to use Min Heap vs Max Heap.
- Mastered the Kth element pattern.
- Practiced Top K frequency problems.
- Learned the Two Heap technique.
- Used Heap with Greedy algorithms.
- Learned how to merge multiple sorted structures efficiently.
- Connected Heap with Sliding Window techniques.
- Practiced advanced Hard-level Heap problems.



