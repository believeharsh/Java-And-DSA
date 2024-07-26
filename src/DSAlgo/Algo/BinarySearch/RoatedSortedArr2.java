package DSAlgo.Algo.BinarySearch;

public class RoatedSortedArr2 {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target = 0 ; 
        System.out.println(search(arr, target)); // This should print true ; 
       
    }
    static boolean search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return true ; 
            }

            // this if condition check for duplicates, if duplicates are there then we shirk the 
            // search space and by skipping rest of the body of the loop, we'll jump into the next iteration.
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start = start + 1;
                end = end - 1;
                continue;
            }
            // now we have two parts of the arr so we check where value lies??
            // let's check first which part is sorted? left half or right half??
            // if first if condition is true then left half is sorted otherise right half
            // is.

            if (arr[start] <= arr[mid]) {
                // checking is the target lies in the sorted part or not??
                if (arr[start] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // this will only execute if the left half is not sorted that means this one is.
                if (arr[mid] < target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false ; 
    }
   
}
