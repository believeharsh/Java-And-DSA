package DSAlgo.Algo.Sorting.InsertionSort;

public class Theory {
    
// What is Insertion Sort?
// Insertion Sort works by building a sorted portion of the array one element at a time.

// It takes each element from the unsorted portion and inserts it into the correct position in the sorted portion.

// It is efficient for small or partially sorted arrays.

// Working:
// Start with the second element (index 1), as the first element is trivially considered "sorted".

// Compare the current element with the element(s) in the sorted portion.

// Shift elements that are greater than the current element to the right.

// Insert the current element into the correct position in the sorted portion.

// Repeat the process for all elements from left to right until the entire array is sorted.

// Time Complexity:
// Best Case: O(n) (when the array is already sorted)

// Worst Case: O(n^2) (when the array is in reverse order)

// Average Case: O(n^2)

// The worst-case time complexity occurs when the element is inserted at the beginning, resulting in shifting all the elements.

// Space Complexity:
// O(1): Insertion sort is an in-place sorting algorithm, meaning it only uses a constant amount of extra space.

// Key Points:
// Stable Sorting: It maintains the relative order of equal elements.

// Adaptive: Works well on partially sorted arrays.

// Online: It can sort a list as it receives it (not required to have the entire list beforehand).

// Steps of Insertion Sort:
// Given an array arr[]:

// Start with the second element (i = 1).

// Compare arr[i] with arr[i - 1].

// If arr[i] < arr[i - 1], shift arr[i - 1] to the right.

// Continue shifting until you find the correct position for arr[i].

// Insert arr[i] into the sorted part of the array.

// Repeat until the entire array is sorted.

// Example:
// Input: [5, 2, 9, 1, 5, 6]

// Compare 2 with 5, shift 5 → [2, 5, 9, 1, 5, 6]

// Compare 9 with 5, no shift → [2, 5, 9, 1, 5, 6]

// Compare 1 with 9, 5, 2, shift all → [1, 2, 5, 9, 5, 6]

// Compare 5 with 9, shift 9 → [1, 2, 5, 5, 9, 6]

// Compare 6 with 9, shift 9 → [1, 2, 5, 5, 6, 9]

// Output: [1, 2, 5, 5, 6, 9]

// public class InsertionSort {
//     public static void main(String[] args) {
//         int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
//         insertionSort(arr);
//         System.out.println(Arrays.toString(arr));  // Sorted Array
//     }

//     static void insertionSort(int[] arr) {
//         int n = arr.length;
//         for (int i = 1; i < n; i++) {
//             int current = arr[i];
//             int j = i - 1;
//             while (j >= 0 && arr[j] > current) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }
//             arr[j + 1] = current;
//         }
//     }
// }
// Best Use Cases:
// When the array is already sorted or nearly sorted.

// When working with small datasets or online sorting.

// Advantages:
// Efficient for small or nearly sorted arrays.

// Low overhead due to in-place sorting.

// Simple to implement.

// Disadvantages:
// Inefficient for large datasets (O(n^2) in worst/average case).

// Slower than algorithms like Merge Sort and Quick Sort for larger arrays.

// Summary:
// Insertion Sort is best when the array is small or nearly sorted, as it performs well in those cases.

// It’s an in-place, stable sorting algorithm but becomes inefficient for large datasets due to its quadratic time complexity.
}
