# 📅 Day 29 - Trie

## 📌 Topics Covered

- Trie
- Prefix Tree
- Trie Node Structure
- Insert Operation
- Search Operation
- Prefix Search
- Count Words in Trie
- Count Words With Prefix
- Trie + DFS
- Trie + Backtracking
- Trie + Matrix
- Longest Common Prefix

---

# 📖 Concepts Covered

- Understanding Trie / Prefix Tree.
- Creating Trie Node structure.
- Using `children[]` to store character links.
- Using `isEnd` to mark the end of a word.
- Inserting words into a Trie.
- Searching complete words.
- Searching words with a given prefix.
- Counting complete words in a Trie.
- Counting words having a given prefix.
- Using Trie with DFS.
- Using Trie with Backtracking.
- Using Trie for efficient prefix pruning.
- Using Trie with Matrix traversal.
- Solving prefix-based problems efficiently.

---

# 💻 Basics

- Trie Implementation
- Count Words in Trie
- Count Words With Prefix

---

# 🧩 LeetCode / Interview Problems

| Problem No. | Problem Name                               | Pattern                   | Difficulty 
| ----------- | -------------------------------------------|---------------------------|-----------
| 0208        | Implement Trie (Prefix Tree)               | Trie                      | Medium 
| 0211        | Design Add and Search Words Data Structure | Trie + DFS / Backtracking | Medium 
| 0212        | Word Search II                             | Trie + DFS + Backtracking | Hard 
| 0014        | Longest Common Prefix                      | Trie / Prefix             | Easy 

---

# 🔹 Trie Operations

| Operation                  | Time Complexity 
| ---------------------------|-----------------
| Insert                     | O(L) 
| Search                     | O(L) 
| StartsWith / Prefix Search | O(L) 
| Count Word                 | O(L) 
| Count Words With Prefix    | O(L) 

> `L` = length of the word or prefix.

---

# 🔹 Problem Complexity

| Problem                 | Time                    | Space 
| ------------------------|-------------------------|----------
| Implement Trie          | O(L) per operation      | O(N × L) 
| Add and Search Words    | O(L) + DFS              | O(N × L) 
| Word Search II          | O(M × N × L) worst case | O(W × L) 
| Longest Common Prefix   | O(N × L)                | O(N × L) 
| Count Words in Trie     | O(L)                    | O(N × L) 
| Count Words With Prefix | O(L)                    | O(N × L) 

> `N` = number of words, `L` = word length, `M × N` = board size, and `W` = number of words.

---

# 🎯 Key Learnings

- Learned how Trie and Prefix Trees work.
- Implemented Trie from scratch.
- Understood Trie Node and `children[]`.
- Learned insertion and searching.
- Learned prefix searching.
- Learned word frequency counting.
- Learned prefix frequency counting.
- Mastered Trie + DFS.
- Mastered Trie + Backtracking.
- Learned Trie-based pruning.
- Applied Trie to matrix word-search problems.
- Solved prefix-based interview problems.

---

# 🔥 Important Patterns

- **Basic Trie** → Character-by-character traversal using Trie nodes.
- **Prefix Search** → Traverse the prefix and check whether the path exists.
- **Word Counting** → Store word frequency at the ending node.
- **Prefix Counting** → Store prefix frequency while traversing characters.
- **Trie + DFS** → Use Trie to validate prefixes before continuing DFS.
- **Trie + Backtracking** → Combine Trie with recursive exploration and pruning.
- **Trie + Matrix** → Search neighboring cells while following valid Trie paths.
- **Longest Common Prefix** → Follow the common Trie path until characters differ or a word ends.

---

# 📈 Progress

## Basics (3)

- Trie Implementation
- Count Words in Trie
- Count Words With Prefix

## LeetCode / Interview Problems (4)

- 208. Implement Trie (Prefix Tree)
- 211. Design Add and Search Words Data Structure
- 212. Word Search II
- 14. Longest Common Prefix

### ✅ Total Concepts & Problems Covered: **7**

---

# 🎉 Day 29 Summary

- Learned Trie / Prefix Tree fundamentals.
- Implemented Trie operations from scratch.
- Practiced word and prefix counting.
- Learned Trie + DFS and Backtracking.
- Learned Trie-based pruning.
- Solved Word Search II using Trie and Backtracking.
- Solved Longest Common Prefix.
- Covered Easy, Medium, and Hard Trie interview patterns.