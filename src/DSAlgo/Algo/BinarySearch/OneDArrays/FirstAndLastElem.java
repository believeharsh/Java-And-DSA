package DSAlgo.Algo.BinarySearch.OneDArrays;

import java.util.Arrays;

public class FirstAndLastElem {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10} ; 
        int target = 7 ; 
        System.out.println(Arrays.toString(firstAndLastElem(nums, target)));
        
    } 
    static int[] firstAndLastElem(int[] nums, int target){
        int[] ans = {-1, -1} ; 
        int start = searchfirstOrLast(nums, target , true) ; 
        int end = searchfirstOrLast(nums, target , false) ; 
        ans[0] = start ; 
        ans[1] = end ; 
        return ans ; 

    }

    static int searchfirstOrLast(int[] nums , int target , boolean findStartInd){
        if(target > nums[nums.length -1 ]){
            return -1 ; 
        }
        int ans = -1 ; 
        int start = 0;
        int end = nums.length - 1;
    
        while (start <= end) {
            int mid = start + (end - start) / 2;
    
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid ; 
                if(findStartInd){
                    end = mid - 1 ; 
                }
                else{
                    start = mid + 1 ; 
                }
            }
        }
        return ans ; 

    }
    
}
