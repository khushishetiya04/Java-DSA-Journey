/*
 * Topic: Tower of Hanoi
 *
 * Description:
 * Given n disks and three rods (Source, Helper, Destination),
 * move all disks from the Source rod to the Destination rod.
 *
 * Rules:
 * 1. Only one disk can be moved at a time.
 * 2. A larger disk cannot be placed on a smaller disk.
 * 3. Only the top disk can be moved.
 *
 * Approach:
 * 1. Move the top (n - 1) disks from Source to Helper.
 * 2. Move the nth disk from Source to Destination.
 * 3. Move the (n - 1) disks from Helper to Destination.
 *
 * Time Complexity : O(2^n)
 * Space Complexity: O(n)
 */

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, char source, char helper, char destination) {
        if (n == 1) {
            System.out.println("Move Disk 1 from " + source + " to " + destination);
            return;
        }

        // Move n-1 disks from Source to Helper
        towerOfHanoi(n - 1, source, destination, helper);

        // Move largest disk
        System.out.println("Move Disk " + n + " from " + source + " to " + destination);

        // Move n-1 disks from Helper to Destination
        towerOfHanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;

        towerOfHanoi(n, 'A', 'B', 'C');
    }
}