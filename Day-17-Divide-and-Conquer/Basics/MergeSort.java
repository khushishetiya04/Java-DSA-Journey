/*
 * Topic: Merge Sort
 *
 * Description:
 * Merge Sort is a Divide and Conquer algorithm.
 * It divides the array into two halves,
 * recursively sorts each half, and then
 * merges the sorted halves.
 *
 * Time Complexity : O(n log n)
 * Space Complexity: O(n)
 */

public class MergeSort {
    public static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;

        // Sort Left Half
        mergeSort(arr, start, mid);

        // Sort Right Half
        mergeSort(arr, mid + 1, end);

        // Merge Both Halves
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        // Merge two sorted halves
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements of left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of right half
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // Copy back to original array
        for (k = 0, i = start; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
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

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting:");
        printArray(arr);
    }
}