package Practice;

import java.util.ArrayList;
import java.util.List;

public class GetAllSubsets {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        // The 'current' list will hold the subset being built in a specific recursive path
        List<Integer> currentSubset = new ArrayList<>();
        // 'allSubsets' will store all the valid subsets found
        List<List<Integer>> allSubsets = new ArrayList<>();
        int index = 0;

        // Start the backtracking process
        generateSubsets(arr, currentSubset, index, allSubsets);

        // Print all generated subsets
        for (List<Integer> subset : allSubsets) {
            System.out.println(subset);
        }
    }

    // This method should ideally be void as it modifies 'allSubsets' by reference
    static void generateSubsets(int[] arr, List<Integer> currentSubset, int index, List<List<Integer>> allSubsets) {
        // Base Case: If the index has reached the end of the array,
        // it means we have considered every element (either included or excluded).
        // The 'currentSubset' now represents a complete subset.
        if (index == arr.length) {
            // IMPORTANT: Add a NEW ArrayList (a copy) of currentSubset to allSubsets.
            // If you add 'currentSubset' directly, it's a reference, and it will be
            // modified later by backtracking, corrupting your results.
            allSubsets.add(new ArrayList<>(currentSubset));
            return; // Stop this recursive path
        }

        // --- Decision 1: Include the current element (arr[index]) ---

        // 1. Make the choice: Add the current element to the subset
        currentSubset.add(arr[index]);

        // 2. Recurse: Move to the next element
        generateSubsets(arr, currentSubset, index + 1, allSubsets);

        // 3. Backtrack: Undo the choice (remove the element)
        // This is crucial. Before exploring the "exclude" path, we must revert
        // 'currentSubset' to its state before including arr[index].
        currentSubset.remove(currentSubset.size() - 1);


        // --- Decision 2: Exclude the current element (arr[index]) ---

        // 1. We've already "unmade" the previous choice, so 'currentSubset'
        //    is now without arr[index].
        // 2. Recurse: Move to the next element without adding the current one.
        generateSubsets(arr, currentSubset, index + 1, allSubsets);

        // No need for further backtracking here as this branch implicitly
        // returns to its caller, which will then handle its own backtracking.
    }
}