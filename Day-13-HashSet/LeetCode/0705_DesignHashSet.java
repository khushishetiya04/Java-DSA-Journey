/*
 * LeetCode: 705
 * Problem: Design HashSet
 * Difficulty: Easy
 *
 * Description:
 * Design a HashSet without using any built-in
 * hash table libraries.
 *
 * Implement:
 * - add(key)
 * - remove(key)
 * - contains(key)
 *
 * Approach:
 * - Since 0 <= key <= 10^6,
 *   use a boolean array where each index
 *   represents a key.
 *
 * Pattern:
 * Design / HashSet
 *
 * Time Complexity:
 * add()      -> O(1)
 * remove()   -> O(1)
 * contains() -> O(1)
 *
 * Space Complexity:
 * O(10^6)
 */

class MyHashSet {
    private boolean[] set;
    public MyHashSet() {
        set = new boolean[1000001];
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    public boolean contains(int key) {
        return set[key];
    }
}

/*
 * Your MyHashSet object will be instantiated
 * and called as such:
 *
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */