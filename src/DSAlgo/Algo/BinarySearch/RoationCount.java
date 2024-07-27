package DSAlgo.Algo.BinarySearch;

public class RoationCount {

    public static void main(String[] args) {
        // int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        // int[] arr = {4,5,6,7,0,1,2};
        int[] arr = {11,13,15,17};
        int  ans = pivot(arr) ; 
        System.out.println("array has been roated " + ans + " times ");

        // Index of the smallest interger of the array is equal to the pivot index and also the roatation count 
        // of an array as well 
        
    }
    static  int pivot(int[] nums){
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] < nums[right]) {
                return nums[left];
            }
            int mid = left + (right - left) / 2;
            if (nums[mid] >= nums[left]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left]; 
    }
}