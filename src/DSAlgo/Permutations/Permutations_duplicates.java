package DSAlgo.Permutations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Permutations_duplicates {

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3 }; // all values distinct
        int[] nums2 = { 1, 1, 2 }; // contains duplicates

        System.out.println(permuteUnique(nums1));
        // → [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 2, 1], [3, 1, 2]]

        System.out.println(permuteUnique(nums2));
        // → [[1, 1, 2], [1, 2, 1], [2, 1, 1]]
    }

    /**
     * Driver: returns all *unique* permutations of the given array.
     */
    static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        // Arrays.sort(nums) ; we have to sort an array if we are not using hashset for duplicate elements of array
        generate(nums, 0, ans);
        return ans;
    }

    /**
     * Recursive helper using in‑place swapping, backtracking, and
     * duplicate‑skipping.
     */
    private static void generate(int[] nums, int index, List<List<Integer>> ans) {
        if (index == nums.length) {
            List<Integer> current = new ArrayList<>(nums.length);
            for (int n : nums) {
                current.add(n);
            }
            ans.add(current);
            return;
        }

        // Track which values have already been fixed at position "index" in this level
        HashSet<Integer> seen = new HashSet<>();

        for (int i = index; i < nums.length; i++) {
            // if (seen.contains(nums[i])) {
            // continue; // skip duplicate branch

            // }
            // without using the Hashset of java 
            if (i > index && nums[i] == nums[i - 1])
                continue;
            seen.add(nums[i]);

            swap(nums, index, i); // place nums[i] at the current index
            generate(nums, index + 1, ans);
            swap(nums, index, i); // back‑track
        }
    }

    /**
     * Swaps two positions in the array.
     */
    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
