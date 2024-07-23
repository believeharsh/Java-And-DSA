package DSAlgo.Algo.BinarySearch;

public class FloorOfNum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = floorOfNum(arr, target);
        System.out.println(ans); // this should print index 4 where value is 14 ; 
        
    } 
    // return the index of gratest number <= target ; 
    static int floorOfNum(int[] arr, int target) {
        if(target > arr[arr.length -1 ]){
            return -1 ; 
        }
        int start = 0;
        int end = arr.length - 1;
    
        while (start <= end) {
            int mid = start + (end - start) / 2;
    
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end; 
    }
    
}
