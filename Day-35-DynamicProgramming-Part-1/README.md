# 📅 Day 35 - Dynamic Programming Part 1

## 📌 Topics Covered

- Dynamic Programming Basics
- Memoization
- Tabulation
- Space Optimization
- Fibonacci using Recursion
- Fibonacci using Memoization
- Fibonacci using Tabulation
- Fibonacci using Space Optimization
- 1D Dynamic Programming

---

# 📖 Concepts Covered

- Dynamic Programming
- Overlapping Subproblems
- Optimal Substructure
- Memoization
- Tabulation
- DP Array
- Base Cases
- State and Transition

---

# 💻 Basics

## 1. Memoization

### Problem

Understand the general Memoization technique used in Dynamic Programming to avoid solving the same subproblem multiple times.

### Approach

- Use recursion to solve the problem.
- Create a DP array to store already calculated results.
- Before solving a subproblem, check whether its result is already stored.
- If stored, return the saved result.
- Otherwise, calculate the result and store it.

### Pattern

**Top-Down DP + Recursion**

### Time Complexity

Depends on the number of unique states.

### Space Complexity

`O(n)` for the DP array + recursion stack.

---

## 2. Tabulation

### Problem

Understand the general Tabulation technique used in Dynamic Programming by solving smaller subproblems first and building the final answer iteratively.

### Approach

- Identify the base cases.
- Create a DP table.
- Initialize the base cases.
- Build the table from smaller states to larger states.
- Return the final DP state.

### Pattern

**Bottom-Up DP**

### Time Complexity

Depends on the number of states and transitions.

### Space Complexity

`O(n)` typically.

---

# 🧩 LeetCode Problems

| Problem No. | Problem Name             | Pattern          | Difficulty 
|-------------|--------------------------|------------------|------------
| 0070        | Climbing Stairs          | 1D DP            | Easy 
| 0746        | Min Cost Climbing Stairs | 1D DP            | Easy 
| 0198        | House Robber             | 1D DP + Decision | Medium 
| 0091        | Decode Ways              | 1D DP + String   | Medium 

---


# 🎯 Key Learnings

- Learned the basics of Dynamic Programming.
- Learned how to identify overlapping subproblems.
- Learned the concept of optimal substructure.
- Learned Memoization as a Top-Down DP technique.
- Learned Tabulation as a Bottom-Up DP technique.
- Learned how to convert recursion into Memoization.
- Learned how to build a DP table using Tabulation.
- Learned Fibonacci using four different approaches.
- Learned how to optimize DP space.
- Learned the 1D DP pattern.

---

# 📈 Progress

## Basics (3)

- Memoization
- Tabulation
- Fibonacci

## LeetCode Problems (4)

- 70. Climbing Stairs
- 746. Min Cost Climbing Stairs
- 198. House Robber
- 91. Decode Ways

### ✅ Total Concepts & Problems Covered: **7**

---

# 🎉 Day 35 Summary

- Started Dynamic Programming.
- Learned the basic idea of DP.
- Learned Memoization and Tabulation.
- Learned Top-Down and Bottom-Up approaches.
- Implemented Fibonacci using Recursion, Memoization, Tabulation, and Space Optimization.
- Learned how to optimize DP space.
- Practiced important 1D DP problems.
- Solved Climbing Stairs, Min Cost Climbing Stairs, House Robber, and Decode Ways.
- Built the foundation for more advanced Dynamic Programming patterns.