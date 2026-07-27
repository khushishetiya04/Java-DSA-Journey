/*
 * Topic: Quick Sort
 *
 * Description:
 * Quick Sort is a Divide and Conquer algorithm.
 * It selects a pivot element, partitions the array
 * around the pivot, and recursively sorts the
 * left and right subarrays.
 *
 * Time Complexity :
 * Best    : O(n log n)
 * Average : O(n log n)
 * Worst   : O(n²)
 *
 * Space Complexity: O(log n)
 */

public class QuickSort {
    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        // Partition Index
        int pivotIndex = partition(arr, start, end);

        // Sort Left Half
        quickSort(arr, start, pivotIndex - 1);

        // Sort Right Half
        quickSort(arr, pivotIndex + 1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at correct position
        i++;

        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};

        System.out.println("Before Sorting:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting:");
        printArray(arr);
    }
}