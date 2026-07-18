# 📅 Day 09 - ArrayList

## 📌 Topics Covered

- Introduction to ArrayList
- Creating an ArrayList
- Adding Elements
- Accessing Elements
- Updating Elements
- Removing Elements
- Searching Elements
- Traversing an ArrayList
- ArrayList vs Array
- Dynamic Resizing
- Common ArrayList Operations

---

# 📖 What is an ArrayList?

An **ArrayList** is a resizable array provided by the Java Collections Framework.

Unlike arrays, an ArrayList can **grow and shrink dynamically**.

```java
ArrayList<Integer> list = new ArrayList<>();
```

---

# 🔹 Why Use ArrayList?

- Dynamic Size
- Easy to insert and delete elements
- Built-in methods
- Stores objects
- Part of Java Collections Framework

---

# 🔹 Common Operations

| Method                | Description 
|-----------------------|------------------------------------
| `add(element)`        | Add element at the end 
| `add(index, element)` | Insert element at a specific index
| `get(index)`          | Access an element 
| `set(index, element)` | Update an element 
| `remove(index)`       | Remove by index 
| `remove(Object)`      | Remove by value 
| `contains(element)`   | Check if element exists 
| `size()`              | Number of elements 
| `isEmpty()`           | Check if list is empty 
| `clear()`             | Remove all elements 

---

# 🔹 Traversing an ArrayList

### Using For Loop

```java
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
```

---

### Using Enhanced For Loop

```java
for (int num : list) {
    System.out.println(num);
}
```

---

# 🔹 Array vs ArrayList

| Array                       | ArrayList 
|-----------------------------|-----------
| Fixed Size                  | Dynamic Size 
| Stores primitives & objects | Stores objects only 
| Faster                      | Slightly slower 
| No built-in methods         | Many built-in methods 
| Length using `length`       | Size using `size()` 

---

# 🔹 Internal Working

- ArrayList internally uses an array.
- When the array becomes full, Java creates a **larger array**.
- Existing elements are copied into the new array.
- This process is called **Dynamic Resizing**.

---

# 🔹 Time Complexity

| Operation           | Complexity 
|---------------------|------------
| Access (`get`)      | **O(1)** 
| Update (`set`)      | **O(1)** 
| Add at End          | **O(1)** *(Amortized)* 
| Add at Beginning    | **O(n)** 
| Remove at End       | **O(1)** 
| Remove at Beginning | **O(n)** 
| Search (`contains`) | **O(n)** 

---

# 💻 Practice

## Basics

- Creating an ArrayList
- Adding Elements
- Updating Elements
- Removing Elements
- Traversing an ArrayList

---

# 🧩 LeetCode Problems

| Problem No. | Problem Name                             | Pattern                   | Difficulty
|-------------|------------------------------------------|---------------------------|-----------
| 0118        | Pascal's Triangle                        | Nested ArrayList          | Easy 
| 0448        | Find All Numbers Disappeared in an Array | ArrayList + Index Marking | Easy 
| 0989        | Add to Array-Form of Integer             | Simulation + ArrayList    | Easy 

---

# 🎯 Key Learnings

- Learned how ArrayList differs from Arrays.
- Practiced all commonly used ArrayList methods.
- Understood dynamic resizing.
- Learned to traverse ArrayLists efficiently.
- Solved problems returning `List<Integer>`.
- Used nested ArrayLists in Pascal's Triangle.

---

# 📈 Progress

## Basics (1)

- ArrayList Operations

## LeetCode Problems (3)

- 118. Pascal's Triangle
- 448. Find All Numbers Disappeared in an Array
- 989. Add to Array-Form of Integer

### ✅ Total Concepts & Problems Covered: **4**

---

# 🎉 Day 09 Summary

- Built a strong understanding of Java ArrayList.
- Learned common operations and their time complexities.
- Practiced traversing and modifying dynamic arrays.
- Solved interview-style problems using ArrayList.
- Strengthened Java Collections fundamentals for future DSA topics.