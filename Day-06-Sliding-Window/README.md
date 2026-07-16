# 📅 Day 06 - Sliding Window

## 📌 Topics Covered

- Introduction to Sliding Window
- Fixed Size Sliding Window
- Variable Size Sliding Window
- Window Expansion and Shrinking
- Optimizing Brute Force Solutions

---

# 📖 What is Sliding Window?

**Sliding Window** is an optimization technique used for problems involving **subarrays** or **substrings**.

Instead of recalculating values for every possible window, we maintain a window and update it efficiently as it moves.

This reduces the time complexity from **O(n²)** to **O(n)** in many problems.

---

# 🔹 Types of Sliding Window

## 1️⃣ Fixed Size Sliding Window

- Window size remains constant.
- Remove one element from the left.
- Add one new element from the right.
- Update the answer.

### Used In

- Maximum Sum Subarray of Size K
- LeetCode 643
- LeetCode 1343
- LeetCode 1456

---

## Fixed Window Template

```java
int windowSum = 0;

// Build first window
for (int i = 0; i < k; i++) {
    windowSum += nums[i];
}
int answer = windowSum;
// Slide the window
for (int i = k; i < nums.length; i++) {
    windowSum += nums[i];
    windowSum -= nums[i - k];

    answer = Math.max(answer, windowSum);
}
```

---

## 2️⃣ Variable Size Sliding Window

- Window size changes dynamically.
- Expand using the right pointer.
- Shrink using the left pointer whenever needed.
- Update the answer after satisfying the condition.

### Used In

- LeetCode 209
- LeetCode 1493

---

## Variable Window Template

```java
int left = 0;

for (int right = 0; right < nums.length; right++) {

    // Expand the window
    while (/* condition to shrink */) {

        // Remove nums[left]
        left++;
    }
    // Update answer
}
```

---

# 💡 When to Use Sliding Window?

Use Sliding Window when the problem involves:

- Continuous subarrays
- Continuous substrings
- Fixed-size windows
- Longest or shortest valid window
- Maximum or minimum value in a window

---

# ⚙️ Complexity

| Type            |   Time   | Space 
|-----------------|----------|-----------
| Fixed Window    | **O(n)** | **O(1)** 
| Variable Window | **O(n)** | **O(1)** 

---

# 💻 Practice Problems

| Problem                        | Status 
|--------------------------------|--------
| Fixed Sliding Window           | ✅ 
| Variable Sliding Window        | ✅ 

---

# 🧩 LeetCode Problems

| Problem No. | Problem Name                                            | Pattern           | Difficulty | Status 
|-------------|---------------------------------------------------------|-------------------|------------|--------
| 0643        | Maximum Average Subarray I                              | Fixed Window      | Easy       | ✅ 
| 1343        | Number of Sub-arrays of Size K and Average ≥ Threshold  | Fixed Window      | Medium     | ✅ 
| 1456        | Maximum Number of Vowels in a Substring of Given Length | Fixed Windowm     | Medium     | ✅ 
| 0209        | Minimum Size Subarray Sum                               | Variable Window   | Medium     | ✅ 
| 1493        | Longest Subarray of 1's After Deleting One Element      | Variable Window   | Medium     | ✅ 

---

# 🎯 Key Learnings

- Understood the Sliding Window technique.
- Learned the difference between Fixed and Variable Sliding Windows.
- Practiced expanding and shrinking a window efficiently.
- Solved problems on arrays and strings using Sliding Window.
- Reduced brute-force solutions from **O(n²)** to **O(n)**.

---

# 📈 Progress

## Practice Problems (2)

- Fixed Sliding Window
- Variable Sliding Window

## LeetCode Problems (5)

- 643. Maximum Average Subarray I
- 1343. Number of Sub-arrays of Size K and Average ≥ Threshold
- 1456. Maximum Number of Vowels in a Substring of Given Length
- 209. Minimum Size Subarray Sum
- 1493. Longest Subarray of 1's After Deleting One Element

### ✅ Total Problems Solved: **7**

---

# 🎉 Day 06 Summary

- Learned the Sliding Window optimization technique.
- Practiced both Fixed and Variable Sliding Window patterns.
- Solved array and string problems using efficient window updates.
- Built a strong foundation for advanced Sliding Window problems.