/*
 * Topic: Min Heap
 *
 * Min Heap Property:
 * Parent <= Children
 *
 * Operations:
 * - Insert
 * - Peek
 * - Remove
 * - Heapify
 */

public class MinHeap {
    private int[] heap;
    private int size;

    public MinHeap(int capacity) {
        heap = new int[capacity];
        size = 0;
    }

    // Insert element
    public void add(int val) {
        if (size == heap.length) {
            System.out.println("Heap is full");
            return;
        }
        heap[size] = val;
        int index = size;
        size++;

        // Heapify Up
        while (index > 0) {
            int parent = (index - 1) / 2;

            if (heap[parent] <= heap[index]) {
                break;
            }
            swap(parent, index);
            index = parent;
        }
    }

    // Get minimum element
    public int peek() {
        if (size == 0) {
            throw new RuntimeException("Heap is empty");
        }
        return heap[0];
    }

    // Remove minimum element
    public int remove() {
        if (size == 0) {
            throw new RuntimeException("Heap is empty");
        }
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;

        // Heapify Down
        int index = 0;
        while (true) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;

            if (left < size && heap[left] < heap[smallest]) {
                smallest = left;
            }

            if (right < size && heap[right] < heap[smallest]) {
                smallest = right;
            }

            if (smallest == index) {
                break;
            }

            swap(index, smallest);
            index = smallest;
        }
        return min;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Display heap
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);

        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);
        minHeap.add(2);
        minHeap.add(8);

        System.out.println("Min Heap:");
        minHeap.display();

        System.out.println("Minimum: " + minHeap.peek());

        System.out.println("Removed: " + minHeap.remove());

        System.out.println("After Removal:");
        minHeap.display();
    }
}