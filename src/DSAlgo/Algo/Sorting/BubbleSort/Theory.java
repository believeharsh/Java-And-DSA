package DSAlgo.Algo.Sorting.BubbleSort;

public class Theory {
    // 📌 Key Points of Bubble Sort

    // Definition:
        // Bubble Sort is a simple comparison-based sorting algorithm. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

    // Working Principle:
        // In each pass, the largest element "bubbles up" to its correct position at the end of the list.

    // Best Case Time Complexity:
        // O(n) (when the array is already sorted — with optimized version using a flag).

    // Average and Worst Case Time Complexity:
        // O(n²) due to the nested loop comparisons and swaps.

    // Space Complexity:
        // O(1) — it is an in-place sorting algorithm (doesn’t use extra space).

    // Stable Sort:
        // ✅ Yes. It preserves the relative order of equal elements.

    // Adaptive:
        // ✅ Yes, only when optimized with a flag that checks if any swaps were made in a pass.

    // Not Suitable for Large Datasets:
        // ❌ Inefficient due to high time complexity for large input sizes.

    // Number of Passes:
        // Up to n-1 passes for n elements.

    // Common Use Cases:

        // Educational purposes.
        // Understanding sorting principles.
        // When dealing with very small or nearly sorted datasets.


    // 🔄 Bubble Sort Implementation Steps

        // 1 .  Start from the beginning of the array.

        // 2 .  Compare adjacent elements:
                // Check if the current element is greater than the next one.        
                // If yes, swap them.

        // 3 .  Continue comparing and swapping adjacent elements until the end of the array is reached.      
                // After the first full pass, the largest element will be at the last position.  

        // 4 .  Repeat the process for the remaining unsorted part of the array:
                // Next pass goes only till the second-last element, then third-last, and so on.
                // You don’t need to check already sorted parts (they are "bubbled to the end").
                
        // 5 .  Optimization (optional but important):
        
                // Use a flag (e.g., swapped = false).
                // Set it to true if any swap happens during a pass.
                // If no swaps occur in a full pass, the array is already sorted — break early to save time.
        
        // 6 .  Stop when all elements are sorted, i.e., no swaps in a full pass.
}
