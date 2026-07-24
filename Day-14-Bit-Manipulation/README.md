# 📅 Day 14 - Bit Manipulation

## 📌 Topics Covered

- Introduction to Bit Manipulation
- Bitwise Operators
- Common Bit Operations
- Bit Manipulation Tricks
- Applications of Bit Manipulation

---

# 📖 What is Bit Manipulation?

Bit Manipulation is the technique of performing operations directly on the binary representation of numbers.

It is widely used for:

- Optimizing algorithms
- Space-efficient solutions
- Competitive Programming
- System Programming
- Interview problems

---

# 🔹 Bitwise Operators

| Operator | Name                 | Example 
|----------|----------------------|---------
| `&`      | AND                  | `5 & 3` 
| `|`      | OR                   | `5 \| 3`
| `^`      | XOR                  | `5 ^ 3` 
| `~`      | NOT                  | `~5` 
| `<<`     | Left Shift           | `5 << 1` 
| `>>`     | Right Shift          | `5 >> 1` 
| `>>>`    | Unsigned Right Shift | `5 >>> 1`

---

# 🔹 Common Bit Operations

- Get ith Bit
- Set ith Bit
- Clear ith Bit
- Update ith Bit
- Toggle ith Bit
- Check Odd or Even
- Count Set Bits
- Check Power of Two

---

# 🔹 Bit Manipulation Tricks

### Remove Last Set Bit

```java
n = n & (n - 1);
```

### Get Lowest Set Bit

```java
n & (-n)
```

### Check Power of Two

```java
(n & (n - 1)) == 0
```

### Multiply by 2

```java
n << 1
```

### Divide by 2

```java
n >> 1
```

### Swap Two Numbers using XOR

```java
a = a ^ b;
b = a ^ b;
a = a ^ b;
```

---

# 🔹 Time Complexity

Most bit operations execute in **O(1)** time.

---

# 💻 Practice

## Basics

- Bitwise Operators
- Bit Operations
- Bit Manipulation Tricks

---

# 🧩 LeetCode Problems

| Problem No. | Problem Name     | Pattern      | Difficulty 
|-------------|------------------|--------------|------------
| 0136        | Single Number    | XOR          | Easy 
| 0191        | Number of 1 Bits | Bit Counting | Easy 
| 0231        | Power of Two     | Bit Check    | Easy 
| 0268        | Missing Number   | XOR          | Easy 
| 0338        | Counting Bits    | Bit DP       | Easy 

---

# 🎯 Key Learnings

- Learned binary representation of numbers.
- Practiced bitwise operators and common bit operations.
- Understood useful bit manipulation tricks.
- Used XOR to solve unique element and missing number problems.
- Learned efficient techniques for counting set bits and checking powers of two.

---

# 📈 Progress

## Basics (3)

- Bitwise Operators
- Bit Operations
- Bit Manipulation Tricks

## LeetCode Problems (5)

- 136. Single Number
- 191. Number of 1 Bits
- 231. Power of Two
- 268. Missing Number
- 338. Counting Bits

### ✅ Total Concepts & Problems Covered: **8**

---

# 🎉 Day 14 Summary

- Built a strong foundation in Bit Manipulation.
- Learned how binary operations improve algorithm efficiency.
- Practiced essential bit tricks frequently used in coding interviews.
- Solved five LeetCode problems covering XOR, bit counting, power checks, missing number, and dynamic programming with bits.
- Built a solid base for advanced topics like Bitmasking and State Compression.