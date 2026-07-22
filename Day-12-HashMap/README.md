# 📅 Day 12 - HashMap

## 📌 Topics Covered

- Introduction to HashMap
- Key-Value Pairs
- HashMap Operations
- Frequency Counting
- Character Mapping
- Iterating over HashMap
- Applications of HashMap

---

# 📖 What is a HashMap?

A **HashMap** is a collection that stores data in **key-value pairs**.

- Keys are unique.
- Values can be duplicated.
- Unordered collection.
- Provides fast insertion, deletion, and lookup.

```java
HashMap<Integer, String> map = new HashMap<>();
```

---

# 🔹 Common HashMap Operations

| Method                            | Description 
|-----------------------------------|-----------------------------------
| `put(key, value)`                 | Insert or update a key-value pair 
| `get(key)`                        | Retrieve the value of a key 
| `remove(key)`                     | Remove a key-value pair 
| `containsKey(key)`                | Check if a key exists 
| `containsValue(value)`            | Check if a value exists 
| `getOrDefault(key, defaultValue)` | Return value or default value 
| `keySet()`                        | Returns all keys 
| `values()`                        | Returns all values 
| `entrySet()`                      | Returns all key-value pairs 
| `size()`                          | Returns number of entries 
| `isEmpty()`                       | Checks whether the map is empty 
| `clear()`                         | Removes all entries 

---

# 🔹 Frequency Counting

One of the most common applications of HashMap.

```java
HashMap<Character, Integer> map = new HashMap<>();

for(char ch : str.toCharArray()){
    map.put(ch, map.getOrDefault(ch, 0) + 1);
}
```

---


# 🔹 Iterating over HashMap

### Using keySet()

```java
for(Integer key : map.keySet()){
    System.out.println(key + " " + map.get(key));
}
```

### Using entrySet()

```java
for(Map.Entry<Integer, String> entry : map.entrySet()){
    System.out.println(entry.getKey() + " " + entry.getValue());
}
```

---

# 🔹 Time Complexity

| Operation       | Complexity 
|-----------------|------------
| put()           | O(1) Average 
| get()           | O(1) Average 
| remove()        | O(1) Average
| containsKey()   | O(1) Average
| containsValue() | O(n) 
| Iteration       | O(n) 

---

# 💻 Practice

## Basics

- HashMap Operations
- Frequency Count
- Iterate HashMap

---

# 🧩 LeetCode Problems

| Problem No. | Problem Name       | Pattern           | Difficulty 
|-------------|--------------------|-------------------|------------
| 0001        | Two Sum            | HashMap Lookup    | Easy 
| 0205        | Isomorphic Strings | Character Mapping | Easy 
| 0242        | Valid Anagram      | Frequency Count   | Easy 
| 0290        | Word Pattern       | Two-Way Mapping   | Easy 
| 0383        | Ransom Note        | Frequency Count   | Easy 

---

# 🎯 Key Learnings

- Learned HashMap fundamentals and key-value storage.
- Practiced common HashMap operations.
- Used `getOrDefault()` for frequency counting.
- Solved lookup, mapping, and frequency-based interview problems.
- Understood different ways to iterate over a HashMap.

---

# 📈 Progress

## Basics (3)

- HashMap Operations
- Frequency Count
- Iterate HashMap

## LeetCode Problems (5)

- 1. Two Sum
- 205. Isomorphic Strings
- 242. Valid Anagram
- 290. Word Pattern
- 383. Ransom Note

### ✅ Total Concepts & Problems Covered: **8**

---

# 🎉 Day 12 Summary

- Built a strong understanding of Java HashMap.
- Learned key-value storage and efficient lookups.
- Practiced frequency counting and character mapping techniques.
- Solved four interview-oriented LeetCode problems using HashMap.
- Built a solid foundation for advanced hashing topics such as **HashSet**, **TreeMap**, **Sliding Window with HashMap**, and **Prefix Sum + HashMap**.