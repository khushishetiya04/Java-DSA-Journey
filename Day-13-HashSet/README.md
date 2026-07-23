# 📅 Day 13 - HashSet

## 📌 Topics Covered

- Introduction to HashSet
- HashSet Operations
- Set Operations
- Bucket Implementation
- LinkedHashSet
- LinkedHashMap
- TreeSet
- TreeMap
- Applications of HashSet

---

# 📖 What is a HashSet?

A **HashSet** is a collection that stores **unique elements**.

- Does not allow duplicate elements.
- Unordered collection.
- Fast insertion, deletion, and lookup.
- Internally backed by a HashMap.

```java
HashSet<Integer> set = new HashSet<>();
```

---

# 🔹 Common HashSet Operations

| Method       | Description 
|--------------|-------------
| `add()`      | Adds an element 
| `remove()`   | Removes an element 
| `contains()` | Checks if an element exists 
| `size()`     | Returns number of elements 
| `isEmpty()`  | Checks whether the set is empty 
| `clear()`    | Removes all elements 
| `iterator()` | Iterates through the set 

---

# 🔹 Set Operations

## Union

```java
set1.addAll(set2);
```

## Intersection

```java
set1.retainAll(set2);
```

## Difference

```java
set1.removeAll(set2);
```

---

# 🔹 HashSet vs LinkedHashSet vs TreeSet

| Feature           | HashSet     | LinkedHashSet            | TreeSet 
|-------------------|-------------|--------------------------|----------------
| Ordering          | No          | Insertion Order          | Sorted Order 
| Duplicate Allowed | ❌          | ❌                      | ❌ 
| Null Allowe       | ✅ One      | ✅ One                  | ❌ 
| Implementation    | Hash Table  | Hash Table + Linked List | Red-Black Tree 
| Search            | O(1)        | O(1)                     | O(log n) 

---

# 🔹 HashMap vs LinkedHashMap vs TreeMap

| Feature        | HashMap      | LinkedHashMap            | TreeMap 
|----------------|--------------|--------------------------|---------------
| Ordering       | No           | Insertion Order          | Sorted by Key 
| Null Key       | ✅ One       | ✅ One                  | ❌ 
| Null Value     | ✅ Multiple  | ✅ Multiple             | ✅ 
| Search         | O(1)         | O(1)                     | O(log n) 
| Implementation | Hash Table   | Hash Table + Linked List | Red-Black Tree 

---

# 🔹 Bucket Implementation

A HashSet internally stores elements inside **buckets** based on their hash value.

Bucket implementation helps achieve average **O(1)** insertion, deletion, and lookup.

---

# 🔹 Time Complexity

| Operation  | HashSet | TreeSet 
|------------|---------|----------
| Add        | O(1)    | O(log n)
| Remove     | O(1)    | O(log n)
| Contains   | O(1)    | O(log n)
| Iteration  | O(n)    | O(n) 

---

# 💻 Practice

## Basics

- HashSet Operations
- Set Operations
- Bucket Implementation
- LinkedHashMap, LinkedHashSet, TreeMap & TreeSet

---

# 🧩 LeetCode Problems

| Problem No. | Problem Name                 | Pattern | Difficulty 
|-------------|------------------------------|---------|------------
| 0128        | Longest Consecutive Sequence | HashSet | Medium 
| 0202        | Happy Number                 | HashSet | Easy 
| 0217        | Contains Duplicate           | HashSet | Easy 
| 0349        | Intersection of Two Arrays   | HashSet | Easy 
| 0705        | Design HashSet               | Bucket Implementation | Easy 

---

# 🎯 Key Learnings

- Learned HashSet fundamentals.
- Practiced common HashSet operations.
- Understood bucket-based implementation.
- Compared HashSet with LinkedHashSet and TreeSet.
- Compared HashMap, LinkedHashMap and TreeMap.
- Solved duplicate detection, set operations and hashing interview problems.

---

# 📈 Progress

## Basics (4)

- HashSet Operations
- Set Operations
- Bucket Implementation
- LinkedHashMap, LinkedHashSet, TreeMap & TreeSet

## LeetCode Problems (5)

- 128. Longest Consecutive Sequence
- 202. Happy Number
- 217. Contains Duplicate
- 349. Intersection of Two Arrays
- 705. Design HashSet

### ✅ Total Concepts & Problems Covered: **9**

---

# 🎉 Day 13 Summary

- Built a strong understanding of Java HashSet.
- Learned bucket-based hashing and set operations.
- Understood the differences between HashSet, LinkedHashSet, TreeSet, HashMap, LinkedHashMap, and TreeMap.
- Solved five interview-oriented LeetCode problems using HashSet.
- Built a solid foundation for advanced hashing concepts and Java Collections Framework.