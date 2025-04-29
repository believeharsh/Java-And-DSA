// 🔍 What is Binary Search?
// Binary Search is an efficient searching algorithm that works on a sorted array by repeatedly dividing the search space in half.

// ✅ Requirements:
// The array must be sorted (ascending or descending).

// You can access elements by index (i.e., random access like arrays, not linked lists).

// 🧠 How Binary Search Works (in brief):

    // -->  Set two pointers: start and end.
    // -->  Find the mid = (start + end) / 2.
    // -->  Compare arr[mid] with the target:
    // -->  If arr[mid] == target, return the index.
    // -->  If arr[mid] < target, search in the right half.
    // -->  If arr[mid] > target, search in the left half.
    // -->  Repeat until start > end.


    // 📌 Binary Search - Key Points:

    // 1. Works only on **sorted** arrays (ascending or descending).
    
    // 2. Time Complexity: O(log n)
    //    → Each step cuts the search space in half.
    
    // 3. Space Complexity: O(1) (Iterative version)
    
    // 4. Conditions:
    //    - Use when random access is possible (like arrays).
    //    - Not suitable for unsorted or linked lists (without modification).
    
    // 5. Variants:
    //    - Standard Binary Search → Return index of target.
    //    - Lower Bound → First position where target could appear.
    //    - Upper Bound → First position greater than target.
    //    - Binary search on answer → When array is not given, but a condition is.
    
    // 6. Common Mistake:
    //    - Use `mid = start + (end - start) / 2` to prevent integer overflow.
    
    // 7. Can be implemented:
    //    - Iteratively (preferred in interviews)
    //    - Recursively (less common in practice)
    