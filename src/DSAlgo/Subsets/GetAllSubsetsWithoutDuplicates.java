package DSAlgo.Subsets;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays ; 

public class GetAllSubsetsWithoutDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2};
        Arrays.sort(arr) ; 
        List<List<Integer>> result = new ArrayList<>() ; 
        // ArrayList<Integer> 
        getSubsets(0, arr, new ArrayList<>(), result) ;  
        System.out.println(result);

    }


    static void getSubsets(int index, int[] nums, List<Integer> current , List<List<Integer>> res) {
        if(index == nums.length) {
            res.add(new ArrayList<>(current)) ; 
            return ; 
        }

        current.add(nums[index]) ; // including the element here 
        getSubsets(index + 1 , nums, current, res) ; 

        current.remove(current.size() - 1) ; 

        index++ ; 
        while(index < nums.length && nums[index] == nums[index - 1]) {
            index++ ; 
        }
        getSubsets(index , nums, current, res) ; 
    }
}
