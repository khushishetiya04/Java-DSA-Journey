# 📅 Day 10 - Strings

## 📌 Topics Covered

- Introduction to Strings
- String Immutability
- Creating Strings
- String Traversal
- Common String Methods
- Character Operations
- String Comparison
- Two Pointer Technique
- Character Frequency

---

# 📖 What is a String?

A **String** is a sequence of characters enclosed within double quotes.

```java
String str = "Hello";
```

Strings in Java are **immutable**, meaning once a String object is created, its value cannot be changed.

---

# 🔹 Ways to Create a String

```java
String s1 = "Java";

String s2 = new String("Java");
```

---

# 🔹 Common String Methods

| Method                  | Description 
|-------------------------|-------------------------------------------
| `length()`              | Returns the length of the string 
| `charAt(index)`         | Returns the character at the given index 
| `substring(start)`      | Returns substring from start index 
| `substring(start, end)` | Returns substring within a range 
| `equals()`              | Compares string values 
| `equalsIgnoreCase()`    | Compares strings ignoring case 
| `contains()`            | Checks if a substring exists 
| `indexOf()`             | Returns the first occurrence index 
| `lastIndexOf()`         | Returns the last occurrence index 
| `toLowerCase()`         | Converts string to lowercase 
| `toUpperCase()`         | Converts string to uppercase 
| `trim()`                | Removes leading and trailing spaces 
| `toCharArray()`         | Converts String to character array 
| `isEmpty()`             | Checks whether the string is empty 

---

# 🔹 String Traversal

### Using for Loop

```java
for (int i = 0; i < str.length(); i++) {
    System.out.print(str.charAt(i));
}
```

### Using Enhanced For Loop

```java
char[] arr = str.toCharArray();

for (char ch : arr) {
    System.out.print(ch);
}
```

---

# 🔹 String Comparison

### Using equals()

```java
String a = "Java";
String b = "Java";

System.out.println(a.equals(b));
```

Output

```text
true
```

### Using ==

```java
System.out.println(a == b);
```

`==` compares object references, while `equals()` compares the actual contents of the strings.

---

# 🔹 Character Utility Methods

```java
Character.isLetter(ch);
Character.isDigit(ch);
Character.isLetterOrDigit(ch);
Character.toLowerCase(ch);
Character.toUpperCase(ch);
```

---

# 🔹 Time Complexity

| Operation       | Complexity 
|-----------------|------------
| `length()`      | O(1) 
| `charAt()`      | O(1) 
| `equals()`      | O(n) 
| `substring()`   | O(n) 
| `toLowerCase()` | O(n) 
| `toUpperCase()` | O(n) 
| `toCharArray()` | O(n) 

---

# 💻 Practice

## Basics

- String Operations

---

# 🧩 LeetCode Problems

| Problem No. | Problem Name                       | Pattern                | Difficulty 
|-------------|------------------------------------|------------------------|------------
| 0058        | Length of Last Word                | String Traversal       | Easy 
| 0125        | Valid Palindrome                   | Two Pointers           | Easy 
| 0242        | Valid Anagram                      | Character Frequency    | Easy 
| 0344        | Reverse String                     | Two Pointers           | Easy 
| 0387        | First Unique Character in a String | Character Frequency    | Easy 
| 0709        | To Lower Case                      | Character Manipulation | Easy 

---

# 🎯 Key Learnings

- Understood String immutability.
- Learned commonly used String methods.
- Practiced String traversal techniques.
- Learned the difference between `==` and `equals()`.
- Used the `Character` class for character manipulation.
- Solved interview-oriented String problems using Two Pointers and Frequency Count.

---

# 📈 Progress

## Basics (1)

- String Operations

## LeetCode Problems (6)

- 58. Length of Last Word
- 125. Valid Palindrome
- 242. Valid Anagram
- 344. Reverse String
- 387. First Unique Character in a String
- 709. To Lower Case

### ✅ Total Concepts & Problems Covered: **7**

---

# 🎉 Day 10 Summary

- Learned Java String fundamentals and immutability.
- Practiced important String methods and character operations.
- Strengthened String traversal and comparison concepts.
- Solved six interview-focused LeetCode problems covering Two Pointers, Character Frequency, and String Manipulation.
- Built a solid foundation for advanced String topics such as **StringBuilder**, **HashMap on Strings**, and **Sliding Window on Strings**.