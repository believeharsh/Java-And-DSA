package DSAlgo.Algo.Sorting.CycleSort;

public class Theory {
    // Cyclic Sort Algorithm
    // Cyclic Sort is a comparison-based sorting algorithm specifically designed for situations where you have a range of numbers from 1 to n (or 0 to n-1) that need to be sorted. It's highly efficient for this specific case, with O(n) time complexity and O(1) space complexity.
    // Core Concept
    // The key insight behind Cyclic Sort is that when you have numbers in a range like 1 to n, each number has a specific position where it should be in the final sorted array. For example, in a 1-indexed array:

    // Number 1 belongs at index 0
    // Number 2 belongs at index 1
    // And so on...

    // How It Works

    // Start with the first element in the array
    // For each element, check if it's in its correct position
    // If not, swap it with the element at its correct position
    // After swapping, stay at the same index and check the new element
    // If the element is already in its correct position, move to the next index
    // Continue until the entire array is sorted

    // When to Use Cyclic Sort
    // Cyclic Sort works best when:

    // You have an array containing numbers in a specific range (like 1 to n or 0 to n-1)
    // All numbers within that range are present (or there's a specific pattern to missing numbers)
    // You need a solution with O(n) time complexity

    // It's particularly useful for solving problems like:

    // Finding missing numbers in a range
    // Finding duplicates in a range
    // Finding the smallest missing positive number


}
