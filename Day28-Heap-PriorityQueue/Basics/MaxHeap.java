/*
 * Topic: Max Heap
 *
 * Max Heap Property:
 * Parent >= Children
 *
 * Operations:
 * - Insert
 * - Peek
 * - Remove
 * - Heapify
 */

public class MaxHeap {
    private int[] heap;
    private int size;

    public MaxHeap(int capacity) {
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
            if (heap[parent] >= heap[index]) {
                break;
            }
            swap(parent, index);
            index = parent;
        }
    }

    // Get maximum element
    public int peek() {
        if (size == 0) {
            throw new RuntimeException("Heap is empty");
        }
        return heap[0];
    }

    // Remove maximum element
    public int remove() {
        if (size == 0) {
            throw new RuntimeException("Heap is empty");
        }
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;

        // Heapify Down
        int index = 0;
        while (true) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int largest = index;

            if (left < size && heap[left] > heap[largest]) {
                largest = left;
            }

            if (right < size && heap[right] > heap[largest]) {
                largest = right;
            }

            if (largest == index) {
                break;
            }

            swap(index, largest);
            index = largest;
        }
        return max;
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
        MaxHeap maxHeap = new MaxHeap(10);

        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(20);
        maxHeap.add(2);
        maxHeap.add(8);

        System.out.println("Max Heap:");
        maxHeap.display();

        System.out.println("Maximum: " + maxHeap.peek());

        System.out.println("Removed: " + maxHeap.remove());

        System.out.println("After Removal:");
        maxHeap.display();
    }
}