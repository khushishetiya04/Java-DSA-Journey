# 📅 Day 03 - Two Pointers

## 📌 Topic Covered

- Introduction to Two Pointers
- Same Direction Two Pointers
- Opposite Direction Two Pointers
- Two Pointer Templates
- Applications of Two Pointers

---

# 📖 What are Two Pointers?

The **Two Pointer** technique is an optimization approach used to solve array and string problems efficiently by maintaining two indices instead of using nested loops.

It is commonly used to:
- Traverse arrays efficiently
- Reduce time complexity from **O(n²)** to **O(n)**
- Solve problems involving searching, reversing, partitioning, and in-place modifications

---

# 🔄 Types of Two Pointers

## 1️⃣ Same Direction Two Pointers

- Both pointers move from **left to right**.
- One pointer scans the array, while the other keeps track of the position where the next valid element should be placed.

### General Template

```java
int slow = 0;
for (int fast = 0; fast < nums.length; fast++) {
    if (/* valid condition */) {
        nums[slow] = nums[fast];
        slow++;
    }
}
```

### Used In

- Remove Duplicates from Sorted Array
- Remove Element
- Move Zeroes

---

## 2️⃣ Opposite Direction Two Pointers

- One pointer starts from the beginning.
- The other starts from the end.
- Both pointers move toward each other.

### General Template

```java
int left = 0;
int right = arr.length - 1;
while (left < right) {
    if (/* condition */) {
        left++;
        right--;
    }
}
```

### Used In

- Valid Palindrome
- Two Sum II
- Container With Most Water
- Reverse Array
- Reverse String
- Rotate Array (Reverse Technique)
- LeetCode 88 - Merge Sorted Array

---

# 💻 Practice Problems

|     Problem    | Status 
|----------------|--------
| Reverse Array  | ✅ 
| Reverse String | ✅ 
| Is Palindrome  | ✅ 

---

# 🧩 LeetCode Problems

| Problem No. |             Problem Name            | Difficulty | Status 
|-------------|-------------------------------------|------------|--------
|     11      | Container With Most Water           | Medium     | ✅ 
|     26      | Remove Duplicates from Sorted Array | Easy       | ✅ 
|     27      | Remove Element                      | Easy       | ✅ 
|     88      | Merge Sorted Array                  | Easy       | ✅ 
|     125     | Valid Palindrome                    | Easy       | ✅ 
|     167     | Two Sum II - Input Array Is Sorted  | Medium     | ✅ 
|     189     | Rotate Array                        | Medium     | ✅
|     283     | Move Zeroes                         | Easy       | ✅ 

---

# ⚡ Time & Space Complexity

|           Technique             | Time | Space |
|---------------------------------|------|-------|
| Same Direction Two Pointers     | O(n) | O(1) |
| Opposite Direction Two Pointers | O(n) | O(1) |

---

# 🎯 Key Learnings

- Learned the Two Pointer optimization technique.
- Understood the difference between Same Direction and Opposite Direction pointers.
- Solved array and string problems using O(n) approaches.
- Learned when to use swapping, partitioning, and two-pointer traversal.
- Improved problem-solving by replacing nested loops with linear traversal.

---

# 📈 Progress

## Practice Problems (3)

- Reverse Array
- Reverse String
- Is Palindrome

## LeetCode Problems (8)

- 11. Container With Most Water
- 26. Remove Duplicates from Sorted Array
- 27. Remove Element
- 88. Merge Sorted Array
- 125. Valid Palindrome
- 167. Two Sum II - Input Array Is Sorted
- 189. Rotate Array
- 283. Move Zeroes

### ✅ Total Problems Solved: **11**

---

# 🎉 Day 03 Summary

- Learned the **Two Pointer** technique.
- Practiced both **Same Direction** and **Opposite Direction** approaches.
- Solved **11 problems** using Two Pointers.
- Strengthened array and string problem-solving skills with **O(n)** solutions.