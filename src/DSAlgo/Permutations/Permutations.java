package DSAlgo.Permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        List<List<Integer>> permutations = permute(nums);

        System.out.println(permutations);   // [[1, 2, 3], [1, 3, 2], [2, 1, 3], ...]
    }

    /** Driver: returns all permutations of the given array. */
    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generate(nums, 0, ans);
        return ans;
    }

    /** Recursive helper using in‑place swapping and backtracking. */
    private static void generate(int[] nums, int index, List<List<Integer>> ans) {
        if (index == nums.length) {
            // Make a copy of the current permutation and add it to the answer list
            List<Integer> current = new ArrayList<>(nums.length);
            if(current.)
            for (int n : nums) current.add(n);
            ans.add(current);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);          // place nums[i] at the current index
            generate(nums, index + 1, ans);
            swap(nums, index, i);          // back‑track
        }
    }

    /** Swaps two positions in the array. */
    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
