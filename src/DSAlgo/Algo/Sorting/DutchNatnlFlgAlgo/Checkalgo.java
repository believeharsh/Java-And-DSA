package DSAlgo.Algo.Sorting.DutchNatnlFlgAlgo;
// problem link : https://leetcode.com/problems/sort-colors/

//The Dutch National Flag algorithm is specifically designed to sort an array containing exactly three distinct elements. It is highly efficient for this specific case, but it is not a general-purpose sorting algorithm and will not work correctly on arrays with more than three distinct elements.

import java.util.Arrays;

public class Checkalgo {
    public static void main(String[] args) {
        // int[] arr = {2,0,1,1,2,0} ;
        int[] arr = {2, 0, 0, 1, 2, 1, 1, 0, 2} ;
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
        

    }
    public static void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;
                start++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
               
            }
        }
    }
    
}
