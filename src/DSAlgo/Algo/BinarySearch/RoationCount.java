package DSAlgo.Algo.BinarySearch;

public class RoationCount {

    public static void main(String[] args) {
        // int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int[] arr = {14, 15, 16, 17, 10 , 11, 12, 13};
        int  ans = pivot(arr) ; 
        System.out.println("This is pivot index " + ans);
        
    }
    static  int pivot(int[] arr){
        int start = 0 ; 
        int end = arr.length - 1 ; 
        while(start < end){
            int mid = start + (end - start) / 2 ; 
            if(arr[mid] >= arr[0]){
                start = mid + 1 ; 
            }
            else{
                end = mid ; 
            }
        }
        return start ; 
    }
}