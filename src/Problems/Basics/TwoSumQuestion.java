package SimpleProblems;


// public class TwoSum {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (nums[i] + nums[j] == target) {
//                     return new int[]{i, j};
//                 }
//             }
//         }
//         return new int[]{}; // No solution found
//     }

//     public static void main(String[] args) {
//         TwoSum solution = new TwoSum();

//         int[] nums = {2, 7, 11, 15};
//         int target = 26;
        
//         int[] result = solution.twoSum(nums, target);

//         if (result.length == 2) {
//             System.out.println("Indices: " + result[0] + ", " + result[1]);
//         } else {
//             System.out.println("No solution found");
//         }
//     }
// }


// second Approach 
import java.util.HashMap;
import java.util.Map;

public class TwoSumQuestion {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the value and its index
        Map<Integer, Integer> map = new HashMap<>();
        
        // Iterate over the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If it exists, return the indices of the current number and its complement
                return new int[]{map.get(complement), i};
            }
            
            // Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }
        
        // If no solution is found, throw an exception (though per problem statement, it should not occur)
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSumQuestion solution = new TwoSumQuestion();

        int[] nums = {2, 7, 11, 15};
        int target = 26;

        int[] result = solution.twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}