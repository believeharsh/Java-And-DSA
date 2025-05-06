package DSAlgo.Algo.Sorting.SelectionSort;

public class Theory {

// 📘 Selection Sort – Revision Notes
// Here’s a concise and effective set of notes for you to revise anytime:

// 📌 What is Selection Sort?
// Selection Sort is a comparison-based sorting algorithm.

// It divides the array into two parts:

// The sorted part (initially empty)

// The unsorted part (initially the entire array)

// In each iteration, it selects the smallest (or largest) element from the unsorted part and swaps it with the first element of the unsorted part.

// 🔁 How It Works
// For Ascending Order:
// Loop through the array i = 0 to n - 1

// Assume the first element in the unsorted part is the smallest → minIdx = i

// Loop j = i + 1 to n - 1 and find the actual minimum element

// Swap the minimum element with the element at index i

// Repeat until the array is sorted

// For Descending Order:
// Same steps, but instead of the minimum, select the maximum element in the unsorted part.

// ✅ Key Properties
// Property	Value
// Time Complexity	O(n²) in all cases
// Space Complexity	O(1) (in-place)
// Stable?	❌ Not stable (unless modified)
// In-place?	✅ Yes
// Adaptive?	❌ No (doesn’t adapt to already sorted data)

// 🧠 Best Use Cases
// When memory is limited (since it’s in-place)

// For small datasets

// For learning and understanding basic sorting logic

}
